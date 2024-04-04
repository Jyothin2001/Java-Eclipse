let fieldsChecks = {
		    "name" : false,
		    "pincode1" : false,
		    "Area" : false,
		    "location" : false,
		    "type" : false,
		    "city" : false,
		    "stall" : false,
		    "item" : false,
		    "quality" : false,
		    "quantity" : false,
		    "cost" : false,
		    "owner" : false,
		    "keb" : false,
		    "gst" : false,
		    "transaction" : false,
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
	    let element = document.getElementById("name");
	    let error = document.getElementById("nameerror");

	    if(element.value.length >=5 && element.value.length<=20){
	        error.innerHTML = "";
	        fieldsChecks["name"] = true;
	    }else{
	        error.innerHTML = " Name should be greater than 5 less than 20 letters";
	        error.style.color="red"
	        fieldsChecks["name"] = false;

	    }
	    validate();
	}

function costValidation(){
	    let element = document.getElementById("cost");
	    let error = document.getElementById("costerror");

	    if(element.value.length >=1){
	        error.innerHTML = "";
	        fieldsChecks["cost"] = true;
	    }else{
	        error.innerHTML = " Enter Cost Greater than 1";
	        error.style.color="red"
	        fieldsChecks["cost"] = false;

	    }
	    validate();
	}
	
	function pincodeValidation(){
	    let element = document.getElementById("pincode1");
	    let error = document.getElementById("basic-addon1");

	    if(element.value.length ==6 ){
	        error.innerHTML = "";
	        fieldsChecks["pincode1"] = true;
	    }else{
	        error.innerHTML = "Enter pincode equal to 6";
	        error.style.color="red"
	        fieldsChecks["pincode1"] = false;
	    }
	    validate()
	    
	}

function areaValidation(){
	    let element = document.getElementById("Area");
	    let error = document.getElementById("areaerror");

	    if(element.value.length >=5 && element.value.length <=20){
	        error.innerHTML = "";
	        fieldsChecks["Area"] = true;
	    }else{
	        error.innerHTML = "Enter Area Greater than 5 and  less than 20";
	        error.style.color="red"
	        fieldsChecks["Area"] = false;
	    }
	    validate()
	    
	}



function stallValidation(){
	    let element = document.getElementById("stall");
	    let error = document.getElementById("stallerror");

	    if(element.value >=1 && element.value <=1000){
	        error.innerHTML = "";
	        fieldsChecks["stall"] = true;
	    }else{
	        error.innerHTML = "Enter Stall Number Greater than 1 and  less than 1000 ";
	        error.style.color="red"
	        fieldsChecks["stall"] = false;
	    }
	    validate()
	    
	}


function itemValidation(){
	    let element = document.getElementById("item");
	    let error = document.getElementById("itemerror");

	    if(element.value >=5 && element.value<=20){
	        error.innerHTML = "";
	        fieldsChecks["item"] = true;
	    }else{
	        error.innerHTML = "Enter Item Name Greater than 5 and  less than 20";
	        error.style.color="red"
	        fieldsChecks["item"] = false;
	    }
	    validate()
	    
	}
	
	function itemQualityValidation(){
	    let element = document.getElementById("quality");
	    let error = document.getElementById("qualityerror");

	    if(element.value >=1 && element.value <=20){
	        error.innerHTML = "";
	        fieldsChecks["quality"] = true;
	    }else{
	        error.innerHTML = "Enter Item Quality Greater than 1 and  less than 20";
	        error.style.color="red"
	        fieldsChecks["quality"] = false;
	    }
	    validate()
	    
	}


function itemQuantityValidation(){
	    let element = document.getElementById("quantity");
	    let error = document.getElementById("Quantityerror");

	    if(element.value >=1 && element.value <=10){
	        error.innerHTML = "";
	        fieldsChecks["quantity"] = true;
	    }else{
	        error.innerHTML = "Enter Item Quantity Greater than 1 and less than 10 ";
	        error.style.color="red"
	        fieldsChecks["quantity"] = false;
	    }
	    validate()
	    
	}

function ownerValidation(){
	    let element = document.getElementById("owner");
	    let error = document.getElementById("ownererror");

	    if(element.value >=5 && element.value <=20){
	        error.innerHTML = "";
	        fieldsChecks["owner"] = true;
	    }else{
	        error.innerHTML = "Enter Owner Name Greater than 5 and less than 20 letters";
	        error.style.color="red"
	        fieldsChecks["owner"] = false;
	    }
	    validate()
	    
	}

function kebValidation(){
	    let element = document.getElementById("keb");
	    let error = document.getElementById("keberror");

	    if(isNaN(element.value) || element.value<1 || element.value.length>10){
	        error.innerHTML = "Enter KEB Number Between 1 and  10";
	        error.style.color="red"
	        fieldsChecks["keb"] = false;
	        
	       
	    }else{
	         error.innerHTML = "";
	        fieldsChecks["keb"] = true;
	    }
	    validate()
	    
	}

function gstValidation(){
	    let element = document.getElementById("gst");
	    let error = document.getElementById("gsterror");

	    if(isNaN(element.value) || element.value<1 || element.value.length>7)
	    {
			
			error.innerHTML = " Enter GST Number Between 1 and  7";
	        error.style.color="red"
	        fieldsChecks["gst"] = false;
	       
	    }else{
			 error.innerHTML = "";
	        fieldsChecks["gst"] = true;
	        
	    }
	    validate()
	    
	}

function transactionQuantityValidation(){
	    let element = document.getElementById("transaction");
	    let error = document.getElementById("weeklyerror");

	    if(isNaN(element.value) || element.value<1 || element.value.length>10)
	    {
	        error.innerHTML = " Enter Transaction  between 1 and 10";
	        error.style.color="red"
	        fieldsChecks["transaction"] = false;
	    }
	    else
	    {
			
			error.innerHTML = "";
	        fieldsChecks["transaction"] = true;
			
		    
			
	        
	    }
	    validate()
	    
	}
	
	

	function cityValidation(){
	    let element = document.getElementById("city");
	    let error = document.getElementById("errorcity");

	    if(element.value.length != ""){
	        error.innerHTML = "";
	        fieldsChecks["city"] = true;
	    }else{
	        error.innerHTML = "please! select City";
	        error.style.color="red"
	        fieldsChecks["city"] = false;

	    }
	    validate();
	}

function typeValidation(){
	    let element = document.getElementById("type");
	    let error = document.getElementById("errottype");

	    if(element.value.length != ""){
	        error.innerHTML = "";
	        fieldsChecks["type"] = true;
	    }else{
	        error.innerHTML = "please1 select type";
	        error.style.color="red"
	        fieldsChecks["type"] = false;

	    }
	    validate();
	}


	function locationValidation(){
	    let element = document.getElementById("location");
	    let error = document.getElementById("locationeerror");

	    if(element.value.length != ""){
	        error.innerHTML = "";
	        fieldsChecks["location"] = true;
	    }else{
	        error.innerHTML = "please! select location";
	        error.style.color="red"
	        fieldsChecks["location"] = false;

	    }
	    validate();
	}
	
	
	
	