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
		<h2>데이터</h2>
		<div>count : ${param.count}</div>
		<hr>
		<c:forEach items="${list}" var="member" varStatus="vs">
		 <div>데이터 ${vs.index+1} : ${member.id},${member.name}</div>
		</c:forEach>
	</body>
</html>