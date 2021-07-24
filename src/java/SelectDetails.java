
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SelectDetails {
    public static AddDetails getAllDetailsById(String Id){
        AddDetails e = new AddDetails();
         try{  
Connection con = GetConDao.getConnection();
PreparedStatement ps=con.prepareStatement("Select * from stock where Id=?");
ps.setString(1, Id);
ResultSet rs = ps.executeQuery();
if(rs.next()){
    e.setId(rs.getString(1));
    e.setPc(rs.getString(2));
    e.setPn(rs.getString(3));
    e.setMd(rs.getString(4));
    e.setEd(rs.getString(5));
    e.setSeller(rs.getString(6));
    e.setTotal_stock(rs.getString(7));
    e.setStock_left(rs.getString(8));
     e.setPrice(rs.getString(9));
    
}
con.close();
    }catch(Exception ex){
        ex.printStackTrace();
    }
         return e;
    }

    public static List<AddDetails> getAllDetails(){
       List<AddDetails> list = new ArrayList<>();
           try{  
Connection con = GetConDao.getConnection();
PreparedStatement ps=con.prepareStatement("Select * from stock");  
ResultSet rs = ps.executeQuery();
while(rs.next()){
    AddDetails e = new AddDetails();
    e.setId(rs.getString(1));
    e.setPc(rs.getString(2));
    e.setPn(rs.getString(3));
    e.setMd(rs.getString(4));
    e.setEd(rs.getString(5));
    e.setSeller(rs.getString(6));
    e.setTotal_stock(rs.getString(7));
    e.setStock_left(rs.getString(8));
     e.setPrice(rs.getString(9));
    list.add(e);
}
con.close();

           }catch(Exception ex){
               out.print("Inavlid");
           }
    return list;
       
    }
    
}
