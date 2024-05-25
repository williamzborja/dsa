package org.example.functional;

import java.util.ArrayList;
import java.util.List;

public record ImmutablePerson_2(String firstName, String lastName, List<String> emails) {
    
    @Override
    public List<String> emails() {
        return new ArrayList<>(emails);
    }

    @SuppressWarnings("WriteOnlyObject")
    public static void badFunction(ImmutablePerson_2 person) {
        person.emails().add("mutated@email.com");
    }
}
