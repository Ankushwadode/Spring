<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h2>how can i help you??</h2>
<%-- 
<%
String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("2id");
LocalDateTime time=(LocalDateTime)request.getAttribute("time"); 
%> 
 --%>
<%--
 <h2>Name: <%=name %>  </h2>
<h2>ID: <%=id %> </h2>
<h2>Date and Time:  <%=time %> </h2> 
--%>

<h2>Name: ${name }  </h2>
<h2>ID: ${id } </h2>
<h2>Date and Time: ${time } </h2>
<hr>

<c:forEach var="items" items="${mark }">
<%-- <h2>${items }</h2> --%>
<h2><c:out value="${items }"></c:out></h2>
</c:forEach>

</body>
</html>