/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lcm
 */
public class DAO {

    public static Connection con;

    private final String jdbcURL = "jdbc:mysql://localhost:3306/bai3";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "";

    public DAO() {
        if (con == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
                System.out.println("Connection the database successfully");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Connection the database failed");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println("Connection the database failed");
            }
        }
    }
}
