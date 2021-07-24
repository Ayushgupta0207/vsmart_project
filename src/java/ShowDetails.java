
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ShowDetails extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
            out.print("<link rel='stylesheet' type='text/css' href='style.css'>");
            
           out.println("<h1 class='heading' align='center'>Updated Stock Details</h1>");
           
           List<AddDetails> list = SelectDetails.getAllDetails();
           
           out.print("<table bgcolor='white'>");
           out.print("<tr><th>Product Id</th> <th>Product catagory</th> <th>Product Name</th> <th>Mfd. date</th> <th>Exp. date</th> <th>Seller</th> <th>Total Stock</th> <th>Stock Left</th> <th>Price</th> <th>Edit</th> <th>Delete</th></tr>");
           
           for(AddDetails e : list ){
               out.print("<tr><td>"+e.getId()+"</td><td>"+e.getPc()+"</td><td>"+e.getPn()+"</td><td>"+e.getMd()+"</td><td>"+e.getEd()+"</td><td>"+e.getSeller()+"</td><td>"
               +e.getTotal_stock()+"</td><td>"+e.getStock_left()+"</td><td>"+e.getPrice()+"</td><td><a href='Update?Id="+e.getId()+" '>edit</a></td><td><a href='DeleteDetails?Id="+e.getId()+"'>remove</a></td></tr>");
        }
            out.print("</table>");
            out.close();
    }

}
