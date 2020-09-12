var attempt = 3; 


function validate(){
var username = document.getElementById("username").value;
var password = document.getElementById("password").value;
if ( username == "Nurul_Anam" && password == "anam2011"){
alert ("Login successfully");
window.location = "home.html";
return false;
}
else{
attempt --;


alert("Incorrect username or password....");



if( attempt == 0){
document.getElementById("username").disabled = true;
document.getElementById("password").disabled = true;
document.getElementById("submit").disabled = true;
return false;
}
}
}