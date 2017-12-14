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
	<h1>Edytuj typka/typiarke</h1>
	<form:form method="post" modelAttribute="customer">
	Imię :
		<form:input path="name" />
	Nazwisko :
		<form:input path="lastname" />
	Ulica:
		<form:input path="street" />
	Numer domu:
		<form:input path="number_house" />
	Miejscowość:				
		<form:input path="place" />
	Kod pocztowy :
		<form:input path="post_code" />
	Telefon:
		<form:input path="phone" />
	Email:
		<form:input path="email" />
	Numer gospodarstwa domowego :
		<form:input path="nr_id" />
	
		<input type="submit" value="Save">
	</form:form>
</body>
</html>