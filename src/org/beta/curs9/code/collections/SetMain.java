package org.beta.curs9.code.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = List.of(1,2,2,3,3,4,4);
        System.out.println(listOfNumbers);

        Set<Integer> setOfNumbers = new HashSet<>();

        setOfNumbers.add(1);
        setOfNumbers.add(2);
        setOfNumbers.add(2);
        setOfNumbers.add(3);
        setOfNumbers.add(3);
        setOfNumbers.add(4);
        setOfNumbers.add(4);
        System.out.println(setOfNumbers);

        Student mihai = new Student(44, "Mihai");
        Student george = new Student(31,"George");
        Student ana = new Student(31, "Ana");
        System.out.println(mihai.hashCode());
        System.out.println(george.hashCode());
        System.out.println(ana.hashCode());

        HashSet<Student> setOfStudents = new HashSet<>();
        setOfStudents.add(mihai);
        setOfStudents.add(george);
        setOfStudents.add(ana);
        System.out.println(setOfStudents);

        TreeSet<Integer> treeSetOfNumbers = new TreeSet<>();
        treeSetOfNumbers.add(32);
        treeSetOfNumbers.add(11);
        treeSetOfNumbers.add(42);
        treeSetOfNumbers.add(33);
        treeSetOfNumbers.add(61);
        treeSetOfNumbers.add(13);
        System.out.println(treeSetOfNumbers);
        System.out.println(treeSetOfNumbers.descendingSet());
    }

    public class Node<E>{
        E value;
        List<Node<E>> left;
        List<Node<E>> right;
    }
}
