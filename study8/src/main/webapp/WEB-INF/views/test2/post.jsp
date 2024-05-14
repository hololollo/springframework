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
<title>post방법1</title>
<script src="https://code.jquery.com/jquery-1.11.0.js"></script>
</head>
<body>
<div class="wrap">
	<h2>Post 테스트 - @RequestParam</h2>
	<hr>
	<div class="test">
		<form name="post1" action="${path2 }/test2/post1.do" method="post">
			<input type="number" name="num" id="num1" placeholder="숫자 입력" /><br>
			<input type="text" name="title1" id="title1" placeholder="제목 입력" /><br> <!-- css에서는 id값으로. 여기서는 name값으로. -->
			<button type="submit">post1 전송</button>
		</form>
	</div>
	<hr><br>
</div>
<div class="wrap">
	<h2>Post 테스트 - Object(객체)</h2>
	<hr>
	<div class="test">
		<form name="post2" action="${path2 }/test2/post2.do" method="post">
			<input type="number" name="num" id="num2" placeholder="숫자 입력" /><br>
			<input type="text" name="title" id="title2" placeholder="제목 입력" /><br> <!-- css에서는 id값으로. 여기서는 name값으로. -->
			<button type="submit">post2 전송</button>
		</form>
	</div>
	<hr><br>
</div>
<div class="wrap">
	<h2>Post 테스트 - @modelAttribute</h2>
	<hr>
	<div class="test">
		<form name="post3" action="${path2 }/test2/post3.do" method="post">
			<input type="number" name="num" id="num3" placeholder="숫자 입력" /><br>
			<input type="text" name="title" id="title3" placeholder="제목 입력" /><br> <!-- css에서는 id값으로. 여기서는 name값으로. -->
			<button type="submit">post3 전송</button>
		</form>
	</div>
	<hr><br>
</div>
<div class="wrap"> <!-- PathVariable => url을 담아야 하기 때문에 작동 불가능. 따라서 method를 활용하여 get으로 인식하게끔 처리해준다. -->
		<h2>Post 테스트4 - @PathVariable</h2>
	<hr>
	<div class="test">
		<form name="post4" action="" method="get">
			<input type="number" name="num" id="num4" placeholder="숫자 입력" /><br>
			<input type="text" name="title" id="title4" placeholder="제목 입력" required /><br>
			<button type="button" onclick="fnc1()">post4 전송</button>
		</form>
	</div>
	<script>
	function fnc1() {
		if($("#num4").val()=="" || $("#title4").val()==""){
			alert("값이 비어 있습니다.");
			return;
		}
		var num = parseInt($("#num4").val());
		var title = $("#title4").val();
		location.href = "${path2 }/test2/post4.do/"+num+"/"+title;
				/*form태그의 action값 대신 a태그 클릭한 것과 동일한 효과. 문자열 + 숫자는 결국 문자열이다.*/
		}
	</script>
	<hr><br>
</div>
<div class="wrap">
	<h2>Post 테스트 - ModelAndView</h2>
	<hr>
	<div class="test">
		<form name="post5" action="${path2 }/test2/post5.do" method="post">
			<input type="number" name="num" id="num5" placeholder="숫자 입력" required/><br>
			<input type="text" name="title" id="title5" placeholder="제목 입력" /><br> <!-- css에서는 id값으로. 여기서는 name값으로. -->
			<button type="submit">post5 전송</button>
		</form>
	</div>
	<hr><br>
</div>
	<a href="${path2 }">홈으로</a>
</body>
</html>