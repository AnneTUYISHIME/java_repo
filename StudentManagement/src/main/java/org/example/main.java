package org.example;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;



import java.sql.Date;
import java.util.*;

    public class main {
        private static final Scanner scanner = new Scanner(System.in);
        private static final StudentDAO studentDAO = new StudentDAO();
        private static final CourseDAO courseDAO = new CourseDAO();
        private static final MarkDAO markDAO = new MarkDAO();

        public static void main(String[] args) {
            while (true) {
                System.out.println("\n=== Student Management System ===");
                System.out.println("a. Add Student");
                System.out.println("b. View Student");
                System.out.println("c. Update Student");
                System.out.println("d. Delete Student");
                System.out.println("e. Add Course");
                System.out.println("f. Get All Courses");
                System.out.println("g. View Course");
                System.out.println("h. Update Course");
                System.out.println("i. Delete Course");
                System.out.println("j. Add Mark");
                System.out.println("k. View Student Marks");
                System.out.println("l. Update Student Mark");
                System.out.println("m. Delete Student Mark");
                System.out.println("n. Exit");

                String choice = scanner.nextLine();
                switch (choice) {
                    case "a" -> addStudent();
                    case "b" -> viewStudent();
                    case "c" -> updateStudent();
                    case "d" -> deleteStudent();
                    case "e" -> addCourse();
                    case "f" -> getAllCourses();
                    case "g" -> viewCourse();
                    case "h" -> updateCourse();
                    case "i" -> deleteCourse();
                    case "j" -> addOrUpdateMark();
                    case "k" -> viewStudentMarks();
                    case "l" -> addOrUpdateMark(); // same function
                    case "m" -> deleteStudentMark();
                    case "n" -> System.exit(0);
                    default -> System.out.println("Invalid choice.");
                }
            }
        }

        private static void addStudent() {
            System.out.print("First Name: ");
            String fname = scanner.nextLine();
            System.out.print("Last Name: ");
            String lname = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("DOB (yyyy-mm-dd): ");
            Date dob = Date.valueOf(scanner.nextLine());
            studentDAO.create(new Student(fname, lname, email, dob));
        }

        private static void viewStudent() {
            System.out.print("Student ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            Student s = studentDAO.read(id);
            if (s != null) {
                System.out.println("ID: " + s.getId());
                System.out.println("Name: " + s.getFirstName() + " " + s.getLastName());
                System.out.println("Email: " + s.getEmail());
                System.out.println("DOB: " + s.getDateOfBirth());
            } else {
                System.out.println("Student not found.");
            }
        }

        private static void updateStudent() {
            System.out.print("Student ID to update: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("New First Name: ");
            String fname = scanner.nextLine();
            System.out.print("New Last Name: ");
            String lname = scanner.nextLine();
            System.out.print("New Email: ");
            String email = scanner.nextLine();
            System.out.print("New DOB (yyyy-mm-dd): ");
            Date dob = Date.valueOf(scanner.nextLine());
            studentDAO.update(new Student(id, fname, lname, email, dob));
        }

        private static void deleteStudent() {
            System.out.print("Student ID to delete: ");
            int id = Integer.parseInt(scanner.nextLine());
            studentDAO.delete(id);
        }

        private static void addCourse() {
            System.out.print("Course Name: ");
            String name = scanner.nextLine();
            System.out.print("Description: ");
            String desc = scanner.nextLine();
            courseDAO.create(new Course(name, desc));
        }

        private static void getAllCourses() {
            List<Course> courses = courseDAO.readAll();
            for (Course c : courses) {
                System.out.println("ID: " + c.getId() + ", Name: " + c.getName() + ", Desc: " + c.getDescription());
            }
        }

        private static void viewCourse() {
            System.out.print("Course ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            Course c = courseDAO.read(id);
            if (c != null) {
                System.out.println("Name: " + c.getName() + ", Description: " + c.getDescription());
            } else {
                System.out.println("Course not found.");
            }
        }

        private static void updateCourse() {
            System.out.print("Course ID to update: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("New Name: ");
            String name = scanner.nextLine();
            System.out.print("New Description: ");
            String desc = scanner.nextLine();
            courseDAO.update(new Course(id, name, desc));
        }

        private static void deleteCourse() {
            System.out.print("Course ID to delete: ");
            int id = Integer.parseInt(scanner.nextLine());
            courseDAO.delete(id);
        }

        private static void addOrUpdateMark() {
            System.out.print("Student ID: ");
            int studentId = Integer.parseInt(scanner.nextLine());
            System.out.print("Course ID: ");
            int courseId = Integer.parseInt(scanner.nextLine());
            System.out.print("Marks: ");
            float marks = Float.parseFloat(scanner.nextLine());
            markDAO.addOrUpdateMark(new Mark(studentId, courseId, marks));
        }

        private static void viewStudentMarks() {
            System.out.print("Student ID: ");
            int studentId = Integer.parseInt(scanner.nextLine());
            List<Mark> marks = markDAO.getMarksByStudent(studentId);
            if (marks.isEmpty()) {
                System.out.println("No marks found.");
            } else {
                for (Mark m : marks) {
                    System.out.println("Course ID: " + m.getCourseId() + ", Marks: " + m.getMarks());
                }
            }
        }

        private static void deleteStudentMark() {
            System.out.print("Student ID: ");
            int studentId = Integer.parseInt(scanner.nextLine());
            System.out.print("Course ID: ");
            int courseId = Integer.parseInt(scanner.nextLine());
            markDAO.deleteMark(studentId, courseId);
        }
    }


