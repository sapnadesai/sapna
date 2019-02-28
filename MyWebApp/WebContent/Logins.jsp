<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b><%= session.getAttribute("message") %></b>

<%  
String message=(String).session.getAttribute("message");
if(message!=null)
out.println("<b>"+message+"</b>");
 session.removeAttribute("message");%>
 
<form method="post" action ="Login">

		Username: 
		<input type="text" name="username" /> 
		
		Password: 
		<input type="text" name="password" />

		<button>login</button>
    
	</form>
</body>
</html>