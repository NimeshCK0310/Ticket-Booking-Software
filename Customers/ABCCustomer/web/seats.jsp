<%-- 
    Document   : seat
    Created on : Jan 16, 2023, 12:21:04 PM
    Author     : Nimesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="x-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Movie seat booking</title>

        <link rel="stylesheet" href="style.css">

        <style>
            @import url('https://fonts.googleapis.com/css?family=Lato&display=swap');

            *{
                box-sizing: border-box;
            }

            body{
                background-color: #242333;
                display: flex;
                flex-direction: column;
                color: white;
                align-items: center;
                justify-content: center;
                height: 100vh;
                font-family: 'lato','sans-serif';

            }

            .seat
            {
                background-color: #444451;
                height: 18px;
                width: 20px;
                margin: 3px;
                border-top-left-radius: 5px;
                border-top-right-radius: 5px;
                font-size: 10px;
                text-align: center;
                align-items: center;
                
            }

            .row
            {
                display: flex;
            }

            .movie-container
            {
                margin: 20px 0;
            }

            .movie-container select
            {
                background-color: #fff;
                border: 0;
                border-radius: 5px;
                font-size: 14px;
                margin-left: 10px;
                padding: 5px 15px 5px 15px;
                -moz-appearance: none;
                -webkit-appearance: none;
                appearance: none;                
            }

            .seat.Selected
            {
                background-color: green;
            }

            .seat.Occupied
            {
                background-color: red;
            }

            .seat:nth-of-type(6)
            {
                margin-right: 18px;
            }

            .seat:nth-last-of-type(6)
            {
                margin-left: 18px;
            }

            .seat:not(.Occupied):hover
            {
                cursor: pointer;
                transform: scale(1,2);
            }

            .showcase .seat:not(.Occupied):hover
            {
                cursor: default;
                transform: scale(1);
            }

            .showcase
            {
                background-color: rgba(0, 0,0,0.1);
                padding: 5px 10px;
                border-radius: 5px;
                color: #777;
                list-style-type: none;
                display: flex;
                justify-content: space-between;
            }
            .showcase li
            {
                display: flex;
                align-items: center;
                justify-content: center;
                margin: 5px 10px;
            }

            .showcase li small
            {
                margin-left:10px;
            }

            .screen
            {
                background-color: #fff;
                height: 50px;
                width: 100%;
                margin: 15px 0;
                transform: rotateX(-45deg);
                box-shadow: 0 3px 10px rgba(255,255,255,0.75);
            }

            .container 
            {
                perspective: 1000px;
                margin-bottom: 30px;
            }

            p.text
            {
                margin: 5px 0;
            }

            p.text span
            {
                color: #95eaf0;
            }
            .seat
            {
                height: 20px;
            }
            
        </style>
        
    </head>
    <body>
        
        <form action="payment.jsp" method="post">
        <div class="movie-container">
            <label><center><h2>Seat Booking</h2></center> </label><br><br>
          
                
            
            <center><table>
                  <tr>
                    <td>
                        <select name="scategory" id="movie" class="form-select form-select-lg mb-3">
                            <option>Seat Category</option>
                            <option value="First Class">First Class</option>
                            <option value="ODC">ODC</option>
                            <option value="BOX">BOX</option>
                           
                        </select>
                    </td> 
                 
                </tr>
                </table></center>
        </div>
        <ul class="showcase">

            <li>
                <div class="seat"></div>
                <small>Available seats</small>
            </li>

            <li>
                <div class="seat Selected"></div>
                <small>Selected seats</small>
            </li>

            <li>
                <div class="seat Occupied"></div>
                <small>Occupied seats</small>
            </li>

        </ul>

        <div class="container"> 
            <h3>First Class</h3>
            <div class="screen"></div>

            <div class="row"> <div> A :</div>
                <div class="seat">A1</div>
                <div class="seat">A2</div>
                <div class="seat">A3</div>
                <div class="seat">A4</div>
                <div class="seat">A5</div>
                <div class="seat">A6</div>
                <div class="seat">A7</div>
                <div class="seat">A8</div>
                <div class="seat">A9</div>
                <div class="seat">A10</div>
                <div class="seat">A11</div>
                <div class="seat">A12</div>
                <div class="seat">A13</div>
                <div class="seat">A14</div>
                <div class="seat">A15</div>
                <div class="seat">A16</div>
                <div class="seat">A17</div>
                <div class="seat">A18</div>
                <div class="seat">A19</div>
                <div class="seat">A20</div>
                <div class="seat">A21</div>
        </div>

                <div class="row"> <div> B :</div>
                <div class="seat">B1</div>
                <div class="seat">B2</div>
                <div class="seat">B3</div>
                <div class="seat">B4</div>
                <div class="seat">B5</div>
                <div class="seat">B6</div>
                <div class="seat">B7</div>
                <div class="seat">B8</div>
                <div class="seat">B9</div>
                <div class="seat">B10</div>
                <div class="seat">B11</div>
                <div class="seat">B12</div>
                <div class="seat">B13</div>
                <div class="seat">B14</div>
                <div class="seat">B15</div>
                <div class="seat">B16</div>
                <div class="seat">B17</div>
                <div class="seat">B18</div>
                <div class="seat">B19</div>
                <div class="seat">B20</div>
                <div class="seat">B21</div>
        </div>
            <div class="row"> <div> C :</div>
                <div class="seat">C1</div>
                <div class="seat">C2</div>
                <div class="seat">C3</div>
                <div class="seat">C4</div>
                <div class="seat">C5</div>
                <div class="seat">C6</div>
                <div class="seat">C7</div>
                <div class="seat">C8</div>
                <div class="seat">C9</div>
                <div class="seat">C10</div>
                <div class="seat">C11</div>
                <div class="seat">C12</div>
                <div class="seat">C13</div>
                <div class="seat">C14</div>
                <div class="seat">C15</div>
                <div class="seat">C16</div>
                <div class="seat">C17</div>
                <div class="seat">C18</div>
                <div class="seat">C19</div>
                <div class="seat">C20</div>
                <div class="seat">C21</div>
           </div>
           <div class="row"> <div> D :</div>
                <div class="seat">D1</div>
                <div class="seat">D2</div>
                <div class="seat">D3</div>
                <div class="seat">D4</div>
                <div class="seat">D5</div>
                <div class="seat">D6</div>
                <div class="seat">D7</div>
                <div class="seat">D8</div>
                <div class="seat">D9</div>
                <div class="seat">D10</div>
                <div class="seat">D11</div>
                <div class="seat">D12</div>
                <div class="seat">D13</div>
                <div class="seat">D14</div>
                <div class="seat">D15</div>
                <div class="seat">D16</div>
                <div class="seat">D17</div>
                <div class="seat">D18</div>
                <div class="seat">D19</div>
                <div class="seat">D20</div>
                <div class="seat">D21</div>
           </div>
            <h3>ODC</31>
           <div class="screen"></div>
           <div class="row"> <div> E :</div>
                <div class="seat">E1</div>
                <div class="seat">E2</div>
                <div class="seat">E3</div>
                <div class="seat">E4</div>
                <div class="seat">E5</div>
                <div class="seat">E6</div>
                <div class="seat">E7</div>
                <div class="seat">E8</div>
                <div class="seat">E9</div>
                <div class="seat">E10</div>
                <div class="seat">E11</div>
                <div class="seat">E12</div>
                <div class="seat">E13</div>
                <div class="seat">E14</div>
                <div class="seat">E15</div>
                <div class="seat">E16</div>
                <div class="seat">E17</div>
                <div class="seat">E18</div>
                <div class="seat">E19</div>
                <div class="seat">E20</div>
                <div class="seat">E21</div>
           </div>
              <div class="row"> <div> F :</div>
                <div class="seat">F1</div>
                <div class="seat">F2</div>
                <div class="seat">F3</div>
                <div class="seat">F4</div>
                <div class="seat">F5</div>
                <div class="seat">F6</div>
                <div class="seat">F7</div>
                <div class="seat">F8</div>
                <div class="seat">F9</div>
                <div class="seat">F10</div>
                <div class="seat">F11</div>
                <div class="seat">F12</div>
                <div class="seat">F13</div>
                <div class="seat">F14</div>
                <div class="seat">F15</div>
                <div class="seat">F16</div>
                <div class="seat">F17</div>
                <div class="seat">F18</div>
                <div class="seat">F19</div>
                <div class="seat">F20</div>
                <div class="seat">F21</div>
           </div>
            <div class="row"> <div> G :</div>
                <div class="seat">G1</div>
                <div class="seat">G2</div>
                <div class="seat">G3</div>
                <div class="seat">G4</div>
                <div class="seat">G5</div>
                <div class="seat">G6</div>
                <div class="seat">G7</div>
                <div class="seat">G8</div>
                <div class="seat">G9</div>
                <div class="seat">G10</div>
                <div class="seat">G11</div>
                <div class="seat">G12</div>
                <div class="seat">G13</div>
                <div class="seat">G14</div>
                <div class="seat">G15</div>
                <div class="seat">G16</div>
                <div class="seat">G17</div>
                <div class="seat">G18</div>
                <div class="seat">G19</div>
                <div class="seat">G20</div>
                <div class="seat">G21</div>
           </div>
            <div class="row"> <div> H :</div>
                <div class="seat">H1</div>
                <div class="seat">H2</div>
                <div class="seat">H3</div>
                <div class="seat">H4</div>
                <div class="seat">H5</div>
                <div class="seat">H6</div>
                <div class="seat">H7</div>
                <div class="seat">H8</div>
                <div class="seat">H9</div>
                <div class="seat">H10</div>
                <div class="seat">H11</div>
                <div class="seat">H12</div>
                <div class="seat">H13</div>
                <div class="seat">H14</div>
                <div class="seat">H15</div>
                <div class="seat">H16</div>
                <div class="seat">H17</div>
                <div class="seat">H18</div>
                <div class="seat">H19</div>
                <div class="seat">H20</div>
                <div class="seat">H21</div>
           </div>
            <div class="row "> <div> I&nbsp;&nbsp;&nbsp;:</div>
                <div class="seat">I1</div>
                <div class="seat">I2</div>
                <div class="seat">I3</div>
                <div class="seat">I4</div>
                <div class="seat">I5</div>
                <div class="seat">I6</div>
                <div class="seat">I7</div>
                <div class="seat">I8</div>
                <div class="seat">I9</div>
                <div class="seat">I10</div>
                <div class="seat">I11</div>
                <div class="seat">I12</div>
                <div class="seat">I13</div>
                <div class="seat">I14</div>
                <div class="seat">I15</div>
                <div class="seat">I16</div>
                <div class="seat">I17</div>
                <div class="seat">I18</div>
                <div class="seat">IF19</div>
                <div class="seat">I20</div>
                <div class="seat">I21</div>
           </div>
           <h3>BOX </h3>
          
           <div class="screen"></div>
           <div class="row"> <div> J :</div>
                <div class="seat">J1</div>
                <div class="seat">J2</div>
                <div class="seat">J3</div>
                <div class="seat">J4</div>
                <div class="seat">J5</div>
                <div class="seat">J6</div>
                <div class="seat">J7</div>
                <div class="seat">J8</div>
                <div class="seat">J9</div>
                <div class="seat">J10</div>
                <div class="seat">J11</div>
                <div class="seat">J12</div>
                <div class="seat">J13</div>
                <div class="seat">J14</div>
                <div class="seat">J15</div>
                <div class="seat">J16</div>
                <div class="seat">J17</div>
                <div class="seat">J18</div>
                <div class="seat">J19</div>
                <div class="seat">J20</div>
                <div class="seat">J21</div>
           </div>
        </div>

        <p class="text">
            You have selected <span id="count" >0</span>
            Seats for a price of LKR.<span id="total">00.00</span>
        </p>

        <br>
        
       
        <center><input  type="submit" value="continue"></center>
        <script src="seat.js"></script>
        </form>
        
    </body>
</html>