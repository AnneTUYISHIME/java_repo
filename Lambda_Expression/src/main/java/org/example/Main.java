package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Mix of even and odd numbers
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original List: " + list1);
        System.out.println("Even Numbers List: " + EvenNumberFilter.filterEvenNumbers(list1));
        System.out.println();


        List<Integer> list2 = Collections.emptyList();
        System.out.println("Original List: " + list2);
        System.out.println("Even Numbers List: " + EvenNumberFilter.filterEvenNumbers(list2));
        System.out.println();

        //  List with only odd numbers
        List<Integer> list3 = Arrays.asList(1, 3, 5, 7, 9);
        System.out.println("Original List: " + list3);
        System.out.println("Even Numbers List: " + EvenNumberFilter.filterEvenNumbers(list3));
    }
}


