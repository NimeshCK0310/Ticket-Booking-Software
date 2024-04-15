package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class cfeedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/67c66657c7.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/ce4d183c2.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/fav-icon.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"cfeedback.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Connection con = null;
            PreparedStatement st = null;
            ResultSet rs = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/abccinema","root","");
                String sql = "SELECT * FROM cfeedback";
                st = con.prepareStatement(sql);
                rs = st.executeQuery();
                while(rs.next()){
                   
                    String fid= rs.getString("id");
                    String cname = rs.getString("cname");
                    String cemail = rs.getString("email");
                    String cdes = rs.getString("description");
                    
                    


        
      out.write("\n");
      out.write("        <form acion=\"config\" method=\"post\"  >\n");
      out.write("            <section id=\"test\">\n");
      out.write("                <div class=\"test-heading\">\n");
      out.write("                    <span>Comments</span>\n");
      out.write("                    <h1>Client Says</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"test-box-container\">\n");
      out.write("                    <div class=\"test-box\">\n");
      out.write("                        <div class=\"box-top\">\n");
      out.write("                            <div class=\"profile\">\n");
      out.write("                                \n");
      out.write("                                <div class=\"name-user\">\n");
      out.write("                                    <strong>");
      out.print(cname);
      out.write("</strong>\n");
      out.write("                                    <span>");
      out.print(cemail);
      out.write("</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"cliet-comment\">\n");
      out.write("                                    <p>");
      out.print(cdes);
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("                 \n");
      out.write("            </section>\n");
      out.write("        </form>\n");
      out.write("          ");

                }
            } catch (Exception e) {
                out.println(e);
            } 
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
