package org.javaacademy.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.javaacademy.profession.*;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Company {
    final String name;
    final Set<Programmer> programmers = new HashSet<>();
    final Map<Employee, Double> timesheet = new HashMap<>();
    final MultiMap<Programmer, Task> completedTasksProgrammers = new MultiValueMap<>();
    Manager manager;
    int generalRate;
    BigDecimal totalCoast = new BigDecimal(BigInteger.ZERO);

    public Company(String name, int generalRate) {
        this.name = name;
        this.generalRate = generalRate;
    }

    private Double resetTime() {
        return 0.00;
    }

    public void addProgrammer(Programmer programmer) {
        programmers.add(programmer);
        timesheet.put(programmer, resetTime());
        programmer.setRate(generalRate);
    }

    public void addManager(Manager manager) {
        this.manager = manager;
        timesheet.put(manager, resetTime());
    }

    public void doWeekWork(Queue<Task> tasks) {
        while (tasks.peek() != null) {
            doWorkTask(tasks);
        }
    }

    private void doWorkTask(Queue<Task> tasks) {
        for (Programmer programmer : programmers) {
            Task task = tasks.poll();
            if (task == null) {
                return;
            }
            programmer.setDoneTask(task);
            completedTasksProgrammers.put(programmer, task);
            timesheet.put(
                    programmer,
                    timesheet.get(programmer) + task.getHourCount());
            timesheet.put(
                    manager,
                    timesheet.get(manager) + task.getHourCount() * 0.1);
        }
    }

    public void payForWeek() {
        timesheet.forEach((key, value) -> totalCoast = totalCoast.add(payMoney(key)));
    }

    private BigDecimal payMoney(Employee employee) {
        BigDecimal weeklyPayment = BigDecimal.valueOf(timesheet.get(employee) * employee.getRate());
        employee.setEarnedMoney(employee.getEarnedMoney().add(weeklyPayment));
        timesheet.put(employee, resetTime());
        return weeklyPayment;
    }

    public void showInfo() {
        System.out.printf("%s\nЗатраты: %.2f\n", name, totalCoast);
        completedTasksProgrammers
                .forEach((key, value) -> System.out.printf("%s - %s\n", key.getFullName(), value));
    }

}
