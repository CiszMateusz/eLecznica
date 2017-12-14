<%@page import="pl.coderslab.entity.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="../styles/enter.css" rel="stylesheet" type="text/css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
</head>
<body class="body1">
	<h1>Lista klientów</h1>
	<table>
		<c:forEach items="${customers}" var="customer">
			<tr>
				<td>${customer.name}</td>
				<td>${customer.lastname}</td>
				<td>${customer.street}</td>
				<td>${customer.number_house}</td>
				<td>${customer.place}</td>
				<td>${customer.post_code}</td>
				<td>${customer.phone}</td>
				<td>${customer.email}</td>
				<td>${customer.nr_id}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>