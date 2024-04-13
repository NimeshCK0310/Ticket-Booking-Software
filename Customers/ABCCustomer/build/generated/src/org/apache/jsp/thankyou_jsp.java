package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class thankyou_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t\n");
      out.write("#thank_you\n");
      out.write(" {\n");
      out.write("/* Thank You ! */\n");
      out.write("\n");
      out.write("position: relative;\n");
      out.write("width: 275px;\n");
      out.write("height: 58px;\n");
      out.write("left: 316px;\n");
      out.write("top: 143px;\n");
      out.write("align-content: center;\n");
      out.write("\n");
      out.write("font-family: 'Inter';\n");
      out.write("font-style: normal;\n");
      out.write("font-weight: 700;\n");
      out.write("font-size: 48px;\n");
      out.write("line-height: 58px;\n");
      out.write("\n");
      out.write("\n");
      out.write("color: #000000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#conform\n");
      out.write("{\n");
      out.write("/* A Confirmation has been sent to your Mail */\n");
      out.write("\n");
      out.write("position: absolute;\n");
      out.write("width: 409px;\n");
      out.write("height: 24px;\n");
      out.write("left: 265px;\n");
      out.write("top: 227px;\n");
      out.write("\n");
      out.write("font-family: 'Inter';\n");
      out.write("font-style: normal;\n");
      out.write("font-weight: 700;\n");
      out.write("font-size: 20px;\n");
      out.write("line-height: 24px;\n");
      out.write("\n");
      out.write("color: #000000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#whatsapp\n");
      out.write("{\n");
      out.write("position: absolute;\n");
      out.write("left: 325px;\n");
      out.write("top: 250px;\n");
      out.write("padding: 20px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#instgram\n");
      out.write("{\n");
      out.write("position: absolute;\n");
      out.write("left: 400px;\n");
      out.write("top: 250px;\n");
      out.write("padding: 20px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#fb\n");
      out.write("{\n");
      out.write("position: absolute;\n");
      out.write("left: 475px;\n");
      out.write("top: 250px;\n");
      out.write("padding: 20px;\n");
      out.write("}\n");
      out.write(".thank{\n");
      out.write("overflow: hidden;\n");
      out.write("    position: relative;\n");
      out.write("    width: 900px;\n");
      out.write("    height: 450px;\n");
      out.write("    margin: 0 auto 100px;\n");
      out.write("    background: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"thank\">\n");
      out.write("\t<div id=\"thank_you\" >\n");
      out.write("\t\tThank You !\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div id=\"conform\" >\n");
      out.write("\t\tA Confirmation has been sent to your Mail \n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id=\"whatsapp\">\n");
      out.write("\t\t<img src=\"https://www.freeiconspng.com/thumbs/logo-whatsapp-png/free-logo-whatsapp-pictures-24.png\" width=\"50\" height=\"50\" >\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"instgram\">\n");
      out.write("\t\t<img src=\"https://parspng.com/wp-content/uploads/2021/09/INSTAGRAM-3.png\" width=\"40\" height=\"40\" >\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id=\"fb\">\n");
      out.write("\t\t<img src=\"data:image/png;base64,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\" width=\"40\" height=\"40\" >\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("\n");
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
