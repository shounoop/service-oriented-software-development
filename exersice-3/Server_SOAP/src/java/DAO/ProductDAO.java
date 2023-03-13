/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;

/**
 *
 * @author lcmin
 */
public class ProductDAO extends DAO {

    public ProductDAO() {
        super();
    }

    public boolean checkProduct(String name, int amount) throws SQLException {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM product WHERE name = ?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getInt("amount") >= amount) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
