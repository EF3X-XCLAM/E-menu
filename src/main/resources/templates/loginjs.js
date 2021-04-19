function validation(){
	
	var form = document.getElementById("form");
	var email = document.getElementById("email").value;
	var emsg = document.getElementById("error1");

	var pattern = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

	if(!email.match(pattern)){
		emsg.innerHTML="Invalid Email Address";
		emsg.style.color="red";
		document.getElementById("email").style.borderBottomColor = "red";
		return false;
	}else{
		emsg.innerHTML="";
		document.getElementById("email").style.borderBottomColor = "#975737";
		return true;
	}
}