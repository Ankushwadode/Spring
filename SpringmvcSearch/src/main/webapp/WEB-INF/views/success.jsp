<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h2>Name:${student.name }</h2>
<h2>Id:${student.id}</h2>
<h2>Email:${student.email }</h2>
<h2>Password:${student.password }</h2>
<h2>DOB:${student.date }</h2>
<h2>Courses:${student.courses}</h2>
<h2>Gender:${student.gender }</h2>
<h2>Student type:${student.type }</h2>
<h2>Address:</h2>
<h3>Street:${student.address.street }</h3>
<h3>City:${student.address.city }</h3>
</body>
</html> 