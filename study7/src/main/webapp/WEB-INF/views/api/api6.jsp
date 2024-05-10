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
		<input type="number" name="stdNumber" id="num" placeholder="번호 입력" /><br><br>
		<input type="text" name="name" id="name" placeholder="학생명 입력" /><br><br>
		<input type="number" name="age" id="age" placeholder="나이 입력" /><br><br>
		<button type="button" id="btn1">등록</button>
	</div>
	
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
			var student = {stdNumber:parseInt($("#num").val()), name:$("#name").val(), age:parseInt($("#age").val()) };
			$.ajax({
				type:"post",
				url:"${path2}/api/api6.do",
				data:JSON.stringify(student),
				dataType:"json",
			    contentType: "application/json; charset=utf-8", 
				success:function(data) {} 
			});
		});
	});
	</script>
	
</body>
</html>