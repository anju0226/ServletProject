/**
 * Created by Anju on 22/06/2016.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection{

    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/dbname";
    private String username = "root";
    private String password = "";
    private Connection connection = null;

    public DatabaseConnection(){

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database Successfully Connected");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("unsuccessful");

        }catch (SQLException e){

            e.printStackTrace();
        }
    }

    public Connection getConn(){
        return connection;
    }
}
