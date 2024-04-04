let fieldsChecks = {
		    "name1" : false,
		    "email1" : false,
		    "percentage1" : false,
		    "college1" : false,
		    "degree1" : false,
		    "stream1" : false,
		    }
	
	function validate(){
	    let flag = false;

	    for(let [key, value] of Object.entries(fieldsChecks)){

	        if(value === false){
	            flag = true;
	            break;
	        }
	    }
	    
	    if(!flag){
	        document.getElementById("submit1").removeAttribute("disabled");
	    }else{
	        document.getElementById("submit1").setAttribute("disabled","");
	    }
	}
	
	function nameValidation(){
	    let element = document.getElementById("name1");
	    let error = document.getElementById("nameerror");

	    if(element.value.trim().length >= 3){
	        error.innerHTML = "";
	        fieldsChecks["name1"] = true;
	    }else{
	        error.innerHTML = "student name should be greter than 3 letters";
	        error.style.color="red"
	        fieldsChecks["name1"] = false;

	    }
	    validate();
	}
	
	function emailValidation(){
	    let element = document.getElementById("email1");
	    let error = document.getElementById("basic-addon1");

	    if(element.value.length >=10){
	        error.innerHTML = "";
	        fieldsChecks["email1"] = true;
	    }else{
	        error.innerHTML = "Example abc@gmail.com";
	        error.style.color="red"
	        fieldsChecks["email1"] = false;
	    }
	    validate()
	    
	}

function percentageValidation(){
	    let element = document.getElementById("percentage1");
	    let error = document.getElementById("percenterror");

	    if(element.value.length >=2){
	        error.innerHTML = "";
	        fieldsChecks["percentage1"] = true;
	    }else{
	        error.innerHTML = "Enter percentage %";
	        error.style.color="red"
	        fieldsChecks["percentage1"] = false;
	    }
	    validate()
	    
	}
	
	

	function collegeValidation(){
	    let element = document.getElementById("college1");
	    let error = document.getElementById("collegeerror");

	    if(element.value.length != ""){
	        error.innerHTML = "";
	        fieldsChecks["college1"] = true;
	    }else{
	        error.innerHTML = "please!select college";
	        error.style.color="red"
	        fieldsChecks["college1"] = false;

	    }
	    validate();
	}

function degreeValidation(){
	    let element = document.getElementById("degree1");
	    let error = document.getElementById("errordegree");

	    if(element.value.length != ""){
	        error.innerHTML = "";
	        fieldsChecks["degree1"] = true;
	    }else{
	        error.innerHTML = "please select degree";
	        error.style.color="red"
	        fieldsChecks["degree1"] = false;

	    }
	    validate();
	}


	function streamValidation(){
	    let element = document.getElementById("stream1");
	    let error = document.getElementById("errorstream");

	    if(element.value.length != ""){
	        error.innerHTML = "";
	        fieldsChecks["stream1"] = true;
	    }else{
	        error.innerHTML = "please select department name";
	        error.style.color="red"
	        fieldsChecks["stream1"] = false;

	    }
	    validate();
	}
	
	
	
	