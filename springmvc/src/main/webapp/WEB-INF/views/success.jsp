<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<%-- <h2>Welcome, ${name }</h2>
<h2>Your email address is, ${email } </h2>
<h2>Your Password is, ${password }</h2> --%>
<h2>${msg }</h2>
<h2>your name is, ${user.name }</h2>
<h2>your email address is, ${user.email }</h2>
<h2>your password is, ${user.password }</h2>
</body>
</html> 