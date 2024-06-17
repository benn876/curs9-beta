package org.beta.curs9.homework;

import java.time.LocalDateTime;

public class PersonData {
    private final Person person;

    public PersonData(Person person) {
        this.person = person;
    }

    public String getFullName() {
        return person.getFirstName() + "FULLNAME";
    }

    public Integer getAge() {
        return LocalDateTime.now().getYear() - person.getBirthday().getYear();
    }
}
