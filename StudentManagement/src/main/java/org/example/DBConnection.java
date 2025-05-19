package org.example;


    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class DBConnection {
        private static final String URL = "jdbc:postgresql://localhost:5432/StudentManagement";
        private static final String USER = "postgres"; // Change this
        private static final String PASSWORD = "Anne123"; // Change this

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
    }


