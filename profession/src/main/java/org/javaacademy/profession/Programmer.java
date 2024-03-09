package org.javaacademy.profession;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import org.javaacademy.human.Gender;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Programmer extends Employee {
    static final int MIN_RATE = 1_500;
    static final int MAX_RATE = 2_000;
    Task task;

    public Programmer(@NonNull String name, @NonNull String surname, @NonNull String patronymic, @NonNull Gender gender) {
        super(name, surname, patronymic, gender);
    }

    @Override
    public void setRate(int rate) {
        if (rate >= MIN_RATE && rate <= MAX_RATE) {
            this.rate = rate;
            return;
        }
        throw new RuntimeException("Ставка не входит в диапазон");
    }

    public void setDoneTask(Task task) {
        this.task = task;
        task.setDone(true);
        System.out.printf("Задача: \"%s\" - выполнена\n", task.getName());
    }

}
