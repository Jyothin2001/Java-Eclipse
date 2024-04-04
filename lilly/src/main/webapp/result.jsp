<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#F5F5F5">

<div align="center">
<nav class="navbar navbar-dark bg-primary" style="background-color: #e3f2fd;">
<div class="navbar-header">
  <div class="container-fluid">
    <a class=" btn btn-primary navbar-brand" href="index.jsp">Home</a>
    <a class=" btn btn-primary navbar-brand" href="DegreePercentage.jsp">Form</a>
     </div>
     </div>
</nav>
</div>
<br><br>

<div>
<h2>Student Result Details:</h2><br>
<h3>Name :&nbsp;<span style="color:blue">${name}</span></h3>
<h3>Email :&nbsp;<span style="color:blue">${email}</span></h3>
<h3>College :&nbsp;<span style="color:blue">${college}</span></h3>
<h3>Degree :&nbsp;<span style="color:blue">${degree}</span></h3>
<h3>Stream :&nbsp;<span style="color:blue">${stream}</span></h3>
<h3>Percentage :&nbsp;<span style="color:blue">${percentage}</span></h3>
</div>
</body>
</html>

