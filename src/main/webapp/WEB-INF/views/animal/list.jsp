<%@page import="pl.coderslab.entity.Animal"%>
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
	<h1>List animal</h1>
	<table>
		<c:forEach items="${animals}" var="animal">
			<tr>
				<td><button>${animal.name}</button></td>
				<td>${animal.type}</td>
				<td>${animal.number_passport}</td>
				<td>${animal.sex}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>