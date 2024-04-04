<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="ipl1.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">



<style>

.form
{
display: flex;
justify-content: center;
width:800px;
height:1700px;
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
<nav class="navbar navbar-dark bg-primary ">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="index.jsp"><b>Home</b></a>
		</div>
	</div>
</nav>
<div class="form">
		  <form name="ipl" class="container mt-xxl-5  w-100"  action="read" method="Post">
		
			<h1><span style="color:blue">IPL Match </span></h1>
			
			<div>
				<span id="errornumber"></span><br> <b>Match Number</b><label
							for="number" class="form-label"></label> <select
							class="form-select custom-select-width" id="number"
							name="number" onblur="numberValidation()" aria-label="Select number" >
							<option selected value="">please select</option>
							<option value="1">1</option>
							<option value=" 2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
                            <option value="5">5</option>
						</select>
					</div>
					<br>
			
			      <div>
					<span id="errorname"></span><br> <b>Team Name</b> <label
						for="name" class="form-label"></label> 
						<input type="text" class="form-control" id="name" name="name" onblur="nameValidation()" >
				</div>
				<br>
				
				<div>
					<span id="errordate"></span><br> <b> Match Date</b> <label
						for="date" class="form-label"></label> 
						<input type="date" class="form-control" id="date" name="date" onblur="dateValidation()" >
				</div>
				<br>
				
				
					<div>
						<span id="errorvenue"></span><br> <b>Match Venue</b><label
							for="venue" class="form-label"></label> <select
							class="form-select custom-select-width" id="venue"
							name="venue" onblur="venueValidation()"  aria-label="Select venue" >
							<option selected value="">please select</option>
							<option value="Bengaluru">Bengaluru</option>
							<option value=" chennai">chennai</option>
							<option value="Delhi">Delhi</option>
							<option value="Mumbai">Mumbai</option>
							<option value="Kolkata">Kolkata</option>

						</select>
					</div>
					<br>
				
				
				
				<div>
					<span id="errortoss"></span><br> <b>Toss Winner</b> <label>
						for="toss" class="form-label"></label> 
						<input type="text" class="form-control" id="toss" name="toss" onblur="tossValidation()">
				</div>
				<br>
				
					<div>
					<span id="errortossdecision"></span> <b>Toss Decision</b>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="decision" autocomplete="off" 
							value="Batting" id="decision" onblur="tossValidation()"> <label>
							class="form-check-label" for="decision">BATTING</label>
					</div>
					
					
					<div class="form-check">
						<input class="form-check-input" type="radio" name="decision" autocomplete="off" 
							value="fielding" id="decision" onblur="tossdecisionValidation()"> <label>
							class="form-check-label" for="decision">FIELDING</label>
					</div>
					</div>
				   <br>
				   
				   
				   
					<div>
						<span id="errorweather"></span><br> <b>Weather Condition</b><label
							for="weather" class="form-label"></label> <select
							class="form-select custom-select-width" id="weather"
							name="weather" onblur="weatherValidation()" aria-label="Select Condition" >
							<option selected value="">please select</option>
							<option value="Rainy">Rainy</option>
							<option value=" Sunny">Sunny</option>
							<option value="Snowy">Snowy</option>
							<option value="Cloudy">Cloudy</option>

						</select>
					</div>
					<br>
					
					<div>
						<span id="errorinnings"></span><br> <b>Innings</b><label
							for="innings" class="form-label"></label> <select
							class="form-select custom-select-width" id="innings"
							name="innings" onblur="inningsValidation()" aria-label="Select innings" >
							<option selected value="">please select</option>
							<option value="Innings 1">Innings 1</option>
							<option value=" Innings 2">Innings 2</option>
							

						</select>
					</div>
					<br>
					
			    <div>
					<span id="errorumpires"></span><br> <b>Umpires</b> <label
						for="umpires" class="form-label"></label> 
						<input type="number" class="form-control" id="umpires" name="umpires" onblur="umpiresValidation()">
				</div>
				<br>
				
				<div>
					<span id="errorduration"></span><br> <b>Match Duration</b> <label
						for="duration" class="form-label"></label> 
						<input type="number" class="form-control" id="duration" name="duration" onblur="durationValidation()">
				</div>
				<br>
				
				
				<div>
					<span id="errorman"></span><br> <b>Match OF The Man</b> <label
						for="man" class="form-label"></label> 
						<input type="text" class="form-control" id="man" name="man" onblur="manValidation()" >
				</div>
				<br>
				
				<div>
					<span id="errorscorer"></span><br> <b>Highest Run Scorer </b> <label
						for="scorer" class="form-label"></label> 
						<input type="text" class="form-control" id="scorer" name="scorer" onblur="scorerValidation()">
				</div>
				<br>
				
				
				
				<div>
					<span id="errorresult"></span> <b>Result</b>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="result" autocomplete="off" 
							value="Win" id="result" > <label
							class="form-check-label" for="result">Win</label>
					</div>
				
				<div class="form-check">
						<input class="form-check-input" type="radio" name="result" autocomplete="off" 
							value="Loss" id="result" > <label
							class="form-check-label" for="result">Loss</label>
					</div>
					
					<div class="form-check">
						<input class="form-check-input" type="radio" name="result" autocomplete="off" 
							value="Tie" id="result" > <label
							class="form-check-label" for="result">Tie</label>
					</div>
					</div>
				   <br>
				   
				   
				
				<div>
					<span id="errorscore"></span><br> <b>Total Run Score </b> <label
						for="score" class="form-label"></label> 
						<input type="text" class="form-control" id="score" name="score" onblur="scoreValidation()">
				</div>
				<br>
				
				<div>
				   <button type="submit" class="btn btn-primary" id="submit">Click</button>
					</div>
				
					

</form>
</div>
</body>
</html>
