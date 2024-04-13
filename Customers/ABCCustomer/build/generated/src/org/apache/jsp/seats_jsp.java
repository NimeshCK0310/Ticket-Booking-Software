package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class seats_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"x-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Movie seat booking</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            @import url('https://fonts.googleapis.com/css?family=Lato&display=swap');\n");
      out.write("\n");
      out.write("            *{\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body{\n");
      out.write("                background-color: #242333;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                color: white;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                height: 100vh;\n");
      out.write("                font-family: 'lato','sans-serif';\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .seat\n");
      out.write("            {\n");
      out.write("                background-color: #444451;\n");
      out.write("                height: 18px;\n");
      out.write("                width: 20px;\n");
      out.write("                margin: 3px;\n");
      out.write("                border-top-left-radius: 5px;\n");
      out.write("                border-top-right-radius: 5px;\n");
      out.write("                font-size: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                align-items: center;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .row\n");
      out.write("            {\n");
      out.write("                display: flex;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie-container\n");
      out.write("            {\n");
      out.write("                margin: 20px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie-container select\n");
      out.write("            {\n");
      out.write("                background-color: #fff;\n");
      out.write("                border: 0;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                font-size: 14px;\n");
      out.write("                margin-left: 10px;\n");
      out.write("                padding: 5px 15px 5px 15px;\n");
      out.write("                -moz-appearance: none;\n");
      out.write("                -webkit-appearance: none;\n");
      out.write("                appearance: none;                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .seat.Selected\n");
      out.write("            {\n");
      out.write("                background-color: green;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .seat.Occupied\n");
      out.write("            {\n");
      out.write("                background-color: red;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .seat:nth-of-type(6)\n");
      out.write("            {\n");
      out.write("                margin-right: 18px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .seat:nth-last-of-type(6)\n");
      out.write("            {\n");
      out.write("                margin-left: 18px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .seat:not(.Occupied):hover\n");
      out.write("            {\n");
      out.write("                cursor: pointer;\n");
      out.write("                transform: scale(1,2);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .showcase .seat:not(.Occupied):hover\n");
      out.write("            {\n");
      out.write("                cursor: default;\n");
      out.write("                transform: scale(1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .showcase\n");
      out.write("            {\n");
      out.write("                background-color: rgba(0, 0,0,0.1);\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                color: #777;\n");
      out.write("                list-style-type: none;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("            }\n");
      out.write("            .showcase li\n");
      out.write("            {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                margin: 5px 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .showcase li small\n");
      out.write("            {\n");
      out.write("                margin-left:10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .screen\n");
      out.write("            {\n");
      out.write("                background-color: #fff;\n");
      out.write("                height: 50px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin: 15px 0;\n");
      out.write("                transform: rotateX(-45deg);\n");
      out.write("                box-shadow: 0 3px 10px rgba(255,255,255,0.75);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container \n");
      out.write("            {\n");
      out.write("                perspective: 1000px;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p.text\n");
      out.write("            {\n");
      out.write("                margin: 5px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p.text span\n");
      out.write("            {\n");
      out.write("                color: #95eaf0;\n");
      out.write("            }\n");
      out.write("            .seat\n");
      out.write("            {\n");
      out.write("                height: 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form action=\"payment.jsp\" method=\"post\">\n");
      out.write("        <div class=\"movie-container\">\n");
      out.write("            <label><center><h2>Seat Booking</h2></center> </label><br><br>\n");
      out.write("          \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            <center><table>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"scategory\" id=\"movie\" class=\"form-select form-select-lg mb-3\">\n");
      out.write("                            <option>Seat Category</option>\n");
      out.write("                            <option value=\"500\">First Class</option>\n");
      out.write("                            <option value=\"500\">ODC</option>\n");
      out.write("                            <option value=\"500\">BOX</option>\n");
      out.write("                           \n");
      out.write("                        </select>\n");
      out.write("                    </td> \n");
      out.write("                 \n");
      out.write("                </tr>\n");
      out.write("                </table></center>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"showcase\">\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <div class=\"seat\"></div>\n");
      out.write("                <small>Available seats</small>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <div class=\"seat Selected\"></div>\n");
      out.write("                <small>Selected seats</small>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <div class=\"seat Occupied\"></div>\n");
      out.write("                <small>Occupied seats</small>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <h3>First Class</h3>\n");
      out.write("            <div class=\"screen\"></div>\n");
      out.write("\n");
      out.write("            <div class=\"row\"> <div> A :</div>\n");
      out.write("                <div class=\"seat\">A1</div>\n");
      out.write("                <div class=\"seat\">A2</div>\n");
      out.write("                <div class=\"seat\">A3</div>\n");
      out.write("                <div class=\"seat\">A4</div>\n");
      out.write("                <div class=\"seat\">A5</div>\n");
      out.write("                <div class=\"seat\">A6</div>\n");
      out.write("                <div class=\"seat\">A7</div>\n");
      out.write("                <div class=\"seat\">A8</div>\n");
      out.write("                <div class=\"seat\">A9</div>\n");
      out.write("                <div class=\"seat\">A10</div>\n");
      out.write("                <div class=\"seat\">A11</div>\n");
      out.write("                <div class=\"seat\">A12</div>\n");
      out.write("                <div class=\"seat\">A13</div>\n");
      out.write("                <div class=\"seat\">A14</div>\n");
      out.write("                <div class=\"seat\">A15</div>\n");
      out.write("                <div class=\"seat\">A16</div>\n");
      out.write("                <div class=\"seat\">A17</div>\n");
      out.write("                <div class=\"seat\">A18</div>\n");
      out.write("                <div class=\"seat\">A19</div>\n");
      out.write("                <div class=\"seat\">A20</div>\n");
      out.write("                <div class=\"seat\">A21</div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\"> <div> B :</div>\n");
      out.write("                <div class=\"seat\">B1</div>\n");
      out.write("                <div class=\"seat\">B2</div>\n");
      out.write("                <div class=\"seat\">B3</div>\n");
      out.write("                <div class=\"seat\">B4</div>\n");
      out.write("                <div class=\"seat\">B5</div>\n");
      out.write("                <div class=\"seat\">B6</div>\n");
      out.write("                <div class=\"seat\">B7</div>\n");
      out.write("                <div class=\"seat\">B8</div>\n");
      out.write("                <div class=\"seat\">B9</div>\n");
      out.write("                <div class=\"seat\">B10</div>\n");
      out.write("                <div class=\"seat\">B11</div>\n");
      out.write("                <div class=\"seat\">B12</div>\n");
      out.write("                <div class=\"seat\">B13</div>\n");
      out.write("                <div class=\"seat\">B14</div>\n");
      out.write("                <div class=\"seat\">B15</div>\n");
      out.write("                <div class=\"seat\">B16</div>\n");
      out.write("                <div class=\"seat\">B17</div>\n");
      out.write("                <div class=\"seat\">B18</div>\n");
      out.write("                <div class=\"seat\">B19</div>\n");
      out.write("                <div class=\"seat\">B20</div>\n");
      out.write("                <div class=\"seat\">B21</div>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"row\"> <div> C :</div>\n");
      out.write("                <div class=\"seat\">C1</div>\n");
      out.write("                <div class=\"seat\">C2</div>\n");
      out.write("                <div class=\"seat\">C3</div>\n");
      out.write("                <div class=\"seat\">C4</div>\n");
      out.write("                <div class=\"seat\">C5</div>\n");
      out.write("                <div class=\"seat\">C6</div>\n");
      out.write("                <div class=\"seat\">C7</div>\n");
      out.write("                <div class=\"seat\">C8</div>\n");
      out.write("                <div class=\"seat\">C9</div>\n");
      out.write("                <div class=\"seat\">C10</div>\n");
      out.write("                <div class=\"seat\">C11</div>\n");
      out.write("                <div class=\"seat\">C12</div>\n");
      out.write("                <div class=\"seat\">C13</div>\n");
      out.write("                <div class=\"seat\">C14</div>\n");
      out.write("                <div class=\"seat\">C15</div>\n");
      out.write("                <div class=\"seat\">C16</div>\n");
      out.write("                <div class=\"seat\">C17</div>\n");
      out.write("                <div class=\"seat\">C18</div>\n");
      out.write("                <div class=\"seat\">C19</div>\n");
      out.write("                <div class=\"seat\">C20</div>\n");
      out.write("                <div class=\"seat\">C21</div>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"row\"> <div> D :</div>\n");
      out.write("                <div class=\"seat\">D1</div>\n");
      out.write("                <div class=\"seat\">D2</div>\n");
      out.write("                <div class=\"seat\">D3</div>\n");
      out.write("                <div class=\"seat\">D4</div>\n");
      out.write("                <div class=\"seat\">D5</div>\n");
      out.write("                <div class=\"seat\">D6</div>\n");
      out.write("                <div class=\"seat\">D7</div>\n");
      out.write("                <div class=\"seat\">D8</div>\n");
      out.write("                <div class=\"seat\">D9</div>\n");
      out.write("                <div class=\"seat\">D10</div>\n");
      out.write("                <div class=\"seat\">D11</div>\n");
      out.write("                <div class=\"seat\">D12</div>\n");
      out.write("                <div class=\"seat\">D13</div>\n");
      out.write("                <div class=\"seat\">D14</div>\n");
      out.write("                <div class=\"seat\">D15</div>\n");
      out.write("                <div class=\"seat\">D16</div>\n");
      out.write("                <div class=\"seat\">D17</div>\n");
      out.write("                <div class=\"seat\">D18</div>\n");
      out.write("                <div class=\"seat\">D19</div>\n");
      out.write("                <div class=\"seat\">D20</div>\n");
      out.write("                <div class=\"seat\">D21</div>\n");
      out.write("           </div>\n");
      out.write("            <h3>ODC</31>\n");
      out.write("           <div class=\"screen\"></div>\n");
      out.write("           <div class=\"row\"> <div> E :</div>\n");
      out.write("                <div class=\"seat\">E1</div>\n");
      out.write("                <div class=\"seat\">E2</div>\n");
      out.write("                <div class=\"seat\">E3</div>\n");
      out.write("                <div class=\"seat\">E4</div>\n");
      out.write("                <div class=\"seat\">E5</div>\n");
      out.write("                <div class=\"seat\">E6</div>\n");
      out.write("                <div class=\"seat\">E7</div>\n");
      out.write("                <div class=\"seat\">E8</div>\n");
      out.write("                <div class=\"seat\">E9</div>\n");
      out.write("                <div class=\"seat\">E10</div>\n");
      out.write("                <div class=\"seat\">E11</div>\n");
      out.write("                <div class=\"seat\">E12</div>\n");
      out.write("                <div class=\"seat\">E13</div>\n");
      out.write("                <div class=\"seat\">E14</div>\n");
      out.write("                <div class=\"seat\">E15</div>\n");
      out.write("                <div class=\"seat\">E16</div>\n");
      out.write("                <div class=\"seat\">E17</div>\n");
      out.write("                <div class=\"seat\">E18</div>\n");
      out.write("                <div class=\"seat\">E19</div>\n");
      out.write("                <div class=\"seat\">E20</div>\n");
      out.write("                <div class=\"seat\">E21</div>\n");
      out.write("           </div>\n");
      out.write("              <div class=\"row\"> <div> F :</div>\n");
      out.write("                <div class=\"seat\">F1</div>\n");
      out.write("                <div class=\"seat\">F2</div>\n");
      out.write("                <div class=\"seat\">F3</div>\n");
      out.write("                <div class=\"seat\">F4</div>\n");
      out.write("                <div class=\"seat\">F5</div>\n");
      out.write("                <div class=\"seat\">F6</div>\n");
      out.write("                <div class=\"seat\">F7</div>\n");
      out.write("                <div class=\"seat\">F8</div>\n");
      out.write("                <div class=\"seat\">F9</div>\n");
      out.write("                <div class=\"seat\">F10</div>\n");
      out.write("                <div class=\"seat\">F11</div>\n");
      out.write("                <div class=\"seat\">F12</div>\n");
      out.write("                <div class=\"seat\">F13</div>\n");
      out.write("                <div class=\"seat\">F14</div>\n");
      out.write("                <div class=\"seat\">F15</div>\n");
      out.write("                <div class=\"seat\">F16</div>\n");
      out.write("                <div class=\"seat\">F17</div>\n");
      out.write("                <div class=\"seat\">F18</div>\n");
      out.write("                <div class=\"seat\">F19</div>\n");
      out.write("                <div class=\"seat\">F20</div>\n");
      out.write("                <div class=\"seat\">F21</div>\n");
      out.write("           </div>\n");
      out.write("            <div class=\"row\"> <div> G :</div>\n");
      out.write("                <div class=\"seat\">G1</div>\n");
      out.write("                <div class=\"seat\">G2</div>\n");
      out.write("                <div class=\"seat\">G3</div>\n");
      out.write("                <div class=\"seat\">G4</div>\n");
      out.write("                <div class=\"seat\">G5</div>\n");
      out.write("                <div class=\"seat\">G6</div>\n");
      out.write("                <div class=\"seat\">G7</div>\n");
      out.write("                <div class=\"seat\">G8</div>\n");
      out.write("                <div class=\"seat\">G9</div>\n");
      out.write("                <div class=\"seat\">G10</div>\n");
      out.write("                <div class=\"seat\">G11</div>\n");
      out.write("                <div class=\"seat\">G12</div>\n");
      out.write("                <div class=\"seat\">G13</div>\n");
      out.write("                <div class=\"seat\">G14</div>\n");
      out.write("                <div class=\"seat\">G15</div>\n");
      out.write("                <div class=\"seat\">G16</div>\n");
      out.write("                <div class=\"seat\">G17</div>\n");
      out.write("                <div class=\"seat\">G18</div>\n");
      out.write("                <div class=\"seat\">G19</div>\n");
      out.write("                <div class=\"seat\">G20</div>\n");
      out.write("                <div class=\"seat\">G21</div>\n");
      out.write("           </div>\n");
      out.write("            <div class=\"row\"> <div> H :</div>\n");
      out.write("                <div class=\"seat\">H1</div>\n");
      out.write("                <div class=\"seat\">H2</div>\n");
      out.write("                <div class=\"seat\">H3</div>\n");
      out.write("                <div class=\"seat\">H4</div>\n");
      out.write("                <div class=\"seat\">H5</div>\n");
      out.write("                <div class=\"seat\">H6</div>\n");
      out.write("                <div class=\"seat\">H7</div>\n");
      out.write("                <div class=\"seat\">H8</div>\n");
      out.write("                <div class=\"seat\">H9</div>\n");
      out.write("                <div class=\"seat\">H10</div>\n");
      out.write("                <div class=\"seat\">H11</div>\n");
      out.write("                <div class=\"seat\">H12</div>\n");
      out.write("                <div class=\"seat\">H13</div>\n");
      out.write("                <div class=\"seat\">H14</div>\n");
      out.write("                <div class=\"seat\">H15</div>\n");
      out.write("                <div class=\"seat\">H16</div>\n");
      out.write("                <div class=\"seat\">H17</div>\n");
      out.write("                <div class=\"seat\">H18</div>\n");
      out.write("                <div class=\"seat\">H19</div>\n");
      out.write("                <div class=\"seat\">H20</div>\n");
      out.write("                <div class=\"seat\">H21</div>\n");
      out.write("           </div>\n");
      out.write("            <div class=\"row \"> <div> I&nbsp;&nbsp;&nbsp;:</div>\n");
      out.write("                <div class=\"seat\">I1</div>\n");
      out.write("                <div class=\"seat\">I2</div>\n");
      out.write("                <div class=\"seat\">I3</div>\n");
      out.write("                <div class=\"seat\">I4</div>\n");
      out.write("                <div class=\"seat\">I5</div>\n");
      out.write("                <div class=\"seat\">I6</div>\n");
      out.write("                <div class=\"seat\">I7</div>\n");
      out.write("                <div class=\"seat\">I8</div>\n");
      out.write("                <div class=\"seat\">I9</div>\n");
      out.write("                <div class=\"seat\">I10</div>\n");
      out.write("                <div class=\"seat\">I11</div>\n");
      out.write("                <div class=\"seat\">I12</div>\n");
      out.write("                <div class=\"seat\">I13</div>\n");
      out.write("                <div class=\"seat\">I14</div>\n");
      out.write("                <div class=\"seat\">I15</div>\n");
      out.write("                <div class=\"seat\">I16</div>\n");
      out.write("                <div class=\"seat\">I17</div>\n");
      out.write("                <div class=\"seat\">I18</div>\n");
      out.write("                <div class=\"seat\">IF19</div>\n");
      out.write("                <div class=\"seat\">I20</div>\n");
      out.write("                <div class=\"seat\">I21</div>\n");
      out.write("           </div>\n");
      out.write("           <h3>BOX </h3>\n");
      out.write("          \n");
      out.write("           <div class=\"screen\"></div>\n");
      out.write("           <div class=\"row\"> <div> J :</div>\n");
      out.write("                <div class=\"seat\">J1</div>\n");
      out.write("                <div class=\"seat\">J2</div>\n");
      out.write("                <div class=\"seat\">J3</div>\n");
      out.write("                <div class=\"seat\">J4</div>\n");
      out.write("                <div class=\"seat\">J5</div>\n");
      out.write("                <div class=\"seat\">J6</div>\n");
      out.write("                <div class=\"seat\">J7</div>\n");
      out.write("                <div class=\"seat\">J8</div>\n");
      out.write("                <div class=\"seat\">J9</div>\n");
      out.write("                <div class=\"seat\">J10</div>\n");
      out.write("                <div class=\"seat\">J11</div>\n");
      out.write("                <div class=\"seat\">J12</div>\n");
      out.write("                <div class=\"seat\">J13</div>\n");
      out.write("                <div class=\"seat\">J14</div>\n");
      out.write("                <div class=\"seat\">J15</div>\n");
      out.write("                <div class=\"seat\">J16</div>\n");
      out.write("                <div class=\"seat\">J17</div>\n");
      out.write("                <div class=\"seat\">J18</div>\n");
      out.write("                <div class=\"seat\">J19</div>\n");
      out.write("                <div class=\"seat\">J20</div>\n");
      out.write("                <div class=\"seat\">J21</div>\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <p class=\"text\">\n");
      out.write("            You have selected <span id=\"count\" >0</span>\n");
      out.write("            Seats for a price of LKR.<span id=\"total\">00.00</span>\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <center><input  type=\"submit\" value=\"continue\"></center>\n");
      out.write("        <script src=\"seat.js\"></script>\n");
      out.write("        </form>\n");
      out.write("        \n");
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