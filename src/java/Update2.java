
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Update2 extends HttpServlet {

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
       

       AddDetails e1 = new AddDetails();

        e1.setId(Id);
        e1.setPc(pc);
        e1.setPn(pn);
        e1.setMd(md);
        e1.setEd(ed);
        e1.setSeller(seller);
        e1.setTotal_stock(total_stock);
        e1.setStock_left(stock_left);
        e1.setPrice(price);
        
        int status = UpdateDetails.update(e1);
if(status > 0){
   response.sendRedirect("ShowDetails");
}
else{
    out.print("Sorry ! Unable to upadte Record");
}
      
out.close();  
       
    }

}
