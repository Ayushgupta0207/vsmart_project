
import java.sql.*;


public class GetConDao {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");  
            
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}
