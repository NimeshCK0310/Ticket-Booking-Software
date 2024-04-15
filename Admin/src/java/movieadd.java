

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
@WebServlet(urlPatterns = {"/movieadd"})
public class movieadd extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet movieadd</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet movieadd at " + request.getContextPath() + "</h1>");
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
         PrintWriter out=response.getWriter();
        String id=request.getParameter("id");
        String name=request.getParameter("name");
        String director=request.getParameter("dname");
        String writer=request.getParameter("wname");
        String des=request.getParameter("description");
        InputStream inputStream =null;
        Part filePart =request.getPart("photo");
        if(filePart != null){
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
            
            inputStream =filePart.getInputStream();
             }
        
         Connection con=null;
         Statement st=null;
         String message=null;
         
         try
     {
          DriverManager.registerDriver(new com.mysql.jdbc.Driver());
          con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/abccinema","root","");
          st =con.createStatement();
          String sql="INSERT INTO nowplaying(mid,mtitle,director,writer,description,mimg) VALUES(?,?,?,?,?,?)";
          PreparedStatement statement=con.prepareStatement(sql);
          statement.setString(1, id);
          statement.setString(2,name);
          statement.setString(3,director);
          statement.setString(4,writer);
          statement.setString(5,des);
          
          if(inputStream !=null){
            statement.setBlob(6, inputStream);
          }
           int rw =statement.executeUpdate();
           if(rw >0){
             message="File uploaded and saved into database";
          }
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
