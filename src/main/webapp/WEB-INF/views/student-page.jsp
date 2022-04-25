<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ page import="java.util.List" %>
<%@ page import="com.example.crud.models.Student" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Students</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link href="resources/css/styles.css" rel="stylesheet">
</head>
<body>

<%@ include file="header.html" %> 
<br><br><br>

<h3 style="justify-content: center;
  text-align: center;">Students</h3> 
	<br>
	 
	 <div class="table-responsive" style="text-align: center; height:500px; overflow: scroll">
		<table class="table">
		  <thead class="table-info">
		    <tr>	
		      <th scope="col">Full Name</th>
		      <th scope="col">Address</th>
		      <th scope="col">Group</th>
		      <th scope="col">Edit</th>
		      <th scope="col">Delete</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach var="student" items="${students}">  
			    <tr>
			      <td>${student.full_name}</td>
			      <td>${student.address}</td>
			      <td>${student.group_name}</td>
			      <td><a href="editForm/${student.id}">Edit</a></td>
			      <td><a style="color: red;" href="deleteStudent/${student.id}">Delete</a></td>
			    </tr>
			 </c:forEach> 
		  </tbody>
		</table>
		<a href="addForm" style="color: green;">Add New Student</a>  
	</div>
	
	<%@ include file="footer.html" %> 
	
</body>
</html>
