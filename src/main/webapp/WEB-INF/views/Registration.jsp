<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
<h1>REGISTER FORM</h1>


<form action="registercontroller" method="post" >

<input type="text" name="namefield" id="Name" placeholder="Enter Name" required >
<input type="text" name="Username" id="Username" placeholder="Enter Username" required >
<input type="password" name="Password" id="Password" placeholder="Enter Password" required >
<input type="submit">

</form>

</body>
</html>