package org.example;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        StudentManager std = new StudentManager();
        Map<Integer,String> Studentmap = new HashMap<>();
// passing student to be added
        std.AddStudent(Studentmap, 1, "Anne TUYISHIME");
        std.AddStudent(Studentmap, 2, "Ineza Pamella");
        std.AddStudent(Studentmap, 3, "Eric Niyonsenga");
        std.AddStudent(Studentmap, 9, "baba baba");
        std.AddStudent(Studentmap, 4, "um sando");
        std.AddStudent(Studentmap, 4, "uw dalisa");




        // calling sorting method
        std.SortStudent(Studentmap);

        // calling searching method
        try {
            std.SearchStudent(Studentmap,2);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        // calling remove method

        std.removeStudent(Studentmap, 2);

        // calling findStudentWithHighestId

        std.findStudentWithHighestId(Studentmap);

        // calling findStudentWithLowestId

        std.findStudentWithLowestId(Studentmap);





    }
}