package org.beta.curs9.code.abstracted;

public abstract class Animal implements Being {
    public abstract int numberOfLegs();

    public void makesSound() {
        System.out.println("Animal sound");
    }

    @Override
    public void lives() {
        System.out.println("Animal lives");
    }

    @Override
    public void breaths() {
        System.out.println("Animal breaths");
    }
}
