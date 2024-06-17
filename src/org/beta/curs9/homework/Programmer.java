package org.beta.curs9.homework;

import java.time.LocalDateTime;

public class Programmer extends Employee {
    private final String language;

    public Programmer(String firstName, LocalDateTime birthday, LocalDateTime dayOfEmployment, String position, String language) {
        super(firstName, birthday, dayOfEmployment, position);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getPosition() {
        return "programmer";
    }
}
