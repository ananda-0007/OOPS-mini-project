package main.db;

import java.sql.*;

public class DatabaseConnector {
    public static Connection connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found.");
        }
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/taxi_booking", "root", "");
    }
}
