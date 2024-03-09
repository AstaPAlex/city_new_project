package org.javaacademy.civil;

import org.javaacademy.human.Gender;

import java.time.LocalDate;
import java.time.Month;

public class Runner {
    public static void main(String[] args) {
        CivilRegistry civilRegistry = new CivilRegistry("Подольск");
        Citizen man1 = new Citizen("Алексей", "Иванов", "Иванович", Gender.MAN);
        Citizen man2 = new Citizen("Алексей", "Иванов", "Иванович", Gender.MAN);
        Citizen man3 = new Citizen("Алексей", "Иванов", "Иванович", Gender.MAN);
        Citizen man4 = new Citizen("Алексей", "Иванов", "Иванович", Gender.MAN);
        Citizen man5 = new Citizen("Алексей", "Иванов", "Иванович", Gender.MAN);

        Citizen woman1 = new Citizen("Алексей", "Иванов", "Иванович", Gender.WOMAN);
        Citizen woman2 = new Citizen("Алексей", "Иванов", "Иванович", Gender.WOMAN);
        Citizen woman3 = new Citizen("Алексей", "Иванов", "Иванович", Gender.WOMAN);
        Citizen woman4 = new Citizen("Алексей", "Иванов", "Иванович", Gender.WOMAN);
        Citizen woman5 = new Citizen("Алексей", "Иванов", "Иванович", Gender.WOMAN);

        LocalDate date1 = LocalDate.of(2024, Month.JANUARY, 13);
        LocalDate date2 = LocalDate.of(2024, Month.JANUARY, 14);
        LocalDate date3 = LocalDate.of(2024, Month.JANUARY, 15);

        civilRegistry.birthChild(man1, woman1, date1);
        civilRegistry.registrationMarriage(man1, woman1, date1);
        civilRegistry.registrationDivorce(man1, woman1, date1);
        civilRegistry.birthChild(man1, woman1, date2);
        civilRegistry.registrationMarriage(man1, woman1, date2);
        civilRegistry.registrationDivorce(man1, woman1, date2);
        civilRegistry.birthChild(man1, woman1, date2);
        civilRegistry.registrationMarriage(man1, woman1, date2);
        civilRegistry.registrationDivorce(man1, woman1, date2);
        civilRegistry.birthChild(man1, woman1, date3);
        civilRegistry.registrationMarriage(man1, woman1, date3);
        civilRegistry.registrationDivorce(man1, woman1, date3);
        civilRegistry.getReport();

    }
}
