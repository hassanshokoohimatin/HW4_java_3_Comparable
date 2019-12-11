package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("mohammadi",18);
        Student student2 = new Student("sohrabi",19);
        Student student3 = new Student("mirzayi",18);
        Student student4 = new Student("hoseyni",20);
        Student student5 = new Student("rezayi",21);
        Student student6 = new Student("bayat",17);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);

        System.out.println("list of students before sorting...\n");
        System.out.println(list);

        Collections.sort(list);     //The method sort of class Collections sorts the list by age using Comarable interface

        System.out.println("\nlist of students after sorting ascending by age using comparable...\n");
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());

        System.out.println("\nlist of students after sorting descending by age using comparable...\n");
        System.out.println(list);
    }
}
