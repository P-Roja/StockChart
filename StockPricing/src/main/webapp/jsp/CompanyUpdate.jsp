<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  import="java.util.*,com.StockPricing.model.Company,com.StockPricing.model.Sector"%>
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

<title>Registration</title>
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
		<h4 align="center">Create New Company</h4>
		<br> <br>
		<table align="center" cellpadding="10">
			<form:form action="updateCompany" method="post"
				modelAttribute="company" class="well form-horizontal">
				
							<%
								Company company = (Company) request.getAttribute("update");
							%>
				
				
				<tr>
					<td>Company Id</td>
					<td>
				<form:input name="companyId"
											value="<%=company.getCompanyCode() %>" class="form-control"
											type="text" path="companyCode" readonly="true" /></td>
											</tr>
				
				
				<tr>
					<td>Company Name</td>
					<td><form:input name="" class="form-control" value="<%=company.getCompanyName() %>"
							placeholder="Company Name" type="text" path="companyName"
							required="required" /> <small><form:errors
								path="companyName" cssClass="errormsg" /></small></td>
				</tr>




				<tr>
					<td>CEO Name</td>
					<td><form:input name="" class="form-control" placeholder="CEO"
						value="<%=company.getCeo() %>"	type="text" path="ceo" required="required" /> <small><form:errors
								path="ceo" cssClass="errormsg" /></small></td>
				</tr>
				<tr>
					<td>Board Of Directors</td>
					<td><form:input name="" class="form-control"
							value = "<%=company.getBoardOfDirectors() %>" placeholder="Board Of directors" type="text"
							path="boardOfDirectors" required="required" /> <small><form:errors
								path="boardOfDirectors" cssClass="errormsg" /></small></td>
				</tr>
				<tr>
					<td>TurnOver</td>
					<td><form:input name="" class="form-control"
						value="<%=company.getTurnover() %>"	placeholder="Turn Over" type="text" path="turnover"
							required="required" /> <small><form:errors
								path="turnover" cssClass="errormsg" /></small></td>
				</tr>

				<tr>
				<%
										ArrayList sectorDetails = (ArrayList) request.getAttribute("sectorList");
											Iterator itr = sectorDetails.iterator();
									%>
				
					<td>Sector Id</td>
					<td><form:select path="sectorId" class="form-control"
							maxlength="10" required="required">
							<option value="" disabled selected>Choose Sector Id</option>
							<%
											
													while (itr.hasNext()) {
														Sector sector = (Sector) itr.next();
														int sectorId = sector.getSectorId();
														
										%>
										<option value="<%=sectorId %> ">
											<%=sectorId%></option>

										<%
											}
										%>

						</form:select></td>
				</tr>
				<tr>
				<tr>
					<td>Brief Description</td>
					<td><form:input name="" class="form-control"
						value="<%=company.getWriteUp() %>"	placeholder="Brief WriteUp" type="text" path="writeUp"
							required="required" /> <small><form:errors
								path="writeUp" cssClass="errormsg" /></small></td>
				</tr>


				<tr>
					<td></td>
					<td>...any other fields...</td>
				</tr>

				<tr>
					<td></td>
					<td>
						<button type="submit" id="updateCompany" class="btn btn-project"
							name="updateCompany">Update</button>
				
					</td>
				</tr>
			</form:form>
		</table>

	</div>
	
</body>
</html>
