package org.beta.curs9.code.abstracted;

public interface Being {
    void lives();
    void breaths();

    default void doSomething(){
        System.out.println("do something");
    }
}
