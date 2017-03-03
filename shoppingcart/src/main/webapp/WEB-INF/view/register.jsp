<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<form action="register" method="post">
    <label><b>Name</b></label>
    <input type="text" name="name"><br>
  
    <br><label><b>UserName</b></label>
    <input type="text" name="username"/><br>
    
     <br><label><b>Password</b></label>
    <input type="password" name="password"/> <br>
    
    <br><label><b>Address</b></label> 
    <input type="text" name="address"/><br>
    
     <br><label><b>EmailId</b></label>
    <input type="text" name="email"><br>
    
     <input type="submit" value="Submit">
    
  </form>
 
</body>
</html>