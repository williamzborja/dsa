package org.example.functional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MutablePerson {
    private String firstName;
    private String lastName;

    private ArrayList<String> emails;

    public static void badFunction(MutablePerson person) {
        person.setLastName("edited");
        person.setFirstName("hacked");
        person.getEmails().add("mutated@email.com");
    }
}
