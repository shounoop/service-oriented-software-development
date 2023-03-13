package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

    public static Connection con;

    private final String jdbcURL = "jdbc:mysql://localhost:3306/";
    private final String dbName = "bai1";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "";
    private final String driver = "com.mysql.jdbc.Driver";

    public Dao() {
        if (con == null) {
            try {
                Class.forName(driver);
                con = DriverManager.getConnection(jdbcURL + dbName, jdbcUsername, jdbcPassword);
                System.out.println("Connection to the database successfully.");
            } catch (SQLException e) {
                System.out.println("Connection to the database failed.");
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("Connection to the database failed.");
                e.printStackTrace();
            }
        }
    }
}
