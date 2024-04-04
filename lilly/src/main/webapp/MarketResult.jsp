<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>


</style>
</head>
<body style="background-color:#F5F5F5">

<div align="center">
<nav class="navbar navbar-dark bg-primary" style="background-color: #e3f2fd;">
<div class="navbar-header">
  <div class="container-fluid">
    <a class=" btn btn-primary navbar-brand" href="index.jsp">Home</a>
    <a class=" btn btn-primary navbar-brand" href="Market.jsp">Form</a>
     </div>
     </div>
</nav>
</div>
<br><br>

<div >
<h2>Market Details:</h2><br>
<h3>Name :&nbsp;<span style="color:blue">${name}</span></h3>
<h3>Pincode :&nbsp;<span style="color:blue">${pincode}</span></h3>
<h3>Area :&nbsp;<span style="color:blue">${Area}</span></h3>
<h3>Location :&nbsp;<span style="color:blue">${location}</span></h3>
<h3>Stall :&nbsp;<span style="color:blue">${stall}</span></h3>
<h3>Quality :&nbsp;<span style="color:blue">${quality}</span></h3>
<h3>Quantity :&nbsp;<span style="color:blue">${quantity}</span></h3>
<h3>Owner :&nbsp;<span style="color:blue">${owner}</span></h3>
<h3>KEB Number :&nbsp;<span style="color:blue">${keb}</span></h3>
<h3>GST :&nbsp;<span style="color:blue">${gst}</span></h3>
<h3>Transaction :&nbsp;<span style="color:blue">${transaction}</span></h3>
<h3>Item :&nbsp;<span style="color:blue">${item}</span></h3>
<h3>City :&nbsp;<span style="color:blue">${city}</span></h3>
<h3>Cost :&nbsp;<span style="color:blue">${cost}</span></h3>
<h3>Type :&nbsp;<span style="color:blue">${type}</span></h3>
</div>


</body>
</html>