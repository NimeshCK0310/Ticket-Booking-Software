<%-- 
    Document   : movie
    Created on : Jan 14, 2023, 7:44:45 PM
    Author     : Darshana
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="with=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="movie.css">
    </head>
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
        
        <body>
       
           
            <section class="header">
                <nav style="background-color: black;">
                 <p class="log"><b><a href="#"> <img src="abclogo.png" alt="" width="90px" height="90px"></a></b></p>
                    <div class="nav-links" id="navLinks">
                        <i class="fa fa-times" onclick="hideMenu()"></i>
                        <ul>
                            <li><a href="dashboard.jsp">Dashboard</a></li>
                            <li><a href="movie.jsp">Movies</a></li>
                            <li><a href="movieadd.jsp">Movie Add</a></li>
                            <li><a href="update.jsp">Update Movie</a></li>
                            
                        </ul>
                    </div>
                    <i class="fa fa-bars" onclick="showMenu()"></i>
                </nav>
                <hr>
                 <form acion="config" method="post">
                <button class="button" ><a href="movieadd.jsp">+Add Movies</a> </button>
            
                <br>                

            
                <div class="row">
                    <div class="row-image" >
                        <img src="logo.jpeg" style="width:244px; height:363px;  margin-left: 100px;" >
                    </div>
                    <div class="row-one">
                        <p><div class="green">Movie Id <br><br><br>
                            Movie Title:<br><br><br>
                            Director :<br><br><br><%=mid%>
                            Writer :<br><br><br>
                           
                            Description:
                        </div></p></div>
                        <div class="row-two">
                            <br><p><%=mid%><br><br><br>
                            <%=title%><br><br><br>
                            <%=director%><br><br><br>
                            <%=writer%>
                            <br><br><br>
                            <p><%=description%></p>
                        
                    </div>
                </div>
                <div class="submit">
                     <button class="button1" ><a href="update.jsp">Edit</a> </button>
                    <button class="button2" ><a href="movied.jsp">Delete</a> </button>
                  
                </div>
                <br>
                <br><br>
                <hr>
                
                
                <br><br><br>
                
                <br><br>
                <br>
                
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
         
        
        </form>
            <%
                }
            } catch (Exception e) {
                out.println(e);
            } %>
            
    </body>
</html>

