import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Insert extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String Id = request.getParameter("Id");
String pc = request.getParameter("pc");
String pn = request.getParameter("pn");
String md = request.getParameter("md");
String ed = request.getParameter("ed");
String seller = request.getParameter("seller");
String total_stock = request.getParameter("total_stock");
String stock_left = request.getParameter("stock_left");
String price = request.getParameter("price");

AddDetails e = new AddDetails();

e.setId(Id);
e.setPc(pc);
e.setPn(pn);
e.setMd(md);
e.setEd(ed);
e.setSeller(seller);
e.setTotal_stock(total_stock);
e.setStock_left(stock_left);
e.setPrice(price);

int status = SaveDetails.save(e);
if(status > 0){
    response.sendRedirect("ShowDetails");
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("add.html").include(request, response);
}
      
out.close();  
}  
  }
