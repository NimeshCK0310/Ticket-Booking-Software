<%-- 
    Document   : dashboard
    Created on : Jan 14, 2023, 7:58:03 PM
    Author     : Darshana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>hi</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
         <link rel="stylesheet" href="dashboard.css">
        
    
    </head>
    <body>
       <form action="" method="post">
        <section class="header">
            <nav>
                <p class="log"><b><a href="#"> <img src="abclogo.png" alt="" width="90px" height="90px"></a></b></p>
                <div class="nav-links" id="navLinks">
                    <i class="fa fa-times" onclick="hideMenu()"></i>
                    <ul>
                        <li><a href="dashboard.jsp">Dashboard</a></li>
                            <li><a href="movie.jsp">Movies</a></li>
                            <li><a href="movieadd.jsp">Movie Add</a></li>
                            <li><a href="update.jsp">Update Movie</a></li>
                        <li></li>
                       
                    </ul>
                </div>
                <i class="fa fa-bars" onclick="showMenu()"></i>
            </nav>
           <hr>
            <section>
                <div class="row">
                    <div class="column">
                      <div class="card">
                        <h3>Earning</h3>
                        <p>RS:00.00</p>
                        <button >Month</button>
                      </div>
                    </div>
                    <div class="column">
                        <div class="card1">
                          <h3>Seat booking</h3>
                          <p>Seats = 000</p>
                          <button >Month</button>
                        </div>
                    </div>
                    <div class="column">
                        <div class="card2">
                          <h3>Users</h3>
                          <p>No of Users=000</p>
                          <button >Month</button>
                        </div>
                      </div>
                    </div>       
                    <p style="color: white;">Progress of Movies:</p>
                
                <center> 
                   <div class="card3">
                  <h3 align="left">Movie Title</h3>
                  <p> Graph to show the progress</p>
                  
                </div>
                </div> </center>
                <hr size="3" width="100%" color="white">
                <div class="ticket">
              
              <h1>Tickets Details</h1> 
                
                 price of a Full tickets : <label class="ft">Rs.500.00</label> <br><br>
                 price of a half tickets : <label class="ht">Rs.500.00</label><br><br>
                </div>
              
              </div>
                <div class="btn">
                  <button class="button con"  >Edit price</button>
                  </div>
                </div>
            </section>
       </form>
    </body>
</html>