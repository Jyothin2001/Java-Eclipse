<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<script type="text/javascript" src="Market1.js"></script>

<meta charset="ISO-8859-1">

<title>Market JSP</title>

<style>

.form
{
display: flex;
justify-content: center;
width:800px;
height:1350px;
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
    <a class=" btn btn-primary navbar-brand" href="index.jsp">Home</a>
     </div>
</nav>
</div>


<div class="form">
<form  name="student" class="container mt-xxl-5  w-100"  action="market" method="post">

<h2 style="color:blue">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Market Detail Form</h2>
<br>

<div class="input-group mb-3 ">
<span class="input-group-text" id="nameerror">Name&nbsp;&nbsp;</span>
  <input type="text" name="name" id="name"  onblur="nameValidation()" class="form-control" placeholder="Enter Name" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>


<div class="input-group mb-3 ">
  <span class="input-group-text" id="basic-addon1">Pincode&nbsp;&nbsp;</span>
  <input type="number" name="pincode" id="pincode1" onblur="pincodeValidation()" class="form-control" placeholder="Enter Pincode" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>


<div class="input-group mb-3 ">
<span class="input-group-text" id="areaerror">Area&nbsp;&nbsp;</span>
  <input type="text" name="Area" id="Area"  onblur="areaValidation()" class="form-control" placeholder="Enter Area" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>


<span id="locationeerror"></span>
<div class="input-group mb-3">
  <label class="input-group-text" for="inputGroupSelect01">Location</label>
  <select class="form-select" name="location"  id="location" onblur="locationValidation()" id="inputGroupSelect01">
    <option selected value="">Choose...</option>
    <option value="Hoskote">Hoskote</option>
    <option value="KRpuram">KRpuram</option>
    <option value="Malleswaram">Malleswaram</option>
    <option value="Mejestic">Mejestic</option>
    <option value="Yashvantapura">Yashvantapura</option>
  </select>
</div>




<div class="input-group mb-3 ">
<span class="input-group-text" id="stallerror">Stall Number&nbsp;&nbsp;</span>
  <input type="number" name="stall" id="stall"  onblur="stallValidation()" class="form-control" placeholder="Enter Stall Number" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>

<div class="input-group mb-3 ">
<span class="input-group-text" id="itemerror">Item Name&nbsp;&nbsp;</span>
  <input type="text" name="item" id="item"  onblur="itemValidation()" class="form-control" placeholder="Enter Item name" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>

<div class="input-group mb-3 ">
<span class="input-group-text" id="qualityerror">Item Quality&nbsp;&nbsp;</span>
  <input type="text" name="quality" id="quality"  onblur="itemQualityValidation()" class="form-control" placeholder="Item Quality" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>


<span id="errottype"></span>
<div class="input-group mb-3">
  <label class="input-group-text"  for="inputGroupSelect01">Type</label>
  <select class="form-select" name="type"  id="type" onblur="typeValidation()" id="inputGroupSelect01">
    <option selected value="">Choose...</option>
    <option value="Fruits">Fruits</option>
    <option value="Vegitables">Vegitables</option>
   
  </select>
</div>



<div class="input-group mb-3 ">
<span class="input-group-text" id="Quantityerror">Item Quantity &nbsp;&nbsp;</span>
  <input type="number" name="quantity" id="quantity"  onblur="itemQuantityValidation()" class="form-control" placeholder="Enter Item Quantity" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>

<div class="input-group mb-3 ">
<span class="input-group-text" id="costerror">Item Cost &nbsp;&nbsp;</span>
  <input type="number" name="cost" id="cost"  onblur="costValidation()" class="form-control" placeholder="Enter Item Cost" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>



<div class="input-group mb-3 ">
<span class="input-group-text" id="ownererror">Stall Owner &nbsp;&nbsp;</span>
  <input type="text" name="owner" id="owner"  onblur="ownerValidation()" class="form-control" placeholder="Enter Stall Owner" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>

<div class="input-group mb-3 ">
<span class="input-group-text" id="keberror">Stall KEB Number &nbsp;&nbsp;</span>
  <input type="number" name="keb" id="keb"  onblur="kebValidation()" class="form-control" placeholder="Enter Stall KEB Number" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>

<div class="input-group mb-3 ">
<span class="input-group-text" id="gsterror">Stall Owner GST Number &nbsp;&nbsp;</span>
  <input type="text" name="gst" id="gst"  onblur="gstValidation()" class="form-control" placeholder="Enter GST Number" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>

<div class="input-group mb-3 ">
<span class="input-group-text" id="weeklyerror">Weekly Transaction &nbsp;&nbsp;</span>
  <input type="text" name="transaction" id="transaction"  onblur="transactionQuantityValidation()" class="form-control" placeholder="Enter Weekly Transaction" aria-label="Username" aria-describedby="basic-addon1">
</div>
<br>




<span id="errorcity"></span>
<div class="input-group mb-3">
  <label class="input-group-text" for="inputGroupSelect01">City</label>
  <select class="form-select" name="city"  id="city" onblur="cityValidation()" id="inputGroupSelect01">
    <option selected value="">Choose...</option>
    <option value="Bengaluru">Bengaluru</option>
    <option value="chenai">chenai</option>
    <option value="Mysore">Mysore</option>
    <option value="Mandya">Mandya</option>
  </select>
</div>



         

<div align="center">
<input class="btn btn-primary" id="submit1"  type="submit" value="Submit" disabled >
</div>

</form>
</div>


</body>
</html>





