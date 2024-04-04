let fieldsChecks = {
	    "number" : false,
	    "name" : false,
	    "date" : false,
	    "venue" : false,
	    "toss" : false,
	    "decision": false,
	    "weather": false,
	    "innings": false,
	    "umpires": false,
	    "duration": false,
	    "man": false,
	    "scorer": false,
	    "score": false,
	    "result": false,
	    
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
        document.getElementById("submit").removeAttribute("disabled");
    }else{
        document.getElementById("submit").setAttribute("disabled","");
    }
}

function numberValidation()
{
	let element = document.getElementById("number");
    let error = document.getElementById("errornumber");

    if(element.value.length !="0" ){
        error.innerHTML = "";
        fieldsChecks["number"] = true;
      }
    
    else{
        error.innerHTML = "Please select match number";
        error.style.color="red"
        fieldsChecks["number"] = false;

    }
    validate();
}


function nameValidation()
{
	let element = document.getElementById("name");
    let error = document.getElementById("errorname");

    if(element.value.length >= 2 && element.value.length<=20 ){
        error.innerHTML = "";
        fieldsChecks["name"] = true;
      }
    
    else{
        error.innerHTML = "Enter match name greter than equals to 2 and less than equal to 20 letters";
        error.style.color="red"
        fieldsChecks["name"] = false;

    }
    validate();
}

function dateValidation()
{
	let element = document.getElementById("date");
    let error = document.getElementById("errordate");

    if(element.value.length !="0" ){
        error.innerHTML = "";
        fieldsChecks["date"] = true;
      }
    
    else{
        error.innerHTML = "Please! select date";
        error.style.color="red"
        fieldsChecks["date"] = false;

    }
    validate();
}



function venueValidation()
{
	let element = document.getElementById("venue");
    let error = document.getElementById("errorvenue");

    if(element.value.length !="0" ){
        error.innerHTML = "";
        fieldsChecks["venue"] = true;
      }
    
    else{
        error.innerHTML = "Please! select venue";
        error.style.color="red"
        fieldsChecks["venue"] = false;

    }
    validate();
}


function tossValidation()
{
	let element = document.getElementById("toss");
    let error = document.getElementById("errortoss");

    if(element.value.length >= 2 && element.value.length<=20 ){
        error.innerHTML = "";
        fieldsChecks["toss"] = true;
      }
    
    else{
        error.innerHTML = "Enter toss winner! should be greterthan  eqauals to 2 and lessthan equal to 20 letters";
        error.style.color="red"
        fieldsChecks["toss"] = false;

    }
    validate();
}


function tossdecisionValidation()
	{
		 let error = document.getElementById("errortossdecision");
		 if(document.ipl.decision[0].checked==false && document.ipl.decision[1].checked==false	 ){
		 error.innerHTML = "Please select Decision";
		 error.style.color="red"
		 fieldsChecks["decision"] = false;
		
	}
		 else
			 {
			    error.innerHTML = "";
		        fieldsChecks["decision"] = true;
			 }
		 
	            validate()
			 }
			 
			
function weatherValidation()
{
	let element = document.getElementById("weather");
    let error = document.getElementById("errorweather");

    if(element.value.length !="0" ){
        error.innerHTML = "";
        fieldsChecks["weather"] = true;
      }
    
    else{
        error.innerHTML = "Please! select weather";
        error.style.color="red"
        fieldsChecks["number"] = false;

    }
    tossdecisionValidation();
    validate();
}

			
function inningsValidation()
{
	let element = document.getElementById("innings");
    let error = document.getElementById("errorinnings");

    if(element.value.length !="0" ){
        error.innerHTML = "";
        fieldsChecks["innings"] = true;
      }
    
    else{
        error.innerHTML = "Please! select innings";
        error.style.color="red"
        fieldsChecks["innings"] = false;

    }
    
    validate();
}

function umpiresValidation()
{
	let element = document.getElementById("umpires");
    let error = document.getElementById("errorumpires");

    if(element.value >= 2 && element.value<=10 ){
        error.innerHTML = "";
        fieldsChecks["umpires"] = true;
      }
    
    else{
        error.innerHTML = "Enter umpires should be greterthan  equals to 2 and lesser than equal to 10 ";
        error.style.color="red"
        fieldsChecks["umpires"] = false;

    }
    validate();
}

function durationValidation()
{
	let element = document.getElementById("duration");
    let error = document.getElementById("errorduration");

    if(element.value >= 3 && element.value<=4){
        error.innerHTML = "";
        fieldsChecks["duration"] = true;
      }
    
    else{
        error.innerHTML = "Enter duration. duration should be greterthan are eqal to 3 and lessthan are equal to 4";
        error.style.color="red"
        fieldsChecks["duration"] = false;

    }
    validate();
}


function manValidation()
{
	let element = document.getElementById("man");
    let error = document.getElementById("errorman");

    if(element.value.length >= 2 && element.value.length<=20 ){
        error.innerHTML = "";
        fieldsChecks["man"] = true;
      }
    
    else{
        error.innerHTML = "Enter man name. man name should be greterthan are eqal to 2 and lessthan are equal to 20 letters";
        error.style.color="red"
        fieldsChecks["man"] = false;

    }
    validate();
}


function scorerValidation()
{
	let element = document.getElementById("scorer");
    let error = document.getElementById("errorscorer");

    if(element.value.length >= 2 && element.value.length<=20 ){
        error.innerHTML = "";
        fieldsChecks["scorer"] = true;
      }
    
    else{
        error.innerHTML = "Enter scorer name. scorer name should be greterthan are eqal to 2 and lessthan are equal to 20 letters";
        error.style.color="red"
        fieldsChecks["scorer"] = false;

    }
    validate();
}

function resultValidation()
	{
		 let error = document.getElementById("errorresult");
		 if(document.ipl.result[0].checked==false && document.ipl.result[1].checked==false && document.ipl.result[2].checked==false	 ){
		 error.innerHTML = "Please select Decision";
		 error.style.color="red"
		 fieldsChecks["result"] = false;
		
	}
		 else
			 {
			    error.innerHTML = "";
		        fieldsChecks["result"] = true;
			 }
		 
	            validate()
			 }
			 

function scoreValidation()
{
	let element = document.getElementById("score");
    let error = document.getElementById("errorscore");

    if(element.value.length !="0"){
        error.innerHTML = "";
        fieldsChecks["score"] = true;
      }
    
    else{
        error.innerHTML = "please! enter score"
        error.style.color="red"
        fieldsChecks["score"] = false;

    }
    resultValidation()
    validate();
}
