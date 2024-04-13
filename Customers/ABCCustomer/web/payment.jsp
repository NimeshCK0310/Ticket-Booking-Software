<%-- 
    Document   : payment
    Created on : Jan 16, 2023, 4:03:38 AM
    Author     : Darshana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC Cinema</title>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet"href="payment.css">
        
        <script type="text/javascript"
        src="https://cdn.jsdelivr.net/npm/@emailjs/browser@3/dist/email.min.js">
        </script>
        <script type="text/javascript">
           (function(){
           emailjs.init("50id8CQkNJzXqTEon");
           })();
      </script>
       <style>
            #whatsapp
             {
              position: absolute;
              left: 85px;
              top: 250px;
              padding: 20px;

             }

            #instgram
             {
               position: absolute;
               left: 275px;
               top: 250px;
               padding: 20px;

             }

            form
             {
                color: white;
              background-color: transparent;
              align-items: center;
              
             }

            body
             {
                background-image: url("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwoNCAgICAoPCAcHBw0HBwcHCA8ICQcKIBEWFhURHxMYHSggGBolJx8fITEhJSkrLi4uFx8zODMsNygtLisBCgoKDg0NDg0PFSsZFRktNzctNysrKy03KysrKysrKy03LS0rNy0rKysrKysrKysrLSstKysrKysrKysrKysrK//AABEIAJ8BPgMBIgACEQEDEQH/xAAYAAEBAQEBAAAAAAAAAAAAAAACAQADB//EABkQAQEBAQEBAAAAAAAAAAAAAAARARIhAv/EABgBAQEBAQEAAAAAAAAAAAAAAAABAgMF/8QAFhEBAQEAAAAAAAAAAAAAAAAAABEB/9oADAMBAAIRAxEAPwDxRijR6UcqLHGhCjGhRYsShyvJxoQoRocaEKEXkosWJQiwo0IUYkONCFCNDjQKEWFGgUYkONAoRocaBQiwo0IUYkONCFDlI6RIQoRocaJFoRI6RIQoRocSEWgxxokKDQo0IU40KLGmKEWFFWJQjQ40IUY0ONFiUIuYUWEKEWFGhCixReSJQjQ43KwoND5bkhQjQ+W5IUI0PluSFCND5bkhQjQ+W5IUGOJEi0YkONCFDlI6RIQoRocaJFrnGjpEhChEjokItCND3EhCnFhRY1GK5xc+TjLEo8tDaESjGhZixYUY0KLCJQjQ40IUYxRYsKDQ4kIlGNDjQhQjQ40IUI0ONCFCNDjQhQY40IUIkONCLQjQ40SFCNC5aEKEaHuJEi0OWhxCFCJHRoRa5xI6RIkWnFhRo3HOjFhRosSjFhZjQhRjQovKxKMaG0IUFmlFhEoTVhcryQrnFhRosKMaHGhEoRuTjQi0OWhxoRKEaHEhFoxI6RIQoRprpynKQoRHSJCFCNDjQi1zjQ+W5IUIkOJEi0YkONuEK58tDiRItOLFi8tMUYsKYsWJRjclmLFiUIuYUaEKkaFGixKMaacaEKMaFG5WFGLCjQiUY0LloFGNCjQhRjQo0IUY0KNAoxIcaEKEaFy0ItD1ocSJCjE3DaEKExtwo0SLQjQmhFoJHSJuJCucaHEiRacWKsbjFGLFixUo5ixcxYFGLCjRYlGLmFGixKMWFmNCFGNCzF5WJRjQosIlBjjEKDHGgUGONAoMcaEKESOkSEWhGh8tEhQiQ40ItDcSHGhChEhxokWhEhpuItGJD3EgtGJCZIUo2YUWNRmjFirFiVI2YUXMVKMWLFglGLmFmLFiUY0KLCJQi5hRosKMWFGixKMaFFhChEjpGhChGhxoQoRocSEKMTk40IUNxIcaJFoRoaRIUIkdIkItc40PcRFoNC3GgtCJDiJFoNC1tSLVWKrTFSKsXMVKkXFzFWIkXMXMWLEoxYqxYlSMWYsWJRjZhRYRKMaFF5WFCNDjQiUeWhRoQoxuSjQhQjQ40IUIkdOUhFoRjiRIUIkONuJFoRIcSJFoakOJCLQaEkSLRSE2ooRDRFqrGXFZaLisqLFzGZrErLi5i4sZSLFWKVIuYuYsWM1MxYqxYlGLFXMIlGNDjRYlGNDjQhQjQ40IVzjQ424RaESHE3EKMGHGFobibhxNxItBNJEaHUNNxIoRNwkZWikJkaCIWoiqrYqoy42LissWCWLiKuIuNIuYrYqstisqssuY2KqMsZY1EaLFiiUVirFiUYhRiFDcSHqbiLRiEmpFHcQhRUQk1FHcHTTUaBl1EaHULRZVNRUTVRFRGn//2Q==");background-repeat: no-repeat; 
                background-attachment: fixed;
                background-size: cover;
               
            }
            h1
            {
                color: white;
                text-align: justify;
            }
            .form2
            {
                text-align: right;
                top: 0;
            }
            

        
        </style>
    </head>
    <body >
        <form >
                     
            <div class="container">
                      
                <form id="card-form" method="post" action="thankyou.jsp">
                    <br>
                    <h1><center>Payment Details</center></h1>
                    <br> 
                 <b><label for="name">Full &nbsp;Name</label><br></label></b>
                    
               <input type="text" class="form-control w-50" id="name" name="name"required>
               <br>
               <b><label for="email">Email </label><br></label></b>
                    
               <input type="email" class="form-control w-50" id="email" name="email" required><br>

               <br>
               
               <div id="whatsapp">
                   <input type="radio" id="visa" name="card" value="visa">
                   <img src="data:image/png;base64,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" 
                   width="60px" height="50px" >
               </div>
                          
               <div id="instgram">
                   <input type="radio" id="master" name="card" value="master">
               <img src="data:image/png;base64,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"
               width="70px" height="50px" >
              </div>
              <br><br>
                <b><label for="card-number">Card &nbsp;number </label><br></label></b>
                    <input type="text" class="form-control w-50" id="card-number" name="cardnumber" placeholder="1111-2222-3333-4444" pattern="[0-9]{16}"required>
                                                       
               <table>
                <br>
                   <tr>
                       <th><label for="expireation-date">Expire&nbsp; Month&nbsp;</label></th>
                       <th><label for="expireation-year">  and &nbsp;Year</label></th>
                   </tr>
                   <tr>
                       <td>
                           <select name="expmonth" id="expiration-date">
                               <option value="01">01</option>
                               <option value="02">02</option>
                               <option value="03">03</option>
                               <option value="04">04</option>
                               <option value="05">05</option>
                               <option value="06">06</option>
                               <option value="07">07</option>
                               <option value="08">08</option>
                               <option value="09">09</option>
                               <option value="10">10</option>
                               <option value="11">11</option>
                               <option value="12">12</option>
                                   
                           </select>
                       </td>
                       <td>
                           <select name="expyear" id="expiration-year">
                               <option value="23">23</option>
                               <option value="24">24</option>
                               <option value="25">25</option>
                               <option value="26">26</option>
                               <option value="27">27</option>
                               <option value="28">28</option>
                               <option value="29">29</option>
                               <option value="30">30</option>
                               <option value="31">31</option>
                               <option value="32">32</option>
                               
                           </select>
                       </td>
                   </tr>
               </table><br>
               <table>
                   <tr>
                       <th><label for="card-name">Card&nbsp; holder &nbsp;name</label></th>
                   </tr>
                   <tr>
                       <td> <input type="text" id="card-name" name="card-name"placeholder="Jonathan Chekop"  class="form-control" required></td>
                   </tr>
                 </table>
                   <br>
                   <table>
                    <tr>
                    <th><label  for="cvv">CVV &nbsp; Number</label></th>
                   </tr>
                   <tr>
                       <td> <input type="text" id="cvv" name="cvv" placeholder="799" pattern="[0-9]{3}"required >
                        <img src="https://www.alliedpay.com/wp-content/uploads/cvv.png"width="70" height="70"></td>
                   </tr>
                   </table>
                   <br>
                   <input type="reset" class="btn btn-success" value="Cancel">
                   <input type="button" class="btn btn-success" value="Pay" onclick="sendMail()">
                   <br><br>
                   <center><div id="paypal-button-container"></div></center>
                   
                   <span>&#10003;</span>
                  <script src="https://www.paypal.com/sdk/js?client-id=AXAaU8ntf87mBMdeKERnvjv2sheJ0mYamHph0GKb7upy-LDpMFUY5P0IenASw6btduR57e-x-2mXZK34"></script>
                
                    <script>
                        paypal.Buttons({
                            createOrder:function(data, actions){
                                return actions.order.create({
                                    purchase_units:[{
                                            amount:{
                                                value:'500.00'
                                            }
                                    }]
                                })
                            }
                        }).render('#paypal-button-container')
                    </script>
           
                    <script>
                        import CryptoJS from "crypto-js";
                        
                        var cardForm=document.getElementById("card-form");
                        
                        cardForm.addEventListener("submit",function(event){
                            event.preventDefault();
                            encryptCardData();
                            sendToServer();
                        });
                        
                        function encryptCardData(){
                            var cardNumber = document.getElementById("card-number").value;
                            var expirationDate = document.getElementById("expiration-date").value;
                            var expirationYear=document.getElementById("expiration-year").value;
                            var cardName=document.getElementById("card-name").value;
                            var cvv = document.getElementById("cvv").value;

                            var cardData = {
                                number: cardNumber,
                                expirationDate: expirationDate,
                                expirationYear:expirationYear,
                                name:cardName,
                                cvv: cvv
                        };
                        
                        var key = CryptoJS.enc.Utf8.parse("YOUR_SECRET_KEY");
                        var iv = CryptoJS.enc.Utf8.parse("YOUR_INITIALIZATION_VECTOR");
                        var cardDataJson = JSON.stringify(cardData);
                        var encryptedCardData = CryptoJS.AES.encrypt(cardDataJson, key, {
                            iv: iv,
                            mode: CryptoJS.mode.CBC,
                            padding: CryptoJS.pad.Pkcs7
                        });
                        return encryptedCardData.toString();
                        }
                        
                        function sendToserver(){
                             var encryptedCardData = encryptCardData();

                        // Send encrypted data to server
                        fetch("/process-payment", {
                        method: "POST",
                        headers: {
                            "Content-Type": "application/json"
                        },
                        body: JSON.stringify({ encryptedCardData: encryptedCardData })
                        })
                        .then(response => {
                            if(response.status ===200){
                                window.location.href='';
                            }
                        })
                        .then(data => {
                            // Do something with the response from the server
                        console.log(data);
                        })
                        .catch(error => {
                            // Handle errors
                        console.error(error);
                        });
                        }
                    </script>
                    
                    <script>
                        function sendMail(){
                                var params={
                                    name:document.getElementById("name").value,
                                    email:document.getElementById("email").value
         
                            };
                        
     
                            const serviceID="service_7t0gjn4";
                            const templateID="template_u2v4up8";

                                emailjs.send(serviceID,templateID,params)
                                       .then((res)=>{
                                            document.getElementById("name").value="";
                                            document.getElementById("email").value="";
                                            console.log(res);
                                            alert("Your message send sucessful");
                                       })
                                       .catch((err)=>console.log(err));
                                    }
                                               
                            
                    </script>

                    
                   <center><p style="color:white">&copy;2022 Property & Finance and Investments Colombo(PVT)Ltd.All rights reserved. </p></center>

                  <div class="container1">
                       
                    
                   <h3><center><br>Movie Detail Summary</center></h3> 
                   <div class="align">
                    <br>
                     <jsp:declaration>
                          String movie= "";
                          String date= "";
                          String time="";
                          String seat="";
            
                       </jsp:declaration>
        
                     <jsp:scriptlet>
                          movie=request.getParameter("movie");
                          date=request.getParameter("date");
                          time=request.getParameter("time");
                          seat=request.getParameter("scategory");
            
                      </jsp:scriptlet>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Movie Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp; 
                    <jsp:expression> movie </jsp:expression>
                    <br><br>
                    
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Movie Date &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;
                    <jsp:expression> date</jsp:expression>
                    <br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Show Time &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;
                    <jsp:expression>time </jsp:expression>
                    <br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Seat category &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;
                      <jsp:expression>seat</jsp:expression>
                    <br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; No. of seat selected &nbsp;:&nbsp;
                    2
                    <br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Total Ticket price &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;
                    LKR.1000


                   </div>
                   
               
                   </div>
                    
                    
                        
                    </form>

                </form><br><br>
             </div>       
                
             <div>
                      
             </div> 
         
        
            <center>
        </footer>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
    
    </center>
    
    </form>

    </body>
</html>