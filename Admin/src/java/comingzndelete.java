/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

/**
 *
 * @author Darshana
 */
@MultipartConfig(maxFileSize =16177215)
@WebServlet(urlPatterns = {"/comingzndelete"})
public class comingzndelete extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet comingzndelete</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet comingzndelete at " + request.getContextPath() + "</h1>");
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
        String cid=request.getParameter("cmzid");
        
        PrintWriter out=response.getWriter();
        
        Connection con=null;
        Statement st=null;
         try
        {
          Class.forName("com.mysql.jdbc.Driver");
          con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/abccinema","root","");
          st=con.createStatement();
          
          String qry="DELETE FROM commingsoon WHERE mid='"+cid+"'";
          
          st.execute(qry);
          out.print("Data deleted succefully");
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
