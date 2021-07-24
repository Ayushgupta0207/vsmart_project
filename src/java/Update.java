import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Update extends HttpServlet {  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter(); 
out.println("<html>");
 out.println("<title>Upadte</title>");   
 out.print("<link rel='stylesheet' type='text/css' href='style.css'>");
 out.println("<body bgcolor>");
out.println("<h1 class='heading' align='center'>Upadte Details</h1>");
String Id = request.getParameter("Id");


AddDetails e = SelectDetails.getAllDetailsById(Id);
out.print("<form action='Update2' method='post' >");
out.print("<table>");
out.print("<tr><td></td><td><input type='hidden' name='Id' value='"+e.getId()+"'/></td></tr>");
out.print("<tr><td></td><td><input type='text' name='pc' value='"+e.getPc()+"'/></td></tr>");
out.print("<tr><td></td><td><input type='text' name='pn' value='"+e.getPn()+"'/></td></tr>");
out.print("<tr><td></td><td><input type='text' name='md' value='"+e.getMd()+"'/></td></tr>");
out.print("<tr><td></td><td><input type='text' name='ed' value='"+e.getEd()+"'/></td></tr>");
out.print("<tr><td></td><td><input type='text' name='seller' value='"+e.getSeller()+"'/></td></tr>");
out.print("<tr><td></td><td><input type='text' name='total_stock' value='"+e.getTotal_stock()+"'/></td></tr>");
out.print("<tr><td></td><td><input type='text' name='stock_left' value='"+e.getStock_left()+"'/></td></tr>");
out.print("<tr><td></td><td><input type='text' name='price' value='"+e.getPrice()+"'/></td></tr>");
out.print("<tr><td></td><td><input type='submit' name='Update2' value='Edit & Save'/></td></tr>");
out.println("</body>");
out.println("</html");


out.close();  
}  
  }
