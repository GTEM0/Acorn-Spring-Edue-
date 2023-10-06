<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script>
        function register() {
            let name = $("#name").val();
            let actor = $("#actor").val();
            let drama = { name: name, actor: actor };
            let dramaJSON = JSON.stringify(drama);

            $.ajax({
                type: "POST", 
                url: "/day2/drama", 
                data: dramaJSON,
                contentType: "application/json;", 
                success: function(data) {
                    alert("성공 : " + data);
                },
                error: function() {
                    alert("에러]");
                }
            });
        }
    </script>
</head>
<body>
    <input type="text" id="name">
    <input type="text" id="actor">
    <!-- Corrected the function name here -->
    <button onclick="register()">등록</button>
</body>
</html>
