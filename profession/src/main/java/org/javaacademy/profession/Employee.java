package org.javaacademy.profession;

import java.math.BigDecimal;
import java.math.BigInteger;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.javaacademy.human.Gender;
import org.javaacademy.human.Human;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PROTECTED)
public class Employee extends Human {
    int rate;
    BigDecimal earnedMoney = new BigDecimal(BigInteger.ZERO);

    public Employee(@NonNull String name, @NonNull String surname, @NonNull String patronymic, @NonNull Gender gender) {
        super(name, surname, patronymic, gender);
    }
}
