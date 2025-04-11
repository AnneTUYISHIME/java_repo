

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Grademanager A = new Grademanager();  // Create object

        int[] grades = {50, 77, 92, 45, 67};

        System.out.println("Displayed arrays are:");
        A.printGrade(grades);

        A.sortGrade(grades);
       System.out.println("grade found is  :" +A.SearchGrade(grades,45));
        try{
            A.getGrades(grades,2);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        }

    }
}

