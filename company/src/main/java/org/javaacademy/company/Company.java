package org.javaacademy.company;

import lombok.Cleanup;
import lombok.ToString;
import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.javaacademy.profession.*;

import java.util.*;
public class Company {
    private final String name;
    private Manager manager;
    private int generalRate;
    private final Set<Programmer> programmers = new HashSet<>();
    private final Map<Employee, Double> timesheet = new HashMap<>();
    private Double totalCoast;
    MultiMap<Programmer, Task> completedTasksProgrammers = new MultiValueMap<>();

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

    private void doWorkTask(Queue<Task> tasks){
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
        programmers.stream()
                .map(timesheet::get)
                .forEach(e -> {
                    totalCoast = e;
                    e = 0.00;
                });
    }

    public void showInfo() {
        System.out.printf("%s\nЗатраты: %.2f\n", name, totalCoast);
        completedTasksProgrammers.forEach((key, value) -> {
            System.out.print(key.getFullName() + " - ");
            System.out.println(value);
        });
    }


}
