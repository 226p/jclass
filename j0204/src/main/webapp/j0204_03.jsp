<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>출력</title>
	</head>
	<body>
		<div>시작 입력값 : ${param.st}</div>  <!-- input(request)으로 들어오는 값은 param. 붙여야됨 -->
		<div>끝 입력값 : ${param.ed}</div>
		<c:forEach begin="${param.st}" end="${param.ed}" step="1" var="i">
			<div>반복 : ${i}</div>
		</c:forEach>
		<button onclick="javascript:location.href='input.jsp'">이동하기</button>
	</body>
</html>