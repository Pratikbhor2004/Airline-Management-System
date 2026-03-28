package airlinemanagementsystem;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Correct database name + URL
            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/airlinemanagementsystem",
                "root",
                "Pradip@123"   // keep "" if no password, otherwise put your password
            );

            // Create Statement
            s = c.createStatement();

            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}