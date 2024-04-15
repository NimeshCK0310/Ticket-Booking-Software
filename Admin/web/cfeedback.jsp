<%-- 
    Document   : cfeedback
    Created on : Jan 16, 2023, 2:53:31 AM
    Author     : Darshana
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        <script src="https://kit.fontawesome.com/67c66657c7.js"></script>
        <script src="https://kit.fontawesome.com/ce4d183c2.js" crossorigin="anonymous"></script>
        <link rel="shortcut icon" href="images/fav-icon.png">
        <link rel="stylesheet" href="cfeedback.css">
    </head>
    <body>
        <%
            Connection con = null;
            PreparedStatement st = null;
            ResultSet rs = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/abccinema","root","");
                String sql = "SELECT * FROM cfeedback";
                st = con.prepareStatement(sql);
                rs = st.executeQuery();
                while(rs.next()){
                   
                    String fid= rs.getString("id");
                    String cname = rs.getString("cname");
                    String cemail = rs.getString("email");
                    String cdes = rs.getString("description");
                    
                    


        %>
        <form acion="config" method="post"  >
            <section id="test">
                <div class="test-heading">
                    <span>Comments</span>
                    <h1>Client Says</h1>
                </div>
                <div class="test-box-container">
                    <div class="test-box">
                        <div class="box-top">
                            <div class="profile">
                                
                                <div class="name-user">
                                    <strong><%=cname%></strong>
                                    <span><%=cemail%></span>
                                </div>
                                <div class="cliet-comment">
                                    <p><%=cdes%></p>
                                </div>
                                </div>
                        </div>
                    </div>
                </div>
                 
                
                 
            </section>
        </form>
          <%
                }
            } catch (Exception e) {
                out.println(e);
            } %>
    </body>
</html>
