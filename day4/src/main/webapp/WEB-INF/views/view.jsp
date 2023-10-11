<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>네이버 검색 결과</title>
</head>
<body>

    <table border="1">
        <tr>
            <th>title</th>
            <th>link</th>
            <th>image</th>
            <th>lprice</th>
        </tr>

        <c:forEach items="${items}" var="item">
            <tr>
                <td>${item.title}</td>
                <td><a href="${item.link}">${item.link}</a></td>
                <td><img src="product_image.jpg" alt="Product Image" style="max-width: 100px; max-height: 100px;"></td>
                <td>${item.lprice} KRW</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
