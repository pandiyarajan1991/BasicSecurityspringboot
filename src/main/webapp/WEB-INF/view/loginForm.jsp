<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
<center>Login page
<form class="form-horizontal" method="POST" action="/login">  

<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
<input type="text" name="email" value="${userDomain.email}" placeholder="email"/><br/>  
<input type="password" name="password"  value="${userDomain.password}" placeholder="password"/><br/>  
<input type="submit" value="Login"/> 
</form> 
</center>

</body>
</html>