<%@page import="java.util.List"%>
 <%@ page language="java"  import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>This is Home Page	</h1>
<h2>THis is home controller</h2>

<%
String name = (String)request.getAttribute("name");
List<String> friends = (List<String> )request.getAttribute("f");
%>

<h1>Name is <%=name%></h1>


</body>
</html>