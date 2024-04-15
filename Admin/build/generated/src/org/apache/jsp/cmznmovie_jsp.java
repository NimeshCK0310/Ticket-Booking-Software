package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class cmznmovie_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"with=device-width, initial-scale=1.0\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"movie.css\">\n");
      out.write("    </head>\n");
      out.write("      ");

            Connection con = null;
            PreparedStatement st = null;
            ResultSet rs = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/abccinema","root","");
                String sql = "SELECT * FROM commingsoon";
                st = con.prepareStatement(sql);
                rs = st.executeQuery();
                while(rs.next()){
                   
                    String mid= rs.getString("mid ");
                    String title = rs.getString("title");
                    String director = rs.getString("director");
                    String writer = rs.getString("writter");
                    String description = rs.getString("description");
                    String mimage = rs.getString("image");
                    


        
      out.write("\n");
      out.write("        \n");
      out.write("        <body>\n");
      out.write("       \n");
      out.write("           \n");
      out.write("            <section class=\"header\">\n");
      out.write("                <nav style=\"background-color: black;\">\n");
      out.write("                 <p class=\"log\"><b><a href=\"#\"> <img src=\"abclogo.png\" alt=\"\" width=\"90px\" height=\"90px\"></a></b></p>\n");
      out.write("                    <div class=\"nav-links\" id=\"navLinks\">\n");
      out.write("                        <i class=\"fa fa-times\" onclick=\"hideMenu()\"></i>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("                            <li><a href=\"movie.jsp\">Movies</a></li>\n");
      out.write("                            <li><a href=\"movieadd.jsp\">Movie Add</a></li>\n");
      out.write("                            <li><a href=\"update.jsp\">Update Movie</a></li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <i class=\"fa fa-bars\" onclick=\"showMenu()\"></i>\n");
      out.write("                </nav>\n");
      out.write("                <hr>\n");
      out.write("                 <form acion=\"config\" method=\"post\">\n");
      out.write("                <button class=\"button\" ><a href=\"movieadd.jsp\">+Add Movies</a> </button>\n");
      out.write("            \n");
      out.write("                <br>                \n");
      out.write("\n");
      out.write("            \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"row-image\" >\n");
      out.write("                        <img src=\"logo.jpeg\" style=\"width:244px; height:363px;  margin-left: 100px;\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row-one\">\n");
      out.write("                        <p><div class=\"green\">Movie Id <br><br><br>\n");
      out.write("                            Movie Title:<br><br><br>\n");
      out.write("                            Director :<br><br><br>");
      out.print(mid);
      out.write("\n");
      out.write("                            Writer :<br><br><br>\n");
      out.write("                           \n");
      out.write("                            Description:\n");
      out.write("                        </div></p></div>\n");
      out.write("                        <div class=\"row-two\">\n");
      out.write("                            <br><p>");
      out.print(mid);
      out.write("<br><br><br>\n");
      out.write("                            ");
      out.print(title);
      out.write("<br><br><br>\n");
      out.write("                            ");
      out.print(director);
      out.write("<br><br><br>\n");
      out.write("                            ");
      out.print(writer);
      out.write("\n");
      out.write("                            <br><br><br>\n");
      out.write("                            <p>");
      out.print(description);
      out.write("</p>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"submit\">\n");
      out.write("                     <button class=\"button1\" ><a href=\"update.jsp\">Edit</a> </button>\n");
      out.write("                    <button class=\"button2\" ><a href=\"movied.jsp\">Delete</a> </button>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <br><br>\n");
      out.write("                <hr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <br><br><br>\n");
      out.write("                \n");
      out.write("                <br><br>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("         <script>\n");
      out.write("            var navLinks = document.getElementById(\"navLinks\");\n");
      out.write("            function showMenu(){\n");
      out.write("                navLinks.style.right = \"0\";\n");
      out.write("            }\n");
      out.write("            function hideMenu(){\n");
      out.write("                navLinks.style.right = \"-200px\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("         <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("            ");

                }
            } catch (Exception e) {
                out.println(e);
            } 
      out.write("\n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
