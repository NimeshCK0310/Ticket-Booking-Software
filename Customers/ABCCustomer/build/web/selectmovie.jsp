<%-- 
    Document   : selectmovie
    Created on : Jan 16, 2023, 4:10:55 AM
    Author     : Darshana
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet"href="selectmovie.css">
        
        <style>
            .navbar-links {
               height: 100%;
              }
        </style>
    </head>
    <body>
        <%
            Connection con = null;
            PreparedStatement st = null;
            ResultSet rs = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/abccinema","root","");
                String sql = "SELECT * FROM nowplaying";
                st = con.prepareStatement(sql);
                rs = st.executeQuery();
                while(rs.next()){
                   
                    String mid= rs.getString("mid");
                    String title = rs.getString("mtitle");
                    String director = rs.getString("director");
                    String writer = rs.getString("writer");
                    String description = rs.getString("description");
                    String mimage = rs.getString("mimg");

        %>
         <nav>
        <p class="log"><b><a href="#"> <img src="abc2.png" alt="" width="90px" height="90px"></a></b></p>
       <div class="nav-links" id="navLinks">
           <i class="fa fa-times" onclick="hideMenu()"></i>
           <ul>
               <li><a href="home.jsp">Home</a></li>
               <li><a href="cnowplaying.jsp">Now Playing</a></li>
               <li><a href="cmingzn.jsp">Coming soon</a></li>
               <li><a href="Contactus.jsp">Contact</a></li>
               <li><a href="aboutus.jsp">About us</a></li>
               <li><a href="feedback.jsp">Feedback</a></li>
           
               
              
        
               
               &nbsp;&nbsp;&nbsp;
               
               
               <a href="About.jsp"><img src="ticket.png"   style="width:50px;  border-radius:50%;"></a>
               <li><a href="">Buy Tickets</a></li>
           </ul>
       </div>
       <i class="fa fa-bars" onclick="showMenu()"></i>
   </nav>
         
        
        
        <hr class="hrtop" size="59" width="100%" color="white">
         
          
        
         <hr>
         <section>
             
          <form action="seats.jsp" method="post">
            <center><table>
                  <tr>
                    <td>
                        <select name="movie" id="movie" class="form-select form-select-lg mb-3" required="">
                            <option>Select a Movie</option>
                            <option value="Avatar: The Way of Water"> <%=title%></option>
                           
                        </select>
                    </td> 
                    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td>
                        <select name="date" id="date" class="form-select form-select-lg mb-3" required="">
                             <option>Select Date</option>
                            <option value="sun,11th December">Mon,23th January</option>
                            <option value="Mon,12th December">Tue,24th January</option>
                            <option value="Tue,13th December">Wed,25th January</option>
                            <option value="Wed,11th December">Tue,26th January</option>
                            <option value="Thu,11th December">Fri,27th January</option>
                        </select>
                    </td>
                    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td>
                        <select name="time" id="time" class="form-select form-select-lg mb-3" required="">
                            <option>Select  Time</option>
                            <option value="10.30">10.30am</option>
                            <option value="1.30">2.30pm</option>
                             <option value="1.30">4.15pm</option>
                              <option value="1.30">9.00pm</option>
                           
                        </select>
                    </td>
                </tr>
                </table></center>
              <br><br>
              <center><table class="table1">
                  <tr class="tr1">
                <td class="tb1"><button type="reset" class="btn btn-danger">Cancel</button></td>
                <td class="td1"></td>
                <td class="tb1"><button type="submit" class="btn btn-success">Next</button></a></td>
                 </tr>
                  </table></center>
              
              
             
              
          </form>
         </section>
       
       

 <hr size="3" width="100%" color="white">
 
                 
                  
           <section> 
        <div class="footer">
        <div class="row">
         <div class="row-one">
            <p class="log"><b><a href="#"> <img src="abc2.png" alt="" width="40px" height="40px"></a></b></p>
             <p>ABC Cinema,<br>Colombo 7,<br>Sri Lanka.</p>
         </div>
            <div class="row-one">
                <p>Contact:<br><br><i class="fas fa-envelope"></i> ABCcinema@gmail.com,</a><br><br><i class="fas fa-phone"> </i> 0111111111</p>
         </div>
            
            <div class="row-one">
                <p>Quick Links:</p>
             <div class="row-one-Links">
             <ul>
              <li><a href="" class="fas fa-angle-right">  Movies</a></li><br>
             <li><a href="" class="fas fa-angle-right">  News</a></li><br>
             <li><a href="" class="fas fa-angle-right">  About us</a></li><br>
             <li><a href="" class="fas fa-angle-right">  Contact</a></li>
             </ul>
             </div>
         </div>
             
            <div class="row-one">
             <p>ABC is a leading Cinema in the industry And you can watch all the new movies from our cinema.</p>
                <div class="row-one-Links">
                    
                    <br><p> Follow Us
                 
             <ul>
              <li><a href=""><img src="https://www.freeiconspng.com/thumbs/logo-whatsapp-png/free-logo-whatsapp-pictures-24.png" style="width:30px;  border-radius:50%;" ></a></li>
             <li><a href=""><img src="https://parspng.com/wp-content/uploads/2021/09/INSTAGRAM-3.png"style="width:30px;  border-radius:50%;" ></a></li>
             <li><a href=""><img src="facebook.png" style="width:30px;  border-radius:50%;" ></a></li>
             
             </ul>
                    
             </div>
             
         </div>
            
        </div>
        <hr size="3" width="100%" color="white">
        <div>

         <center>  <p class="copy"> Copyright ABC Cinema(Pvt)Ltd.|All Rights Reserved</p></center>
        </div>
        <hr size="3" width="100%" color="white">
        </div>
    </section>          
           
        
        <script>
            var navLinks = document.getElementById("navLinks");
            function showMenu(){
                navLinks.style.right = "0";
            }
            function hideMenu(){
                navLinks.style.right = "-200px";
            }
        </script>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
        <%
                }
            } catch (Exception e) {
                out.println(e);
            } %>
    </body>
</html>