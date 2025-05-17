package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseExample {

    // Database credentials
    static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "your_password_here"; // ← change this

    public static void main(String[] args) {
        Connection conn = null;

        try {
            // 1. Load and register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to the database
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("✅ Connected to the database");

            // 3. Insert a user
            String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                pstmt.setString(1, "Anne TUYISHIME");
                pstmt.setString(2, "anne@example.com");
                pstmt.executeUpdate();
                System.out.println("👤 User inserted successfully");
            }

            // 4. Select all users
            String selectSQL = "SELECT * FROM users";
            try (PreparedStatement pstmt = conn.prepareStatement(selectSQL);
                 ResultSet rs = pstmt.executeQuery()) {

                System.out.println("📋 List of users:");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + ": " +
                            rs.getString("name") + " - " +
                            rs.getString("email"));
                }
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(" Error: " + e.getMessage());
        } finally {
            try {
                if (conn != null) conn.close();
                System.out.println("🔌 Connection closed");
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
