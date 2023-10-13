<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${dust}" var="ee">
${ee.informCode}<br>
${ee.informCode}<br>
${ee.informCode}<br>
${ee.informCode}<br>
<img alt="" src="${ee.imageUrl1}">
<img alt="" src="${ee.imageUrl2}">
<img alt="" src="${ee.imageUrl3}">
<img alt="" src="${ee.imageUrl4}">
<img alt="" src="${ee.imageUrl5}">
<img alt="" src="${ee.imageUrl6}">

</c:forEach>

</body>
</html>