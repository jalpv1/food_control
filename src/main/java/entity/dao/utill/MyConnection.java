package entity.dao.utill;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class MyConnection {
    private static String url = "jdbc:postgresql://localhost:5432/food_control";
    private static String user = "postgres";
    private static String password = "123";

    public static Connection gettingConnection(){
        try{

            Connection connection = null;
            connection = DriverManager.getConnection(url,user,password);
            return connection;
        }
        catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
