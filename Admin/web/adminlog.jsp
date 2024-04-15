<%-- 
    Document   : adminlog
    Created on : Jan 14, 2023, 7:29:15 PM
    Author     : Darshana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width , initial-scale=1.0">
        <title>ABC Cinema</title>
        <link rel="stylesheet" href="adminlog.css">  
       <script  language="javascript" type="text/javascript">
        function validate()
        {
            if(document.form.pswrd.value.length<8)
            {
                window.alert("Password must be at least 8 Charackters")
            }
        }
        
       </script>
    <a href="adminlog.jsp"></a>
    </head>
    <body>
       
        <form name="form" method="post" action="adminlog">
            <div class="logo">
               
            </div>
            <p class="log"><b><a href="#"> <img src="abclogo.png" alt="" width="90px" height="90px"></a></b></p>
        
        <div class="content">
            <div class="logform">
                
                <h1><b>LOGIN</b> </h1>
               
                <label for="">
                    <span>
                        User Name :
                    </span>
                        <input type="text"  name="uname" id="usernmame" required>
                        <div class="error"></div>
                </label>
                
                <label for="">
                   
                    <span>
                        <b>  Password :</b>
                    </span>
                
                        <input type="password"  name="pswrd" id="upswrd" >
                        <div class="error"></div>
                </label> 
                        
                <p class="fgtpsswrd"><a href="#">Forget Password ?</a></p>
                <button type="submit" class="logbtn"  onclick="validate()"> Log In </button>

            </div>
             
            <div class="subc"> 
                <div class="image">
                    <center><div class="txtimg">
                            <h2 style="align:center;">Welcome</h2> <br>
                           
                    </div></center>
                    
                </div>
             </div>
        </div>
        </form>
    </body>
</html>