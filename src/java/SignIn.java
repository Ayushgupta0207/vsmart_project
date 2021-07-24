import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class SignIn extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String username=request.getParameter("username");  
String email=request.getParameter("email");  
String password=request.getParameter("password");  
String password2=request.getParameter("password2");  
          
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/employee", "root", "");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into login values(?,?,?,?)");  
  
ps.setString(1,username);  
ps.setString(2,email);  
ps.setString(3,password);  
ps.setString(4,password2);  
          
int i=ps.executeUpdate();  
if(i>0)  
out.print("<h1>You are successfully registered...</h1>" + "<h1><a href='index.html'>Go back for Login</a></h1>");   
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  }
