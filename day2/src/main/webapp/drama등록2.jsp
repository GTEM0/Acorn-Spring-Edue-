<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
function register(){
	//alert("롸롸롸");
	let name = $("#name").val();
	let actor = $("#actor").val();
	alert(name);
				//키      값     key     value	
	let drama = {name : name, actor : actor};	//=> 문자열 바꿔줌
	let dramas = JSON.stringify(drama);		//드라마라는 제이슨열을 문자열로 바꿔줘 라는 뜻
	console.log(dramas);
	console.log(drama);
				
	$.ajax({
		type:"post",
		url:"/day2/drama",
		data: dramas,
		contentType: "application/json",	//json타입일 경우 필수적으로 기입해야되는 항목. 필수값!
		success: function(){
			alert(data);
		},
		error:function(){
			alert("error");
		}
	});
	
}
</script>

</head>
<body>
<input type="text" id="name">
<input type="text" id="actor">
<button onclick=register()>등록</button>
</body>
</html>