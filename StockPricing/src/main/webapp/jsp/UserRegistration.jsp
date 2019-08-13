<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<link rel="stylesheet" type="text/css" href="Style/StockStyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>


<title>User Registration</title>
</head>
<body>

	<div class="topnav" id="myTopnav">
		<a href="ImportData.html">Import Data</a> <a href="#">Manage
			Company</a> <a href="#">Manage Exchange</a> <a href="#">Update IPO
			Details</a>
		<div id="navbar" style="float: right">
			<a id="anch" href="javascript:void(0)" class="btn btn-primary"
				target="_blank" href="#">Logout</a>


		</div>
		<a href="javascript:void(0);" class="icon" onclick="myFunction()">
			<i class="fa fa-bars"></i>
		</a>
	</div>

	<div id="content">

		<br>
		<br>
		<h4 align="center">Welcome to Registration</h4>
		<br> <br>
		<table align="center" cellpadding="10">
			<form:form action="registerUser" method="post"
				modelAttribute="user" class="well form-horizontal">
				<tr>
					<td>User Name</td>
					<td><form:input name="" class="form-control"
							placeholder="User Name" type="text" path="username"
							required="required" /> <small><form:errors
								path="username" cssClass="errormsg" /></small></td>
				</tr>
				<tr>
					<td>User Type</td>
					<td><form:select path="userType" class="form-control" maxlength="10"
										required="required">
										<option selected="">UserType</option>
										<option>Admin</option>
										<option>Regular</option>

									</form:select></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input name="" class="form-control" placeholder="Password"
							type="password" path="password" required="required" /> <small><form:errors
								path="password" cssClass="errormsg" /></small></td>
				</tr>
				
				<tr>
					<td>Confirm Password</td>
					<td><form:input name="" class="form-control" placeholder="Confirm Password"
							type="password" path="confirmPassword" required="required" /> <small><form:errors
								path="confirmPassword" cssClass="errormsg" /></small></td>
				</tr> 
				<tr>
					<td>Email</td>
					<td><form:input name="" class="form-control"
							placeholder="Email" type="email"
							path="email" required="required" /> <small><form:errors
								path="email" cssClass="errormsg" /></small></td>
				</tr>
				<tr>
					<td>Mobile Number</td>
					<td><form:input name="" class="form-control"
							placeholder="Mobile Number" type="text" path="mobileNumber"
							required="required" /> <small><form:errors
								path="mobileNumber" cssClass="errormsg" /></small></td>
				</tr>

				<tr>
					<td>Confirmed</td>
					<td><form:select path="confirmed" class="form-control" maxlength="10"
										required="required">
										<option selected="">Confirm Status</option>
										<option>Yes</option>
										<option>No</option>

									</form:select></td>
				</tr>

				<tr>
					<td></td>
					<td>
						<button type="submit" id="registerUser" class="btn btn-project"
							name="registerUser">Register</button>

					</td>
				</tr>
			</form:form>
		</table>

	</div>
	<script type="text/javascript">
		$(function() {
			$("#registerUser").click(function() {
				var password = $("#password").val();
				var confirmPassword = $("#confirmPassword").val();
				if (password != confirmPassword) {
					alert("Passwords do not match.");
					return false;
				}
				return true;
			});
		});
	</script>
</body>
</html>
