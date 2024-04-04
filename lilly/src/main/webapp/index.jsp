<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

.form
{
display: flex;
justify-content: center;
width:500px;
height:200px;
margin-left:600px;
margin-top:200px;
border-style:outset;
background-color:white;
}
body
{
background-color:#F5F5F5;
}


.msg
{

margin-top:20px;
}
</style>

</head>
<body>

<div align="center">
<nav class="navbar navbar-dark bg-primary " style="background-color: #e3f2fd;">
<div class="\\navbar-header\\\">
  <div class="container-fluid">
    <a class=" btn btn-primary navbar-brand" href="DegreePercentage.jsp">Student</a>
    <a class=" btn btn-primary navbar-brand" href="Market.jsp">Market</a>
    </div>
  </div>
</nav>
</div>


<div class="form">
<form class="container mt-xxl-5  w-100" action="clg" method="post">

<div class="msg">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Message&nbsp;&nbsp;<input type="text" name="msg">
<input type="submit" value="send">
</div>


</form>
</div>

</body>
</html>