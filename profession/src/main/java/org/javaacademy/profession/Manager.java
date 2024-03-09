package org.javaacademy.profession;

import lombok.NonNull;
import org.javaacademy.human.Gender;

public class Manager extends Employee {
    static final int RATE = 10_000;
    public Manager(@NonNull String name, @NonNull String surname, @NonNull String patronymic, @NonNull Gender gender) {
        super(name, surname, patronymic, gender);
        rate = RATE;
    }
}
