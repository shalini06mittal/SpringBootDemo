<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<style>	
	
	.header{
		padding:30px;
		background-color: orange;
		text-align: center;
	}
	body{
	margin:0;}
	
	.add a{
		text-decoration: none;
		font-size:20px;
		color:#a60e87;
	}
	.add a:hover{
		text-decoration: underline;
		color:black;
	}
	a{
	text-decoration: none;
	color:orange;
	}
	</style>
</head>
<body>
<div class ='header'>
	<h1>Explore the possibilities</h1>
	<p>Get variety of courses under one roof...</p>
</div>
	<div class='container'>
	<c:if test="${empty topics }">
		<h1>No topics available...</h1>
	</c:if>
	<c:if test="${!empty topics }">
		<h1>List of topics:-</h1>
		<table class='table'>
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th></th>
			
		</tr>
		<c:forEach var="topic" items="${topics }">
			<tr>
				<td>${topic.name}</td>
				<td>${topic.description}</td>
				<td><a href='delete/${topic.id}'>Delete</a></td>			
			</tr>
		</c:forEach>
		</table>
	</c:if>
	<div class='add'>
	<a href="addtopic">Add Topic</a>
	</div>
	</div>
	
</body>

</html>