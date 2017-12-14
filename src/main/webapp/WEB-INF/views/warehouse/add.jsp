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
	<h1>Dodaj lek</h1>>
	<form:form method="post" modelAttribute="warehouse">
	drugs
	<form:input path="drugs" />
	packages
	<form:input path="packages" />
	nr_invoice
	<form:input path="nr_invoice" />
	dose
	<form:input path="dose" />
	price
	<form:input path="price" />
	series
	<form:input path="series" />
	
		<input type="submit" value="Save">
	</form:form>
</body>
</html>