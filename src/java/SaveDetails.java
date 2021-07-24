
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class SaveDetails {
    public static int save(AddDetails e){
        int status = 0;
        try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/employee", "root", "");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into stock values(?,?,?,?,?,?,?,?,?)" );  
  
ps.setString(1,e.getId());  
ps.setString(2,e.getPc());  
ps.setString(3,e.getPn());  
ps.setString(4,e.getMd());
ps.setString(5,e.getEd());
ps.setString(6,e.getSeller());
ps.setString(7,e.getTotal_stock());
ps.setString(8,e.getStock_left());
ps.setString(9,e.getPrice());
          
status = ps.executeUpdate();
con.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
      return status;
    }
}
