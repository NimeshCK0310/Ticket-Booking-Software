<%-- 
    Document   : cmingzn
    Created on : Jan 14, 2023, 1:47:17 AM
    Author     : Darshana
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="cmingzn.css" type="text/css">
        <link rel="stylesheet" href="avatar.jpeg" >
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>

<body>

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
           
               
               <li></li>
               <li></li>
               <li></li>
               <li></li>
               <li></li>
               
               
               
               
               <a href="About.jsp"><img src="ticket.png"   style="width:50px;  border-radius:50%;"></a>
               <li><a href="">Buy Tickets</a></li>
           </ul>
       </div>
       <i class="fa fa-bars" onclick="showMenu()"></i>
   </nav>
    <%
            Connection con = null;
            PreparedStatement st = null;
            ResultSet rs = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/abccinema","root","");
                String sql1 = "SELECT * FROM commingsoon";
                st = con.prepareStatement(sql1);
                rs = st.executeQuery();
                while(rs.next()){
                   
                    
                    String cmtitle = rs.getString("title");
                    String cmdirector = rs.getString("director");
                    String cmwriter = rs.getString("writter");
                    String cmdescription = rs.getString("description");
                    String cmmimage = rs.getString("image");

        %>
    <section class="background firstSection" id="home">
        <div class="mlist"></div></section><br>
           
        <section><br><br>
            <h1 style="color:black">COMING ZOON</h1><hr size="10" width="100%" color="black" ><br>
        <div class="row row-cols-1 row-cols-md-5 g-6">
           <div class="col ps-3 pr-5">
              <div class="card">
                  <div class="inner">
                      <img src="babylon3.jpg" class="card-img-top mh-25" alt="..." style="height: 340px">
                  </div>
                <div class="card-body bg-primary">
                    <h5 class="card-title"><%=cmtitle%></h5>
                    <p class="card-text"><%=cmdescription%></p>
                     <a href="https://www.youtube.com/watch?v=d9MyW72ELq0&t=55s" class="btn btn-primary">WATCH TRAILER</a>
                </div>
              </div>
            </div>
           
             
              
              
            </div>
    </div>
    </section>

            
    <!--Fotter-->

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

         <center>  <p > Copyright ABC Cinema(Pvt)Ltd.|All Rights Reserved</p></center>
        </div>
        <hr size="3" width="100%" color="white">
        </div>
    </section>          
    
   

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