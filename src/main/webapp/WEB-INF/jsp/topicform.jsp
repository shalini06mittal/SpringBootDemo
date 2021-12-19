<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
button{
	background-color: orange !important;
	color:black !important;
}
</style>
</head>
<body>
	
	<div class='container'>
		<h1>Fill in the details</h1>
		<form action='add' method="POST">
			  <div class="form-group">
			    <label for="id">ID:</label>
			    <input type="text" class="form-control" id="id" 
			    name="id"
			    aria-describedby="emailHelp" placeholder="Enter Id">
			  </div>
			  <div class="form-group">
			    <label for="name">Topic Name</label>
			    <input type="text" class="form-control"
			    	name="name"
			     id="name" placeholder="Topic Name">
			  </div>
			  <div class="form-group">
			     <label for="desc">Description</label>
			    <input type="text" class="form-control" 
			    name="description" id="desc" placeholder="Topic Description">
			  </div>
			  <button type="submit" class="btn btn-primary">Add Topic</button>
		</form>
	</div>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>