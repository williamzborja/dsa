package org.example.functional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter
public class LessMutablePerson {
    private final String firstName;
    private final String lastName;

    private final ArrayList<String> emails;

    public static void badFunction(LessMutablePerson person) {
        person.getEmails().add("mutated@email.com");
    }
}
