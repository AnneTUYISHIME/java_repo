package org.example;


import java.sql.*;
import java.util.*;

    public class CourseDAO implements CRUDOperations<Course> {

        public void create(Course course) {
            String sql = "INSERT INTO courses (course_name, course_description) VALUES (?, ?)";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, course.getName());
                stmt.setString(2, course.getDescription());
                stmt.executeUpdate();
                System.out.println("Course added.");
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        public Course read(int id) {
            String sql = "SELECT * FROM courses WHERE id = ?";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return new Course(
                            rs.getInt("id"),
                            rs.getString("course_name"),
                            rs.getString("course_description")
                    );
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
            return null;
        }

        public List<Course> readAll() {
            List<Course> courses = new ArrayList<>();
            String sql = "SELECT * FROM courses";
            try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement()) {
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    courses.add(new Course(
                            rs.getInt("id"),
                            rs.getString("course_name"),
                            rs.getString("course_description")
                    ));
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
            return courses;
        }

        public void update(Course course) {
            String sql = "UPDATE courses SET course_name = ?, course_description = ? WHERE id = ?";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, course.getName());
                stmt.setString(2, course.getDescription());
                stmt.setInt(3, course.getId());
                stmt.executeUpdate();
                System.out.println("Course updated.");
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        public void delete(int id) {
            String sql = "DELETE FROM courses WHERE id = ?";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
                System.out.println("Course deleted.");
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


