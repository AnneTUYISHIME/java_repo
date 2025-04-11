package org.example;

import java.util.Arrays;


public class Grademanager {

    public Grademanager() {
    }

    // int[] grades = new int[10];
    public  void printGrade(int[] grades) {
        for (int grade : grades) {
            System.out.println(grade);
        }
    }

    public  void sortGrade(int[] grades){
        // for (int i = 0; i < grades.length; i++) {
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));

    }
    public  int SearchGrade(int[] grades, int target) {
        for (int i=0;i<grades.length;i++) {
            if (grades[i] == target) {
                return i;
            }

        } return -1;

    }

    public  void  getGrades(int[] grades,int index){
        //for (int i=0;i<grades.length;i++) {
            if (index > grades.length - 1 || index < 0) {
                throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds for array length " + grades.length);
               // System.out.println("out of bo
            }
        System.out.println("Grade found at index " + index + " is: " + grades[index]);
        }
    }






