<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<div align="center">
<nav class="navbar navbar-dark bg-primary" style="background-color: #e3f2fd;">
<div class="navbar-header">
  <div class="container-fluid">
    <a class=" btn btn-primary navbar-brand" href="index.jsp">Home</a>
    <a class=" btn btn-primary navbar-brand" href="ContactDetails.jsp">Contact Details</a>
     </div>
     </div>
</nav>

</div>
<br>

<div class="form">
<h1>Below are complete Details:</h1><br><br>

<h3>First Name :&nbsp;<span style="color:blue">${firstname}</span></h3><br>
<h3>Last Name :&nbsp;<span style="color:blue">${lastname}</span></h3><br>
<h3>Email :&nbsp;<span style="color:blue">${email}</span></h3><br>
<h3>Mobile :&nbsp;<span style="color:blue">${mobile}</span></h3><br>
</div>
</body>
</html>