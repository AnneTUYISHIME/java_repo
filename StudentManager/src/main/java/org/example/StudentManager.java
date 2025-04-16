package org.example;



import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class StudentManager {
    public StudentManager() {

    }
    // addition method

    public void AddStudent(Map<Integer, String> Student, Integer StudentId, String StudentName) {



        Student.put(StudentId, StudentName);
        System.out.println("this is student map" + Student);
    }
    // sorting method

    public void SortStudent(Map<Integer, String> Student) {
        Map<Integer, String> sortedmap = new TreeMap<>(Student);
        System.out.println("these are sorted student" + sortedmap);

    }

    // searching student method
    public void SearchStudent(Map<Integer, String> Student, Integer StudentID) throws IllegalAccessException {
        if (!Student.containsKey(StudentID) || StudentID < 0) {
            throw new IllegalAccessException("Student id is wrong");
        } else {
            String studentName = Student.get(StudentID);
            System.out.println("Student found: ID = " + StudentID + ", Name = " + studentName);
        }
    }

    // remove method
    public void removeStudent(Map<Integer, String> students, int studentId){

        System.out.println("this is removed : "   + students.remove(studentId));
        System.out.println("this is remmaining  students : " + students);
    }

    // finding with heigstid

         public void findStudentWithHighestId(Map<Integer, String> students) {
             if (students.isEmpty()) {
                 System.out.println("No students found.");
                 return;
             }

             // Get the max key (highest ID)
             Integer highestId = Collections.max(students.keySet());

             // Get the student name using the highest ID
             String studentName = students.get(highestId);

             // Print result
             System.out.println("Student with highest ID:");
             System.out.println("ID: " + highestId + ", Name: " + studentName);
         }

         //findStudentWithLowestId


    public void findStudentWithLowestId(Map<Integer, String> students) {
        if (students == null || students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        Integer lowestId = Collections.min(students.keySet());
        String studentName = students.get(lowestId);

        System.out.println("Student with the lowest ID: " + lowestId + " - " + studentName);
    }


}











