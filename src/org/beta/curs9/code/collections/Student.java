package org.beta.curs9.code.collections;

public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return age%7;
    }
}
