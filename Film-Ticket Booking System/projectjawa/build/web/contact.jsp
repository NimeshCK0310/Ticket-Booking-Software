<%-- 
    Document   : contact
    Created on : Jan 11, 2023, 3:20:02 AM
    Author     : Chathurika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="with=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
   <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />
    </head>
    <style>
     body{
            background-color: black;
        }
        h1{
            color: yellow;
        }
        h2{
            color: white;
        }
        h3{
            color: white;
        }
        p{
            color: white;
            font-size: 20px;
            font-weight: 12px;
            line-height: 22px;
            padding: 10px;
        }
        *{
            margin: 0;
            padding: 0;
        }
        .header{
            min-height: 100vh;
            width: 100%;
            
            background-position: center;
            background-size: cover;
            position: relative;
        }
        nav{
            display: flex;
            padding: 2% 6%;
            justify-content: space-between;
            align-items: center;
        }
        nav img{
            width: 150px; 
        }
        .nav-links{
            flex: 1;
            text-align: left;
        }
        .nav-links ul li{
            list-style: none;
            display: inline-block;
            padding: 8px 12px;
            position: relative;
            
        }
        .nav-links ul li a{
            color: white;
            text-decoration: none;
            font-size: 20px;
        }
        .nav-links ul li::after{
            content: '';
            width: 0%;
            height: 2px;
            background: red;
            display: block;
            margin: auto; 
            transition: 0.5s;
        }
        .nav-links ul li:hover::after{
            width: 100%;
        }
        .text-box{
           width: 90%;
           color: white;
          
        }
        .text-box h1{
            font-size: 35px;    
        }
        nav .fa{
            display: none;
        }
        @media(max-width: 700px){
            .text-box h1{
            font-size: 20px;}
            .nav-links ul li{
                display: block;
            }
            .nav-links{
               position: absolute;
               background: red;
               height: 100vh;
               width: 200px;
               top: 0;
               right: -200px;
               text-align: left;
               z-index: 2;
               transition: 1s;
            }
            nav .fa{
               display: block;
               color: white;
               margin: 10px;
               font-size: 22px;
               cursor: pointer;
            }
            .row{
                flex-direction:column;
            }
            
            
            
        }
        .row{
            
            display: flex;
            margin-left: 0px;
            margin-right: 1%;
        }
        .row-one{
           flex-basis: 31%;
           background: black;
           border-radius: 1px;
           margin-bottom: 5%;
           padding: 20px 12px;
           box-sizing: border-box;
        }
        .row-one-Links ul li {
            list-style: none;
            display: inline-block;
            padding: 8px 12px;
            position: relative;
        }
        .row-one-Links ul li a{
           color: white;
            text-decoration: none;
            font-size: 15px;
        }
         .row-one-Links ul li::after{
            content: '';
            width: 0%;
            height: 2px;
            background: red;
            display: block;
            margin: auto; 
            transition: 0.5s;
        }
        .row-one-Links ul li:hover::after{
            width: 100%;
        }
        
    </style>
    <body>
        <body>
        
        <form acion="config" method="post">
            <section class="header">
                <nav>
                    <p class="log"><b><a href="#"> <img src="abc2.png" alt="" width="90px" height="90px"></a></b></p>
                    <div class="nav-links" id="navLinks">
                        <i class="fa fa-times" onclick="hideMenu()"></i>
                        <ul>
                            <li><a href="">Home</a></li>
                            <li><a href="">Movies</a></li>
                            <li><a href="">News</a></li>
                            <li><a href="">Contact</a></li>
                            <li><a href="">About us</a></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
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
            
            <div class="text-box">
                <h1>Contact</h1>
            </div>
                <hr>
                <br> <br>  
                  <div class="text">
                      <h2>ABC Cinema</h2><br>
                      <h3>Email Address: ABCcinema@gmail.com </h3><br>
                      <h3>Telephone Number: 0111111111 </h3><br>
                      <h3>Address: ABC Cinema,Colombo 7,Sri Lanka.</p> </h3><br><br><br>
                      <h1>Technical support</h1>
                      </div>
                  </section>
                  <hr>
 <section> 
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
                      <li><a href=""><img src="instagram.png" style="width:30px;  border-radius:50%;" ></a></li>
                     <li><a href=""><img src="Facebook.png"style="width:30px;  border-radius:50%;" ></a></li>
                     <li><a href=""><img src="WhatsApp.png" style="width:30px;  border-radius:50%;" ></a></li>
                     
                     </ul>
                            </p>
                     </div>
                     
                 </div>
                    
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
            
                    
                        
                   
         
        
                
        
         
        </form>>

    </body>
</html>
