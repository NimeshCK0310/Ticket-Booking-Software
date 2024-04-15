package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>hi</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("         <link rel=\"stylesheet\" href=\"dashboard.css\">\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <form action=\"\" method=\"post\">\n");
      out.write("        <section class=\"header\">\n");
      out.write("            <nav>\n");
      out.write("                <p class=\"log\"><b><a href=\"#\"> <img src=\"abclogo.png\" alt=\"\" width=\"90px\" height=\"90px\"></a></b></p>\n");
      out.write("                <div class=\"nav-links\" id=\"navLinks\">\n");
      out.write("                    <i class=\"fa fa-times\" onclick=\"hideMenu()\"></i>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("                            <li><a href=\"movie.jsp\">Movies</a></li>\n");
      out.write("                            <li><a href=\"movieadd.jsp\">Movie Add</a></li>\n");
      out.write("                            <li><a href=\"update.jsp\">Update Movie</a></li>\n");
      out.write("                        <li></li>\n");
      out.write("                       \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <i class=\"fa fa-bars\" onclick=\"showMenu()\"></i>\n");
      out.write("            </nav>\n");
      out.write("           <hr>\n");
      out.write("            <section>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                      <div class=\"card\">\n");
      out.write("                        <h3>Earning</h3>\n");
      out.write("                        <p>RS:00.00</p>\n");
      out.write("                        <button >Month</button>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <div class=\"card1\">\n");
      out.write("                          <h3>Seat booking</h3>\n");
      out.write("                          <p>Seats = 000</p>\n");
      out.write("                          <button >Month</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <div class=\"card2\">\n");
      out.write("                          <h3>Users</h3>\n");
      out.write("                          <p>No of Users=000</p>\n");
      out.write("                          <button >Month</button>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>       \n");
      out.write("                    <p style=\"color: white;\">Progress of Movies:</p>\n");
      out.write("                \n");
      out.write("                <center> \n");
      out.write("                   <div class=\"card3\">\n");
      out.write("                  <h3 align=\"left\">Movie Title</h3>\n");
      out.write("                  <p> Graph to show the progress</p>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                </div> </center>\n");
      out.write("                <hr size=\"3\" width=\"100%\" color=\"white\">\n");
      out.write("                <div class=\"ticket\">\n");
      out.write("              \n");
      out.write("              <h1>Tickets Details</h1> \n");
      out.write("                \n");
      out.write("                 price of a Full tickets : <label class=\"ft\">Rs.500.00</label> <br><br>\n");
      out.write("                 price of a half tickets : <label class=\"ht\">Rs.500.00</label><br><br>\n");
      out.write("                </div>\n");
      out.write("              \n");
      out.write("              </div>\n");
      out.write("                <div class=\"btn\">\n");
      out.write("                  <button class=\"button con\"  >Edit price</button>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("       </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
