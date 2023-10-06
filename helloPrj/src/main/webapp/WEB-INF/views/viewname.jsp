<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${key} 진짜 진짜
	잘 하고 있어!
	지금도 충분해!
	잘 해왔어!

<% String value = (String)request.getAttribute("key"); %>
<%=value %>
</body>
</html>