package org.beta.curs9.homework;

import java.time.LocalDateTime;

public class DatabaseAdmin extends Employee {
    private final String dbTechnology;

    public DatabaseAdmin(String firstName, LocalDateTime birthday, LocalDateTime dayOfEmployment, String position, String dbTechnology) {
        super(firstName, birthday, dayOfEmployment, position);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

}
