/**
 * Created by Anju on 22/06/2016.
 */


import java.sql.*;

public class UserService {

    private Connection connection = null;
    private PreparedStatement ps1 = null;
    private PreparedStatement ps2 = null;
    private PreparedStatement ps3 = null;
    private PreparedStatement ps4 = null;

    public UserService() {
        connection = new DatabaseConnection().getConn();
    }

    public String register(Users u) {

        try {

            ps1 = connection.prepareStatement("INSERT into customers(fname,lname,username,password,address,contact) VALUES (?,?,?,?,?,?)");
            ps1.setString(1, u.getFname());
            ps1.setString(2, u.getLname());
            ps1.setString(3, u.getUsername());
            ps1.setString(4, u.getPass());
            ps1.setString(5, u.getAddress());
            ps1.setString(6, u.getContact());

            int val = ps1.executeUpdate();

            if (val > 0) {
                return "successful";
            }


        } catch (SQLException e) {

            e.printStackTrace();
        }

        return "failed";

    }


    public String auth(Users user) {

        try {

            System.out.println("service");
            ps2 = connection.prepareStatement("select * from customers WHERE username=? AND password = ?");
            ps2.setString(1, user.getUsername());
            ps2.setString(2, user.getPass());

            ResultSet val = ps2.executeQuery();
            System.out.println("value of resultset" + val);

            if (val.next()) {
                return "successful";
            } else
                return "failed";

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "failed";
    }

    public String record(Menu m) {

        try {


            System.out.println("record");
            ps3 = connection.prepareStatement("INSERT into record(momo_count,chowmin_count,fried_count) VALUES (?,?,?)");
            ps3.setString(1, m.getMomoQuantity());
            ps3.setString(2, m.getChowminQuantity());
            ps3.setString(3, m.getFriedRiceQuantity());

            int val = ps3.executeUpdate();
            System.out.println("val" + val);

            if (val > 0) {
                return "successful";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "failed";

    }

    public String generateReport() {

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from record");

            while (rs.next()) {
                String momo_count = rs.getString("momo_count");
                String chowmin_count = rs.getString("chowmin_count");
                String fried_count = rs.getString("fried_count");
                 System.out.println("chowmin count" + chowmin_count);

                return ( momo_count + " , " + chowmin_count + ", " + fried_count);

                /*menu.setMomoQuantity(momo_count);
                menu.setChowminQuantity(chowmin_count);
                menu.setFriedRiceQuantity(fried_count);*/

            }

        }
        catch (SQLException e) {
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
