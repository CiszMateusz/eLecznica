<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Dodaj wizyte</h1>
	<form:form method="post" modelAttribute="visit">
	
	recognition
	<form:input path="recognition" />
	
	intervention
	<form:input path="intervention" />
	
	animal
		<form:select path="animal"> 
			<form:options items = "${animals}" itemValue="id"/>
		</form:select>
	customer
		<form:select path="customer"> 
			<form:options items = "${customers}" itemValue="id"/>
		</form:select>
	warehouse
		<form:select path="animal"> 
			<form:options items = "${warehouse}" itemValue="id"/>
		</form:select>
	
		<input type="submit" value="Save">
	</form:form>
</body>
</html>