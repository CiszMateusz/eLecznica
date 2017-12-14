<%@page import="pl.coderslab.entity.Visit"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>List visit</h1>
	<table>
		<c:forEach items="${visits}" var="visit">
			<tr>
				<td>${visit.customer}</td>
				<td>${visit.reporting_data}</td>
				<td>${visit.visit_data}</td>
				<td>${visit.animal}</td>
				<td>${visit.recognition}</td>
				<td>${visit.intervention}</td>
				<td>${visit.warehouse}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>