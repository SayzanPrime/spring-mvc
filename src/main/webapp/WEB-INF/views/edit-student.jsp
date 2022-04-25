<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ page import="com.example.crud.models.Student" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Students</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link href="resources/css/styles.css" rel="stylesheet">
</head>
<body class="text-center">	

<%@ include file="header.html" %> 
<br><br><br>

	<h3>Edit New Student</h3>
	<br><br>
       <form:form method="post" action="/crud/editStudent" modelAttribute="student" style="margin: 0 auto;">  
       <div class="table-responsive" style="text-align: center; height:500px;">
	      	<table class="table"> 
	      	 <tr>  
	        	<td></td>    
	         	<td><form:hidden path="id" /></td>  
	         </tr>    
	         <tr>  
	          <td>Full Name : </td> 
	          <td><form:input path="full_name"/></td>
	         </tr>  
	         <tr>  
	          <td>Address :</td>  
	          <td><form:input path="address"/></td>
	         </tr> 
	         <tr>  
	          <td>Group :</td>  
	          <td><form:input path="group_name"/></td>
	         </tr> 
	         <tr>  
	          <td> </td>  
	          <td><input type="submit" value="Edit"/></td>  
	         </tr>  
	        </table>  
        </div>
       </form:form>  
       
	<%@ include file="footer.html" %> 
</body>
</html>
