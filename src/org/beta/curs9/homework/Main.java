package org.beta.curs9.homework;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Programmer aProgrammer = new Programmer(
                "Mihai",
                LocalDateTime.of(1990, Month.APRIL,12,22,23,11),
                LocalDateTime.now(),
                "whatever",
                "Java"
        );

//        Person person = new Employee();
//        Person anotherPerson = new Programmer();
//        Person anotherAnotherPerson = new DatabaseAdmin();

        System.out.println(aProgrammer.getPosition());
        PersonData personData = new PersonData(aProgrammer);
        System.out.println(personData.getFullName());
        System.out.println(personData.getAge());
    }
}
