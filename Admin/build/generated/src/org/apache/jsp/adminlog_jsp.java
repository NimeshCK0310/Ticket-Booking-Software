package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width , initial-scale=1.0\">\n");
      out.write("        <title>ABC Cinema</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"adminlog.css\">  \n");
      out.write("       <script  language=\"javascript\" type=\"text/javascript\">\n");
      out.write("        function validate()\n");
      out.write("        {\n");
      out.write("            if(document.form.pswrd.value.length<8)\n");
      out.write("            {\n");
      out.write("                window.alert(\"Password must be at least 8 Charackters\")\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("       </script>\n");
      out.write("    <a href=\"adminlog.jsp\"></a>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <form name=\"form\" method=\"post\" action=\"adminlog\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <p class=\"log\"><b><a href=\"#\"> <img src=\"abclogo.png\" alt=\"\" width=\"90px\" height=\"90px\"></a></b></p>\n");
      out.write("        \n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"logform\">\n");
      out.write("                \n");
      out.write("                <h1><b>LOGIN</b> </h1>\n");
      out.write("               \n");
      out.write("                <label for=\"\">\n");
      out.write("                    <span>\n");
      out.write("                        User Name :\n");
      out.write("                    </span>\n");
      out.write("                        <input type=\"text\"  name=\"uname\" id=\"usernmame\" required>\n");
      out.write("                        <div class=\"error\"></div>\n");
      out.write("                </label>\n");
      out.write("                \n");
      out.write("                <label for=\"\">\n");
      out.write("                   \n");
      out.write("                    <span>\n");
      out.write("                        <b>  Password :</b>\n");
      out.write("                    </span>\n");
      out.write("                \n");
      out.write("                        <input type=\"password\"  name=\"pswrd\" id=\"upswrd\" >\n");
      out.write("                        <div class=\"error\"></div>\n");
      out.write("                </label> \n");
      out.write("                        \n");
      out.write("                <p class=\"fgtpsswrd\"><a href=\"#\">Forget Password ?</a></p>\n");
      out.write("                <button type=\"submit\" class=\"logbtn\"  onclick=\"validate()\"> Log In </button>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("            <div class=\"subc\"> \n");
      out.write("                <div class=\"image\">\n");
      out.write("                    <center><div class=\"txtimg\">\n");
      out.write("                            <h2 style=\"align:center;\">Welcome</h2> <br>\n");
      out.write("                           \n");
      out.write("                    </div></center>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
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
