package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
import java.util.Scanner;

public class PostgresCRUD {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/testdb";
    static final String DB_USER = "your_postgres_username";
    static final String DB_PASSWORD = "your_postgres_password";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            Class.forName("org.postgresql.Driver");
            System.out.println(" Connected to PostgreSQL database!");

            while (true) {
                System.out.println("\n===== USER CRUD MENU =====");
                System.out.println("1. Create User");
                System.out.println("2. Read All Users");
                System.out.println("3. Update User");
                System.out.println("4. Delete User");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // clear buffer

                switch (choice) {
                    case 1:
                        createUser(conn, scanner);
                        break;
                    case 2:
                        readUsers(conn);
                        break;
                    case 3:
                        updateUser(conn, scanner);
                        break;
                    case 4:
                        deleteUser(conn, scanner);
                        break;
                    case 5:
                        System.out.println(" Exiting...");
                        return;
                    default:
                        System.out.println(" Invalid choice!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void createUser(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.executeUpdate();
            System.out.println(" User added!");
        }
    }

    static void readUsers(Connection conn) throws SQLException {
        String sql = "SELECT * FROM users";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- All Users ---");
            while (rs.next()) {
                System.out.printf("%d: %s - %s%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"));
            }
        }
    }

    static void updateUser(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter user ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new email: ");
        String email = scanner.nextLine();

        String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, id);
            int rows = stmt.executeUpdate();

            if (rows > 0) {
                System.out.println(" User updated.");
            } else {
                System.out.println(" User not found.");
            }
        }
    }

    static void deleteUser(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter user ID to delete: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println(" User deleted.");
            } else {
                System.out.println(" User not found.");
            }
        }
    }
}
