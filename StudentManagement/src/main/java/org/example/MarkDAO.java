package org.example;

    import java.sql.*;
import java.util.*;

    public class MarkDAO {
        public void addOrUpdateMark(Mark mark) {
            String sql = "INSERT INTO marks (student_id, course_id, marks) VALUES (?, ?, ?) " +
                    "ON CONFLICT (student_id, course_id) DO UPDATE SET marks = EXCLUDED.marks";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, mark.getStudentId());
                stmt.setInt(2, mark.getCourseId());
                stmt.setFloat(3, mark.getMarks());
                stmt.executeUpdate();
                System.out.println("Mark saved.");
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        public List<Mark> getMarksByStudent(int studentId) {
            List<Mark> marks = new ArrayList<>();
            String sql = "SELECT * FROM marks WHERE student_id = ?";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, studentId);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    marks.add(new Mark(
                            rs.getInt("student_id"),
                            rs.getInt("course_id"),
                            rs.getFloat("marks")
                    ));
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
            return marks;
        }

        public void deleteMark(int studentId, int courseId) {
            String sql = "DELETE FROM marks WHERE student_id = ? AND course_id = ?";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, studentId);
                stmt.setInt(2, courseId);
                stmt.executeUpdate();
                System.out.println("Mark deleted.");
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


