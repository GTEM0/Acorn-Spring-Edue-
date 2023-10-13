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
<c:forEach items="${dust}" var="dd">

${dd.informCode}<br>
${dd.informCause}<br>
${dd.informOverall}<br>
${dd.informData}<br>


</c:forEach>
</body>
</html>