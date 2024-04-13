<%-- 
    Document   : Contactus
    Created on : Jan 14, 2023, 2:26:21 PM
    Author     : Darshana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Contactus.css" type="text/css">
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
    <section class="background firstSection" id="home">
        <div class="mlist"></div></section><br>

        <section><br><br>
            <h1 style="color:black">Contact  us</h1><hr size="10" width="100%" color="black" ><br>
           <b> <p style="font-size: 20px;"><h1 style="font-size: 35;">Address</h1>&nbsp;&nbsp;ABC Cinema,<br>&nbsp;&nbsp;Colombo 7,<br>&nbsp;&nbsp;Sri Lanka.</p></b><br><br>
           <b> <p style="font-size: 20px;"><h1 style="font-size: 35;">Contact us through</h1>&nbsp;&nbsp;Tele :0111111111<br>&nbsp;&nbsp;Email :ABCcinema@gmail.com <br></p></b><br><br>



        
           
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

</body>

</html>