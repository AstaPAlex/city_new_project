package org.javaacademy.company;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.javaacademy.profession.Programmer;
import org.javaacademy.profession.Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Company {
    private final String name;
    private int generalRate;
    private final Set<Programmer> programmers = new HashSet<>();
    private final Map<Programmer, Integer> timesheet = new HashMap<>();
    private int totalCoast;
    MultiMap<Programmer, Task> completedTasksProgrammers = new MultiValueMap<>();

    public Company(String name, int generalRate) {
        this.name = name;
        this.generalRate = generalRate;
    }

    public void addProgrammer(Programmer programmer) {
        programmers.add(programmer);
        timesheet.put(programmer, 0);
        programmer.setRate(generalRate);
    }


}
