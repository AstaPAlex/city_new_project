package org.javaacademy.profession;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.javaacademy.human.Gender;
import org.javaacademy.human.Human;

import java.math.BigDecimal;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PROTECTED)
public class Employee extends Human {
    int rate;
    BigDecimal earnedMoney;

    public Employee(@NonNull String name, @NonNull String surname, @NonNull String patronymic, @NonNull Gender gender) {
        super(name, surname, patronymic, gender);
    }
}
