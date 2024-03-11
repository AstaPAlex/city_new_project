package org.javaacademy.company;

import java.util.ArrayDeque;
import java.util.Queue;
import org.javaacademy.human.Gender;
import org.javaacademy.profession.Manager;
import org.javaacademy.profession.Programmer;
import org.javaacademy.profession.Task;

public class Runner {
    public static void main(String[] args) {
        Company company = new Company(args[0], Integer.parseInt(args[1]));
        Programmer programmer1 = new Programmer("Иван", "Иванов", "Федорович", Gender.MAN);
        Programmer programmer2 = new Programmer("Роман", "Романов", "Романович", Gender.MAN);
        Manager manager = new Manager("Петр", "Петров", "Петрович", Gender.MAN);
        company.addManager(manager);
        company.addProgrammer(programmer1);
        company.addProgrammer(programmer2);
        Task task1 = new Task("Задача1", 10);
        Task task2 = new Task("Задача2", 15);
        Task task3 = new Task("Задача3", 20);
        Queue<Task> tasks = new ArrayDeque<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        company.doWeekWork(tasks);
        company.payForWeek();
        company.showInfo();
    }
}
