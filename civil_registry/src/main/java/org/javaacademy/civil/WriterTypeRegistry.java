package org.javaacademy.civil;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import lombok.Value;

@Value
public class WriterTypeRegistry {
    LocalDate date;
    TypeRegistry typeRegistry;
    Set<Citizen> listCitizen;

    public WriterTypeRegistry(LocalDate date, TypeRegistry typeRegistry, Citizen... citizens) {
        this.date = date;
        this.typeRegistry = typeRegistry;
        this.listCitizen = new HashSet<>(Arrays.asList(citizens));
    }
}
