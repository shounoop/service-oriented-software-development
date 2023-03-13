package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BAI1Dao extends Dao {

    private static BAI1Dao instance;

    public synchronized static BAI1Dao getInstance() {
        if (instance == null) {
            instance = new BAI1Dao();
        }

        return instance;
    }

    public boolean CheckCreaditCus(String name, String type, String number, String cvc, String expired) {
        try {
            PreparedStatement ps = con.prepareStatement("Select id, paid from tblcreaditcard Where name=? And type=? And number=? And cvc=? And expired=?");
            ps.setString(1, name);
            ps.setString(2, type);
            ps.setString(3, number);
            ps.setString(4, cvc);
            ps.setString(5, expired);

            System.out.println(name + "," + type);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                if (rs.getInt("paid") == 0) {
                    PreparedStatement ps2 = con.prepareStatement("Update tblcreaditcard Set paid = 1 Where id=?;");
                    ps2.setInt(1, rs.getInt("id"));
                    ps2.executeUpdate();
                }

                return true;
            }
            return false;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
