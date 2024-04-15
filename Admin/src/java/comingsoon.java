
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
@WebServlet(urlPatterns = {"/comingsoon"})
public class comingsoon extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet comingsoon</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet comingsoon at " + request.getContextPath() + "</h1>");
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
        String czid=request.getParameter("cid");
        String czname=request.getParameter("cname");
        String czdirector=request.getParameter("cdirector");
        String czwriter=request.getParameter("cwriter");
        String czdes=request.getParameter("cdes");
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
          String sql="INSERT INTO commingsoon(mid,title,director,writter,description,image) VALUES(?,?,?,?,?,?)";
          PreparedStatement statement=con.prepareStatement(sql);
          statement.setString(1, czid);
          statement.setString(2,czname);
          statement.setString(3,czdirector);
          statement.setString(4,czwriter);
          statement.setString(5,czdes);
          
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
