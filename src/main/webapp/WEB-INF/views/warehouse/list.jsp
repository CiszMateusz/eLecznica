<%@page import="pl.coderslab.entity.Warehouse"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista leków</h1>
	<table>
		<c:forEach items="${warehouses}" var="warehouse">
			<tr>
				<td>${warehouse.drugs}</td>
				<td>${warehouse.date_purchases}</td>
				<td>${warehouse.packages}</td>
				<td>${warehouse.nr_invoice}</td>
				<td>${warehouse.series}</td>
				<td>${warehouse.expiration_date}</td>
				<td>${warehouse.dose}</td>
				<td>${warehouse.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>