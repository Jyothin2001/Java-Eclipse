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
width:350px;
height:300px;
margin-left:500px;
margin-top:100px;
border-style:outset;
background-color:#FFFFFF;
}
body
{
background-color:#F5F5F5;
}
</style>

</head>
<body>

<div align="center">
<nav class="navbar navbar-dark bg-primary" style="background-color: #e3f2fd;">
  <div class="container-fluid">
    <a class=" btn btn-primary navbar-brand" href="">Home</a>
     </div>
</nav>
</div>
<br>

<div class="form">
<form class="container mt-xxl-5  w-100" action="first" method="post">
<h2 style="color:blue">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Login</h2>
<br>


First Name: <input type="text" id="name" name="name"><br><br>
Last Name: <input type="text" id="last" name="last"><br><br>
<input type="submit" value="Send">

</form>
</div>

</body>
</html>