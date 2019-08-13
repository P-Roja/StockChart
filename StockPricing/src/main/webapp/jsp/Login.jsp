<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="Style/Register.css">

</head>
<body>
<div class="wrapper">
<h1> Stock Market</h1>
  <div id="formContent">
    <!-- Tabs Titles -->
    <h2 class="active"> Sign In </h2>
   

    <!-- Icon -->
    <div class="fadeIn first">
      <img src="Images/download.png" id="icon" alt="User Icon" />
    </div>

    <!-- Login Form -->
    <form:form action="loginAdmin" method="post"
				modelAttribute="user" class="well form-horizontal">
				<form:input   id="login" class="fadeIn second" name="login"
							placeholder="User Name" type="text" path="username"
							required="required" />
						<form:input   id="password" class="fadeIn sthird" name="password"
							placeholder="Password" type="text" path="password"
							required="required" />		

      <input type="submit" name="loginAdmin" id="loginAdmin" class="fadeIn fourth" value="Log In">
    </form:form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="#">Already Have an Account</a>
	 
    </div>

  </div>
</div>
</body>
</html>