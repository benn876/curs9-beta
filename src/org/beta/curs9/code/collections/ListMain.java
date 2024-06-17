package org.beta.curs9.code.collections;

import java.util.*;

public class ListMain {
    public static void main(String[] args) {
        // DON't DO THIS
//        List<Object> objects = new ArrayList<>();
//        objects.add(2);
//        objects.add("test");
//        objects.add(new Random());


        List<String> arrayList = new ArrayList<>();
        arrayList.add("2");
        arrayList.add("test");
        arrayList.add("lll");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("test");
        linkedList.add("test1");
        linkedList.add("test2");
        linkedList.add("test3");

        int[] array = new int[10];
        array[4] = 45;

        System.out.println(array[4]);

        for(String variable: arrayList){
            System.out.println(variable);
        }

        System.out.println(arrayList.get(1));
        System.out.println("---------------------------------------------------------------");
        arrayList.remove("2");

        for(String variable: arrayList){
            System.out.println(variable);
        }
        System.out.println(arrayList.indexOf("test"));
        System.out.println(arrayList.contains("lll"));
    }
}
