import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection{
    Connection mySQLConnection;

    DBConnection(){
        try{
            mySQLConnection = DriverManager.getConnection("url", "username", "password");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}