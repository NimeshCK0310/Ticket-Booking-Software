package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ticket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"with=device-width, initial-scale=1.0\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            background-color: black;\n");
      out.write("            background-image: url('blues.jpg');\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        p{\n");
      out.write("            color: white;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: 12px;\n");
      out.write("            line-height: 22px;\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        h1{\n");
      out.write("            color: black;\n");
      out.write("            font-weight: 700;\n");
      out.write("             font-size: 20px;\n");
      out.write("             text-align: center;\n");
      out.write("        }\n");
      out.write("        *{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        .header{\n");
      out.write("            min-height: 100vh;\n");
      out.write("            width: 100%;\n");
      out.write("            \n");
      out.write("            background-position: center;\n");
      out.write("            background-size: cover;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("        nav{\n");
      out.write("            display: flex;\n");
      out.write("            padding: 2% 6%;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .nav-links{\n");
      out.write("            flex: 1;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        .nav-links ul li{\n");
      out.write("            list-style: none;\n");
      out.write("            display: inline-block;\n");
      out.write("            padding: 8px 12px;\n");
      out.write("            position: relative;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .nav-links ul li a{\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-size: 35px;\n");
      out.write("        }\n");
      out.write("        .nav-links ul li::after{\n");
      out.write("            content: '';\n");
      out.write("            width: 0%;\n");
      out.write("            height: 2px;\n");
      out.write("            background: red;\n");
      out.write("            display: block;\n");
      out.write("            margin: auto; \n");
      out.write("            transition: 0.5s;\n");
      out.write("        }\n");
      out.write("        .nav-links ul li:hover::after{\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        nav .fa{\n");
      out.write("            text-align: right;\n");
      out.write("               display: block;\n");
      out.write("               color: red;\n");
      out.write("               margin: 10px;\n");
      out.write("               font-size: 25px;\n");
      out.write("               cursor: pointer;\n");
      out.write("            }\n");
      out.write("            table.center{\n");
      out.write("            margin-left: auto;\n");
      out.write("            margin-right: auto;\n");
      out.write("        }\n");
      out.write("       .button{\n");
      out.write("            \n");
      out.write("             background-color: yellow;\n");
      out.write("  border: none;\n");
      out.write("  color: black;\n");
      out.write("  padding-top: 10px;\n");
      out.write("  padding-right:150px;\n");
      out.write("  padding-left: 150px;\n");
      out.write("   padding-bottom: 10px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .center{\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <form acion=\"ticket\" method=\"post\"  >\n");
      out.write("            <section class=\"header\">\n");
      out.write("                <nav>\n");
      out.write("                    <a href=\"More.jsp\"></a>\n");
      out.write("                    <div class=\"nav-links\" id=\"navLinks\">\n");
      out.write("                        <i class=\"fa fa-times\"></i>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"\">Dashboard</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <br><br><br><br>\n");
      out.write("            \n");
      out.write("                <div class=\"center\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("    <p>Price Of a Full Ticket  : \n");
      out.write("            <input type=\" text\" name=\"NFT\" placeholder=\"\"></p>\n");
      out.write("    <p>Price Of a Half Ticket  :\n");
      out.write("           <input type=\" text\" name=\"NHT\" placeholder=\"\"></p>\n");
      out.write("\n");
      out.write("         <br><br>\n");
      out.write("         <button class=\"submit\"><h1>Continue</h1> </button>\n");
      out.write("                 </div>\n");
      out.write("               \n");
      out.write("                   \n");
      out.write("           </section>\n");
      out.write("             \n");
      out.write("        </form>\n");
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
