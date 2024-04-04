<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<script src="college.js"></script>

<meta charset="ISO-8859-1">

<title>JSP percentage</title>

<style>

.form
{
display: flex;
justify-content: center;
width:800px;
height:700px;
margin-left:500px;
margin-top:100px;
border-style:outset;
background-color:white;
}
</style>

</head>


<body style="background-color:#F5F5F5">

<div align="center">
<nav class="navbar navbar-dark bg-primary" style="background-color: #e3f2fd;">
  <div class="container-fluid">
    <a class=" btn btn-primary navbar-brand" href="index.jsp">Home</a>
     </div>
</nav>
</div>


<div class="form">
<form  name="student" class="container mt-xxl-5  w-100"  action="college" method="post">

<h2 style="color:blue">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Student Details Form</h2>
<br>

<div class="input-group mb-3 ">
<span class="input-group-text" id="nameerror">Name&nbsp;&nbsp;</span>
  <input type="text" name="name" id="name1"  onblur="nameValidation()" class="form-control" placeholder="Enter Name" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>


<div class="input-group mb-3 ">
  <span class="input-group-text" id="basic-addon1">Email&nbsp;&nbsp;</span>
  <input type="text" name="email" id="email1" onblur="emailValidation()" class="form-control" placeholder="Enter Email Address" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>


<div class="input-group mb-3 ">
<span class="input-group-text" id="percenterror">Percentage&nbsp;&nbsp;</span>
  <input type="text" name="percentage" id="percentage1"  onblur="percentageValidation()" class="form-control" placeholder="Enter Name" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>


<span id="collegeerror"></span>
<div class="mb-3">
College<select name="college"  id="college1" onblur="collegeValidation()" class="form-select form-select-sm " aria-label=".form-select-lg example">
  <option selected value="">---Choose---&nbsp;</option>
  <option value="comeputerScience">Bengaluru City University</option>
  <option value="Mathematics">Christ University</option>
  <option value="Physics">Jain University</option>
  <option value="Zoology">PES University</option>
</select>
</div>
<br>


<span id="errordegree"></span>
<div class="mb-3">
Degree<select name="degree"  id="degree1" onblur="degreeValidation()" class="form-select  " aria-label=".form-select-lg example">
<option selected value="">--choose--&nbsp;</option>
  <option value="Black">Associate degree </option>
  <option value="Blue">Business Administration</option>
  <option value="Red">Bachelor of Business Administration</option>
  <option value="White">Bachelor of Fine Arts</option>
</select>
</div>
<br>


<span id="errorstream"></span>
<div class="mb-3">
Stream<select name="stream"  id="stream1" onblur="streamValidation()" class="form-select  " aria-label=".form-select-lg example">
<option selected value="">--choose--&nbsp;</option>
  <option value="Bachelor of Journalism">Bachelor of Journalism</option>
  <option value="BA LLB">BA LLB</option>
  <option value="Biotechnology">Biotechnology</option>
  <option value="Computer Science">Computer Science</option>
  <option value="Electronics">Electronics</option>
  <option value="Mathematics">Mathematics</option>
  <option value="Physics">Physics</option>
   </select>
</div>
<br>
         

<div align="center">
<input class="btn btn-primary" id="submit1"  type="submit" value="Submit" disabled >
</div>

</form>
</div>


</body>
</html>