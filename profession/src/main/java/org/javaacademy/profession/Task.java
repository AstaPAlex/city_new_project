package org.javaacademy.profession;


import lombok.*;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Task {
    @NonNull
    String name;
    int hourCount;
    boolean isDone = false;

}
