var s1 = function(){
	print("Testing for invocable going on.............");
}
var s2 = function(keyword){
	print("You are done Mr."+keyword);
}
var sumofnums=function(a,b){
    var myclass=Java.type("JavaScriptExec");
    print("sum of two numbers is : " + myclass.sumoftwonums(a,b));
}

//Json object from java
function receiveJson(data) {
   print(data.get("firstName").asText());
}