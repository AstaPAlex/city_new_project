package org.javaacademy.civil;

import org.javaacademy.human.Gender;

import java.time.LocalDate;
import java.time.Month;

public class RunnerTest {
    public static void main(String[] args) {
        CivilRegistry civilRegistry = new CivilRegistry("TEST_ZAGS ");
        Citizen man1 = new Citizen("Алексей", "Иванов", "Иванович", Gender.MAN);
        Citizen woman1 = new Citizen("Алексей", "Иванов", "Иванович", Gender.WOMAN);
        LocalDate date1 = LocalDate.of(2024, Month.JANUARY, 13);
        civilRegistry.registrationMarriage(man1, woman1, date1);
        civilRegistry.registrationDivorce(man1, woman1, date1);
        civilRegistry.registrationMarriage(man1, woman1, date1);
        civilRegistry.birthChild(man1, woman1, date1);
        civilRegistry.birthChild(man1, woman1, date1);
        civilRegistry.birthChild(man1, woman1, date1);
        civilRegistry.getReport();
    }
}
