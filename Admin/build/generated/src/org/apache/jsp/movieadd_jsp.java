package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class movieadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ABC Cinema admin</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\"href=\"movieadd.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"header\">\n");
      out.write("            <nav>\n");
      out.write("             <p class=\"log\"><b><a href=\"#\"> <img src=\"abclogo.png\" alt=\"\" width=\"90px\" height=\"90px\"></a></b></p>\n");
      out.write("                <div class=\"nav-links\" id=\"navLinks\">\n");
      out.write("                    <i class=\"fa fa-times\" onclick=\"hideMenu()\"></i>\n");
      out.write("                    <ul>\n");
      out.write("                         <ul>\n");
      out.write("                        <li><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("                            <li><a href=\"movie.jsp\">Movies</a></li>\n");
      out.write("                            <li><a href=\"movieadd.jsp\">Movie Add</a></li>\n");
      out.write("                            <li><a href=\"update.jsp\">Update Movie</a></li>\n");
      out.write("                       \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <i class=\"fa fa-bars\" onclick=\"showMenu()\"></i>\n");
      out.write("            </nav>\n");
      out.write("            <hr>\n");
      out.write("        <br><br><br><br><br><br><br><br>\n");
      out.write("        <section>\n");
      out.write("            \n");
      out.write("    \n");
      out.write("        <div class=\"container border border-danger\">\n");
      out.write("            <center><h1 style=\"color:white;\">NOW SHOWING MOVIES</h1></center>\n");
      out.write("            <br>\n");
      out.write("            <form action=\"movieadd\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\" style=\"color:white\">Movie ID</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Movie ID\" name=\"id\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\" style=\"color:white\">Movie Name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Movie Name\" name=\"name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\" style=\"color:white\">Director Name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Director\" name=\"dname\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\" style=\"color:white\">Writer Name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Writter\" name=\"wname\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\" style=\"color:white\">Description</label>\n");
      out.write("                <textarea class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Movie hours\" name=\"description\"></textarea>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("               <div class=\"mb-3\">\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\" style=\"color:white\">Movie image</label>\n");
      out.write("                <input type=\"file\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"photo\">\n");
      out.write("            </div>\n");
      out.write("            <center><table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-danger\">Submit</button>\n");
      out.write("                    </td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-danger\">Cancel</button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                </table></center>\n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            <div class=\"upcoming border border-danger\">\n");
      out.write("            <center><h1 style=\"color:white\">UPCOMING MOVIES</h1></center>\n");
      out.write("            <br>\n");
      out.write("            <form action=\"comingsoon\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\" style=\"color:white\">Movie ID</label>\n");
      out.write("                    <input type=\"int\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Movie ID\" name=\"cid\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\" style=\"color:white\">Movie Name</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Movie Name\" name=\"cname\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\" style=\"color:white\">Director Name</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Movie hours\" name=\"cdirector\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\" style=\"color:white\">Writer Name</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Movie hours\" name=\"cwriter\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\" style=\"color:white\">Description</label>\n");
      out.write("                    <textarea class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Movie hours\" name=\"cdes\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                   <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\" style=\"color:white\">Movie image</label>\n");
      out.write("                    <input type=\"file\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"photo\">\n");
      out.write("                </div>\n");
      out.write("            <center><table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-danger\">Submit</button>\n");
      out.write("                    </td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-danger\">Cancel</button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                </table></center>\n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        </section>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js\" integrity=\"sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V\" crossorigin=\"anonymous\"></script>\n");
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
