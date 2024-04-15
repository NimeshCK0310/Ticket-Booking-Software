

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;


@MultipartConfig(maxFileSize =16177215)
@WebServlet(urlPatterns = {"/upcomingzoon"})
public class upcomingzoon extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet upcomingzoon</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet upcomingzoon at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String cmznid=request.getParameter("cmid");
        String cmznname=request.getParameter("cmname");
        String cmzndname=request.getParameter("cmdnam");
        String cmznwname=request.getParameter("cmid");
        String cmzndes=request.getParameter("cmdes");
        
        PrintWriter out=response.getWriter();
        
        Connection con=null;
        Statement st=null;
         try
        {
          Class.forName("com.mysql.jdbc.Driver");
          con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/abccinema","root","");
          st=con.createStatement();
          
         String qry="UPDATE commingsoon SET title='"+cmznname+"',director='"+cmzndname+"',writter='"+cmznwname+"',description='"+cmzndes+"' where mid='"+cmznid+"'";
          
          st.execute(qry);
          out.print("Coming soon Movie data updated succefully ");
          response.sendRedirect("movie.jsp");
        }
        catch(Exception e)
        {
          out.print(e);
        }
    
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
