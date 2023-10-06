<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<c:forEach items="${list}" var="item">
			<li>${item}</li>
		</c:forEach>
	</ul>
	
	
<%-- <c:forEach items="${list}" var="item"> --%>
<!-- item객체의 getId()호출하는 것. getter 없으면 오류 발생합니다. -->
<%-- ${item.id}, ${item.pw} --%>

	
</body>
</html>