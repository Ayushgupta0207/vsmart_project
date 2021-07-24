import java.sql.*;

public class UpdateDetails {
    public static int update(AddDetails e){
        int status = 0;
                try{  
       
        Connection con= GetConDao.getConnection();
       String sql =  "update stock set pc=?,pn=?,md=?,ed=?,seller=?,total_stock=?,stock_left=?,price=?";
       sql += " where Id=? " ;
      
        PreparedStatement ps=con.prepareStatement(sql);  

        
        ps.setString(1,e.getPc());  
        ps.setString(2,e.getPn());  
        ps.setString(3,e.getMd());
        ps.setString(4,e.getEd());
        ps.setString(5,e.getSeller());
        ps.setString(6,e.getTotal_stock());
        ps.setString(7,e.getStock_left());
        ps.setString(8,e.getPrice());
        ps.setString(9,e.getId());

        status = ps.executeUpdate();
        con.close();
                }catch(SQLException ex){
                }
              return status;
    }
}
