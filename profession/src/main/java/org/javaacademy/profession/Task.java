package org.javaacademy.profession;


import lombok.*;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@Getter
@Setter
@ToString(of = {"name"})
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Task {
    @NonNull
    String name;
    @NonNull
    int hourCount;
    boolean isDone = false;

}
