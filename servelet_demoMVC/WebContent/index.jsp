<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JAVA web Application</h1>
	<h2>Login Page::</h2>
	<form action="<%=request.getContextPath()%>/home" method = "post">
		<input type="text" name="uname" placeholder="type username" /><br>
		<br>
		<input type="password" name="pwd" placeholder="type password" /><br>
		<br>
		<input type = "submit" value = "Login Here"/>
	</form>
	<!-- <a href="<%=request.getContextPath()%>/home">Click here to invoke
		the servlet</a> -->
</body>
</html>