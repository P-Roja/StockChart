<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.util.*,com.StockPricing.model.StockExchange"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="Style/StockStyle.css">

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" rel="stylesheet"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>

<div class="topnav" id="myTopnav">
   <a  href="ImportData.html">Import Data</a>
  <a href="#">Manage Company</a>
  <a href="#">Manage Exchange</a>
   <a href="#">Update IPO Details</a>
<div id="navbar" style = "float:right">
  <a id="anch" href="javascript:void(0)" class="btn btn-primary" target="_blank" href="#">Logout</a>

  
</div>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>

<div  id="content">

<br><br><h4 align="center">List of Companies</h4><br>
  
<%
List stockExchangeList=(List)request.getAttribute("stockExchangeList");
System.out.println(stockExchangeList);
%>

 <table class="table">

  <tbody>
<tr>
<th class="text-center" >StockExchange Id</th>
<th>StockExchange Name</th>
<th>Brief</th>
<th>Contact Address</th>
<th>Remarks</th>
</tr>

<% for(int i=0;i<stockExchangeList.size();i++){
	StockExchange stockExchange=(StockExchange)stockExchangeList.get(i);
	%>
<tr>
<td align="center"><%= stockExchange.getStockExchangeId() %></td>
<td><%= stockExchange.getStockExchangeName() %></td>
<td><%= stockExchange.getBrief()  %></td>
<td><%= stockExchange.getContactAddress() %>
<td><%= stockExchange.getRemarks() %></td>

</tr>
<% }%>
 </tbody>
</table>
 
</div>

</body>
</html>


