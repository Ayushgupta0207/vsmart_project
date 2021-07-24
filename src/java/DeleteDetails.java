
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteDetails extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String sid = request.getParameter("Id");
        //int Id = Integer.parseInt(sid);
        Delete.delete(sid);
        response.sendRedirect("ShowDetails");
        
        
        
    }

    

}
