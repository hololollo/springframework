<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>

</head>
<body>
	<nav>
		<h2>01_Get 전송</h2>
		<hr>
		<ul>
			<li><a href="${path2 }/ajax/">Home</a></li>
		</ul>
		<button id="btn1" type="button">Get 전송</button>
		<script>
		$(document).ready(function() {
			var fn1 = () => $.ajax({ // 애로우 함수 => 자바의 람다식으로 생각.
				type:"GET", // post방식을 사용하려면 datatype를 따로 빼서 변수형태로 선언 후에 그걸 불러오게 해야한다.
				url:"${path2}/ajax/ajax1pro.do",
				success:function(data) { console.log("성공", data); },
				error:function(err) { console.log("실패", err); },	
			});
			$("#btn1").on("click", function() { fn1(); });
		});
		</script>
	</nav>
</body>
</html>