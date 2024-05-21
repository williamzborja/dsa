package org.example.functional;

import java.util.List;

import static java.util.Collections.unmodifiableList;


public record ImmutablePerson(String firstName, String lastName, List<String> emails) {

    public ImmutablePerson(String firstName, String lastName, List<String> emails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emails = unmodifiableList(emails);
    }

    public static void badFunction(ImmutablePerson person) {
        person.emails().add("mutated@email.com");
    }
}


