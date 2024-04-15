<%-- 
    Document   : update
    Created on : Jan 14, 2023, 7:52:35 PM
    Author     : Darshana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC Cinema admin</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet"href="update.css">
    </head>
    <body>
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
        <br><br><br><br><br><br><br><br>
        <section>
            
    
        <div class="container border border-danger">
            <center><h1 style="color:white;">NOW SHOWING MOVIES</h1></center>
            <br>
            <form action="upnowshowing" method="post" enctype="multipart/form-data">
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label" style="color:white">Movie ID</label>
                <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Movie ID" name="nsmid">
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label" style="color:white">Movie Name</label>
                <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Movie Name" name="nsmname">
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label" style="color:white">Director Name</label>
                <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Director Name" name="nsmdname">
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label" style="color:white">Writer Name  </label>
                <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Writer Name" name="nsmwriter">
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label" style="color:white">&nbsp;Movie Description</label>
                <textarea class="form-control" id="exampleFormControlInput1" placeholder="Movie Description" name="nsmdes"></textarea>
            </div>
              
            <center><table>
                <tr>
                    <td>
                        <button type="submit" class="btn btn-danger">Submit</button>
                    </td>
                    <td></td>
                   
                </tr>
                </table></center>
               
            </form>
        </div>
        
            <div class="upcoming border border-danger">
            <center><h1 style="color:white">UPCOMING MOVIES</h1></center>
            <br>
            <form action="upcomingzoon" method="post" enctype="multipart/form-data">
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label" style="color:white">&nbsp;&nbsp;Movie ID</label>
                <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Movie ID" name="cmid">
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label" style="color:white">&nbsp;&nbsp;Movie Name</label>
                <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Movie Name" name="cmname">
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label" style="color:white">&nbsp;&nbsp;Directoe Name</label>
                <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Director Name" name="cmdnam">
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label" style="color:white">&nbsp;&nbsp;Writer Name  </label>
                <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Movie Writter" name="cmid">
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label" style="color:white">&nbsp;Movie Description</label>
                <textarea class="form-control" id="exampleFormControlInput1" placeholder="Movie Description" name="cmdes"></textarea>
            </div>
               
            <center><table>
                <tr>
                    <td>
                        <button type="submit" class="btn btn-danger">Submit</button>
                    </td>
                    <td></td>
                   
                </tr>
                </table></center>
               
            </form>
        </div>
        </section>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
    </body>
</html>