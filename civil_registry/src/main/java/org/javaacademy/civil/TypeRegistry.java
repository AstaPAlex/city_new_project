package org.javaacademy.civil;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum TypeRegistry {
    BIRTH_REGISTRATION, MARRIAGE_REGISTRATION, DIVORCE_REGISTRATION;
}
