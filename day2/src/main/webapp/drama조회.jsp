<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!DOCTYPE html>
<html>
<script>
	function search() {
		// 검색 버튼이 클릭되면 이 함수가 호출됨

		$.ajax({
			type : "GET",             // HTTP 요청 방식
			url : "/day2/drama",      // 서버에서 데이터를 가져올 URL
			success : function(data) {
				// 요청이 성공했을 때 실행되는 콜백 함수
				console.log(data);
				let result = toHTML(data);
				$("#result").html(result);
			},
			error : function() {
				// 요청이 실패했을 때 실행되는 콜백 함수
				alert("error");
			}
		});
	}
	function toHTML(d) {
		// 서버에서 받아온 데이터를 HTML로 변환하는 함수
		console.log(d);
		let str = "<ul>";
		for (let i = 0; i < d.length; i++) {
			let item = d[i];
			str += "<li>" + item.name + " " + item.actor + "</li>";
		}
		str += "</ul>";
		alert(str);  // 변환된 HTML을 경고창에 표시 (디버깅용)
		return str;  // 변환된 HTML을 반환하여 화면에 출력함
	}
</script>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<button onclick="search()">드라마 조회</button>
	<div id="result"></div>
</body>
</html>