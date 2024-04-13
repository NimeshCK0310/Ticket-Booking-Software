package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/67c66657c7.js\"></script>\n");
      out.write("         <link rel=\"stylesheet\" href=\"feedback.css\" type=\"text/css\">\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write(" \n");
      out.write("    <body>\n");
      out.write("        <section></section>\n");
      out.write("        <div class=\"container\"> \n");
      out.write("        <form action=\"feedback\" method=\"post\">\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                <h1>Give your Feedback</h1>\n");
      out.write("                <div class=\"id\">\n");
      out.write("                    <input type=\"text\" placeholder=\"ID number\" name=\"cid\">\n");
      out.write("                    <i class=\"far fa-user\" ></i>\n");
      out.write("                </div><div class=\"id\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Full name\" name=\"cname\">\n");
      out.write("                    <i class=\"far fa-user\" ></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"id\">\n");
      out.write("                    <input type=\"email\" placeholder=\"Email Address\" name=\"cemail\">\n");
      out.write("                    <i class=\"far fa-envelope\" ></i>\n");
      out.write("                </div>\n");
      out.write("                <textarea cols=\"15\" rows=\"5\" placeholder=\"Enter Your oponion here\" name=\"cop\"></textarea>\n");
      out.write("                <button type=\"submit\" class=\"fd\" id=\"my-id\">Submit</button>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("         </form>  \n");
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
