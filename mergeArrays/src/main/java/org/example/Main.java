package org.example;

import java.util.Arrays;

import static org.example.GenericArrayUtility.mergeArrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            Integer[] first = {1,2,3,4,5};
            Integer[] second = {4, 5, 6};

            // testing with integer
            Integer[] merged = GenericArrayUtility.mergeArrays(first, second);

            // Print the merged array
            System.out.print("Merged Array: ");
            System.out.println(Arrays.toString( merged));

            System.out.println();
            // testing with the string
            String[] st1 = {"apple", "banana", "mango"};
            String[] st2 = {"didos", "embe", "fruits"};
            String[] merged1 = GenericArrayUtility.mergeArrays(st1, st2);
            System.out.print("Merged Array: ");
            System.out.println(Arrays.toString( merged1));


            }
        }





