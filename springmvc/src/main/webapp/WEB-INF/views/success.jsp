<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${Header }</h1>
<p>${Desc }</p>
<hr>
<h1> Welcome Durgesh</h1>
<h2>Your email address is ${user.email}</h2>
<h2>Your Name is ${user.name}</h2>
<h2>Your Password ${user.password}</h2>
</body>
</html>