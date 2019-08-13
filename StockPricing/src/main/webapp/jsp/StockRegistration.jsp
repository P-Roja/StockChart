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
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" type="text/css" href="Style/StockStyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Stock Insertion</title>
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
		<h4 align="center">Insert New Stock</h4>
		<br> <br>
		<table align="center" cellpadding="10">
			<form:form action="insertStockExchange" method="post"
				modelAttribute="stockExchange" class="well form-horizontal">
				<tr>
					<td>Stock Exchange Name</td>
					<td><form:input name="" class="form-control"
							placeholder="Stock Exchange Name" type="text" path="stockExchangeName"
							required="required" /> <small><form:errors
								path="StockExchangeName" cssClass="errormsg" /></small></td>
				</tr>

				<tr>
					<td>Brief</td>
					<td><form:input name="" class="form-control" placeholder="Brief Description"
							type="text" path="brief" required="required" /> <small><form:errors
								path="brief" cssClass="errormsg" /></small></td>
				</tr>
				<tr>
					<td>Contact Address</td>
					<td><form:textarea path="contactAddress"
										class="form-control z-depth-1"
										id="exampleFormControlTextarea6" rows="5" required="required"
										placeholder="Enter your address here...  *" /><small><form:errors
								path="contactAddress" cssClass="errormsg" /></small></td>
				</tr>
				<tr>
					<td>Remarks</td>
					<td><form:input name="" class="form-control"
							placeholder="Remarks" type="text" path="remarks"
							required="required" /> <small><form:errors
								path="remarks" cssClass="errormsg" /></small></td>
				</tr>

				<tr>
					<td></td>
					<td>...any other fields...</td>
				</tr>

				<tr>
					<td></td>
					<td>
						<button type="submit" id="insertStock" class="btn btn-project"
							name="insertStock">Insert Stock</button>
					</td>
				</tr>
			</form:form>
		</table>

	</div>
	
</body>
</html>
