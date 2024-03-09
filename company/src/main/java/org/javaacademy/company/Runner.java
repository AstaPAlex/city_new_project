package org.javaacademy.company;

import org.javaacademy.human.Gender;
import org.javaacademy.profession.Manager;
import org.javaacademy.profession.Programmer;
import org.javaacademy.profession.Task;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Runner {
    public static void main(String[] args) {
        Company company = new Company("Подольск", 2000);
        Programmer programmer1 = new Programmer("Иван1","Иваныч1", "Ивнович1", Gender.MAN);
        Programmer programmer2 = new Programmer("Иван2","Иваныч2", "Ивнович2", Gender.MAN);
        Programmer programmer3 = new Programmer("Иван3","Иваныч3", "Ивнович3", Gender.MAN);
        Programmer programmer4 = new Programmer("Иван4","Иваныч4", "Ивнович4", Gender.MAN);
        company.addProgrammer(programmer1);
        company.addProgrammer(programmer2);
        company.addProgrammer(programmer3);
        company.addProgrammer(programmer4);
        Manager manager = new Manager("Петр", "Петрович", "Петрович", Gender.WOMAN);
        company.addManager(manager);
        Task task1 = new Task("Задача1", 10);
        Task task2 = new Task("Задача2", 10);
        Task task3 = new Task("Задача3", 10);
        Task task4 = new Task("Задача4", 10);
        Task task5 = new Task("Задача5", 10);
        Task task6 = new Task("Задача6", 10);
        Task task7 = new Task("Задача7", 10);
        Task task8 = new Task("Задача8", 10);
        Task task9 = new Task("Задача9", 10);
        Task task10 = new Task("Задача10", 10);
        Queue<Task> tasks = new ArrayDeque<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        tasks.add(task6);
        tasks.add(task7);
        tasks.add(task8);
        tasks.add(task9);
        tasks.add(task10);
        company.doWeekWork(tasks);
        System.out.println(company);
        company.payForWeek();
        company.showInfo();

    }
}
