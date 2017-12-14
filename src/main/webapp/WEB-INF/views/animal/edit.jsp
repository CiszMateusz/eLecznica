<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="../styles/enter.css" rel="stylesheet" type="text/css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
</head>
<body>
	<h1>Edytuj Zwierzaka</h1>
	<form:form method="post" modelAttribute="animal">
	Imię :
		<form:input path="name" />
	Gatunek:
		<form:input path="type" />
	Płeć:				
		<form:input path="sex" />
	Numer_paszportu :
		<form:input path="number_passport" />
	
		<input type="submit" value="Save">
	</form:form>
</body>
</html>