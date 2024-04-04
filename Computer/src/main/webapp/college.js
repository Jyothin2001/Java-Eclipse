let fieldsChecks = {
		    "name1" : false,
		    "phone1" : false,
		    "payment" : false,
		    "department1" : false,
		    "subject1" : false,
		    "accept1" : false,
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
	
	function studentNameValidation(){
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
	
	function studentNumberValidation(){
	    let element = document.getElementById("phone1");
	    let error = document.getElementById("basic-addon1");

	    if(element.value.length >=10){
	        error.innerHTML = "";
	        fieldsChecks["phone1"] = true;
	    }else{
	        error.innerHTML = "please! Enter 10 numbers";
	        error.style.color="red"
	        fieldsChecks["phone1"] = false;
	    }
	    validate()
	    
	}
	
	function paymentValiadte()
	{
		 let error = document.getElementById("errorpayment");
		 if(document.student.payment[0].checked==false && document.student.payment[1].checked==false){
		 error.innerHTML = "Please select payment mode";
		 error.style.color="red"
		 fieldsChecks["payment"] = false;
		
	}
		 else
			 {
			    error.innerHTML = "";
		        fieldsChecks["payment"] = true;
			 }
		 
		         validate()
			 }
	
	
	

	function subjectValidation(){
	    let element = document.getElementById("subject1");
	    let error = document.getElementById("errorsubject");

	    if(element.value.length != ""){
	        error.innerHTML = "";
	        fieldsChecks["subject1"] = true;
	    }else{
	        error.innerHTML = "please select Subjects";
	        error.style.color="red"
	        fieldsChecks["subject1"] = false;

	    }
	    validate();
	}

	function departmentValidation(){
	    let element = document.getElementById("department1");
	    let error = document.getElementById("depterror");

	    if(element.value.length != ""){
	        error.innerHTML = "";
	        fieldsChecks["department1"] = true;
	    }else{
	        error.innerHTML = "please select department name";
	        error.style.color="red"
	        fieldsChecks["department1"] = false;

	    }
	    validate();
	}
	
	
	
	function acceptValidation(){
	    let element = document.getElementById("accept1");
	    let error = document.getElementById("acc1");

	    if(element.checked){
	        error.innerHTML = "";
	        fieldsChecks["accept1"] = true;
	    }else{
	        error.innerHTML = "Please click the Accept";
	        error.style.color="red"
	        fieldsChecks["accept1"] = false;
	    }
	    
	    validate();
	    paymentValiadte();
	    console.log(element.value);
	}
