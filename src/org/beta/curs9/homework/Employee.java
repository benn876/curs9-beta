package org.beta.curs9.homework;

import java.time.LocalDateTime;

public class Employee implements Person {
    private final String firstName;
    private final LocalDateTime birthday;
    private final LocalDateTime dayOfEmployment;
    private final String position;

    public Employee(String firstName, LocalDateTime birthday, LocalDateTime dayOfEmployment, String position) {
        this.firstName = firstName;
        this.birthday = birthday;
        this.dayOfEmployment = dayOfEmployment;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public LocalDateTime getDayOfEmployment() {
        return dayOfEmployment;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public LocalDateTime getBirthday() {
        return birthday;
    }
}
