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
<title>Student-Classroom</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
	<div class="form">
		<input type="number" name="stdNumber1" class="num" placeholder="번호 입력" />
		<input type="text" name="name1" class="name" placeholder="학생명 입력" />
		<input type="number" name="age1" class="age" placeholder="나이 입력" />
	</div>
	<div class="form">
		<input type="number" name="stdNumber2" class="num" placeholder="번호 입력" />
		<input type="text" name="name2" class="name" placeholder="학생명 입력" />
		<input type="number" name="age2" class="age" placeholder="나이 입력" />
	</div>
	<div class="form">
		<input type="number" name="stdNumber3" class="num" placeholder="번호 입력" />
		<input type="text" name="name3" class="name" placeholder="학생명 입력" />
		<input type="number" name="age3" class="age" placeholder="나이 입력" />
	</div>	
	<button type="button" id="btn1">등록</button>
	
	<table>
		<thead>
			<th>번호</th><th>학생명</th><th>나이</th>
		</thead>
		<tbody id="tbody">
			
		</tbody>
	</table>
	<script>
	$(document).ready(function(){
		$("#btn1").click(function(){
			var student = {stdNumber:0, name:"아무개", age:0 }; // 객체는 중괄호
			var stds = [student, student, student]; // 배열은 대괄호
			$.each($(".form"), function(index, value) {
				var num = $(this).find(".num").val();
				var name = $(this).find(".name").val();
				var age = $(this).find(".age").val();
				
				student = {stdNumber:num, name:name, age:age};
				stds[index] = student;
			});	
			$.ajax({
				type:"post",
				url:"${path2}/api/api7.do",
				data:JSON.stringify(stds),
				dataType:"json",
			    contentType: "application/json; charset=utf-8", 
				success:function(data) {} 
			});
		});
	});
	</script>
	
</body>
</html>