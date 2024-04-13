package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Contactus.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"avatar.jpeg\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\" />\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <nav>\n");
      out.write("        <p class=\"log\"><b><a href=\"#\"> <img src=\"abc2.png\" alt=\"\" width=\"90px\" height=\"90px\"></a></b></p>\n");
      out.write("       <div class=\"nav-links\" id=\"navLinks\">\n");
      out.write("           <i class=\"fa fa-times\" onclick=\"hideMenu()\"></i>\n");
      out.write("          <ul>\n");
      out.write("               <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("               <li><a href=\"cnowplaying.jsp\">Now Playing</a></li>\n");
      out.write("               <li><a href=\"cmingzn.jsp\">Coming soon</a></li>\n");
      out.write("               <li><a href=\"Contactus.jsp\">Contact</a></li>\n");
      out.write("               <li><a href=\"aboutus.jsp\">About us</a></li>\n");
      out.write("               <li><a href=\"feedback.jsp\">Feedback</a></li>\n");
      out.write("           \n");
      out.write("               \n");
      out.write("               <li></li>\n");
      out.write("               <li></li>\n");
      out.write("               <li></li>\n");
      out.write("               <li></li>\n");
      out.write("               <li></li>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               <a href=\"About.jsp\"><img src=\"ticket.png\"   style=\"width:50px;  border-radius:50%;\"></a>\n");
      out.write("               <li><a href=\"\">Buy Tickets</a></li>\n");
      out.write("           </ul>\n");
      out.write("       </div>\n");
      out.write("       <i class=\"fa fa-bars\" onclick=\"showMenu()\"></i>\n");
      out.write("   </nav>\n");
      out.write("    <section class=\"background firstSection\" id=\"home\">\n");
      out.write("        <div class=\"mlist\"></div></section><br>\n");
      out.write("\n");
      out.write("        <section><br><br>\n");
      out.write("            <h1 style=\"color:black\">Contact  us</h1><hr size=\"10\" width=\"100%\" color=\"black\" ><br>\n");
      out.write("           <b> <p style=\"font-size: 20px;\"><h1 style=\"font-size: 35;\">Address</h1>&nbsp;&nbsp;ABC Cinema,<br>&nbsp;&nbsp;Colombo 7,<br>&nbsp;&nbsp;Sri Lanka.</p></b><br><br>\n");
      out.write("           <b> <p style=\"font-size: 20px;\"><h1 style=\"font-size: 35;\">Contact us through</h1>&nbsp;&nbsp;Tele :0111111111<br>&nbsp;&nbsp;Email :ABCcinema@gmail.com <br></p></b><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("           \n");
      out.write("    </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("            \n");
      out.write("    <!--Fotter-->\n");
      out.write("\n");
      out.write("    <section> \n");
      out.write("        <div class=\"footer\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("         <div class=\"row-one\">\n");
      out.write("            <p class=\"log\"><b><a href=\"#\"> <img src=\"abc2.png\" alt=\"\" width=\"40px\" height=\"40px\"></a></b></p>\n");
      out.write("             <p>ABC Cinema,<br>Colombo 7,<br>Sri Lanka.</p>\n");
      out.write("         </div>\n");
      out.write("            <div class=\"row-one\">\n");
      out.write("                <p>Contact:<br><br><i class=\"fas fa-envelope\"></i> ABCcinema@gmail.com,</a><br><br><i class=\"fas fa-phone\"> </i> 0111111111</p>\n");
      out.write("         </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row-one\">\n");
      out.write("                <p>Quick Links:</p>\n");
      out.write("             <div class=\"row-one-Links\">\n");
      out.write("             <ul>\n");
      out.write("              <li><a href=\"\" class=\"fas fa-angle-right\">  Movies</a></li><br>\n");
      out.write("             <li><a href=\"\" class=\"fas fa-angle-right\">  News</a></li><br>\n");
      out.write("             <li><a href=\"\" class=\"fas fa-angle-right\">  About us</a></li><br>\n");
      out.write("             <li><a href=\"\" class=\"fas fa-angle-right\">  Contact</a></li>\n");
      out.write("             </ul>\n");
      out.write("             </div>\n");
      out.write("         </div>\n");
      out.write("             \n");
      out.write("            <div class=\"row-one\">\n");
      out.write("             <p>ABC is a leading Cinema in the industry And you can watch all the new movies from our cinema.</p>\n");
      out.write("                <div class=\"row-one-Links\">\n");
      out.write("                    \n");
      out.write("                    <br><p> Follow Us\n");
      out.write("                 \n");
      out.write("             <ul>\n");
      out.write("              <li><a href=\"\"><img src=\"https://www.freeiconspng.com/thumbs/logo-whatsapp-png/free-logo-whatsapp-pictures-24.png\" style=\"width:30px;  border-radius:50%;\" ></a></li>\n");
      out.write("             <li><a href=\"\"><img src=\"https://parspng.com/wp-content/uploads/2021/09/INSTAGRAM-3.png\"style=\"width:30px;  border-radius:50%;\" ></a></li>\n");
      out.write("             <li><a href=\"\"><img src=\"facebook.png\" style=\"width:30px;  border-radius:50%;\" ></a></li>\n");
      out.write("             \n");
      out.write("             </ul>\n");
      out.write("                    \n");
      out.write("             </div>\n");
      out.write("             \n");
      out.write("         </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <hr size=\"3\" width=\"100%\" color=\"white\">\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("         <center>  <p > Copyright ABC Cinema(Pvt)Ltd.|All Rights Reserved</p></center>\n");
      out.write("        </div>\n");
      out.write("        <hr size=\"3\" width=\"100%\" color=\"white\">\n");
      out.write("        </div>\n");
      out.write("    </section>          \n");
      out.write("    \n");
      out.write("   \n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js\" integrity=\"sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
