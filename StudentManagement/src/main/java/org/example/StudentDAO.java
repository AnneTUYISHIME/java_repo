package org.example;


import java.sql.*;
import java.util.*;

    public class StudentDAO implements CRUDOperations<Student> {
        public void create(Student student) {
            String sql = "INSERT INTO students (first_name, last_name, email, date_of_birth) VALUES (?, ?, ?, ?)";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, student.getFirstName());
                stmt.setString(2, student.getLastName());
                stmt.setString(3, student.getEmail());
                stmt.setDate(4, student.getDateOfBirth());
                stmt.executeUpdate();
                System.out.println("Student added.");
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        public Student read(int id) {
            String sql = "SELECT * FROM students WHERE id = ?";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return new Student(
                            rs.getInt("id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getString("email"),
                            rs.getDate("date_of_birth")
                    );
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
            return null;
        }

        public List<Student> readAll() {
            List<Student> list = new ArrayList<>();
            String sql = "SELECT * FROM students";
            try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement()) {
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    list.add(new Student(
                            rs.getInt("id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getString("email"),
                            rs.getDate("date_of_birth")
                    ));
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
            return list;
        }

        public void update(Student student) {
            String sql = "UPDATE students SET first_name = ?, last_name = ?, email = ?, date_of_birth = ? WHERE id = ?";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, student.getFirstName());
                stmt.setString(2, student.getLastName());
                stmt.setString(3, student.getEmail());
                stmt.setDate(4, student.getDateOfBirth());
                stmt.setInt(5, student.getId());
                stmt.executeUpdate();
                System.out.println("Student updated.");
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        public void delete(int id) {
            String sql = "DELETE FROM students WHERE id = ?";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
                System.out.println("Student deleted.");
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


