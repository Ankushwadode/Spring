<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h2>This is home Page. called by home controller. url /home</h2>
	<%
		String name=(String)request.getAttribute("name");
		Integer id=(Integer)request.getAttribute("id");
		List<String> friList=(List<String>)request.getAttribute("f");
	%>
	<h2>
		Name is: <%=name %> <br>
		Id is: <%=id %><br>
	</h2>
		<%
			for(String s:friList){
		%>
			<h2><%=s %></h2>
		<%	
			}
		%>
	
</body>
</html>