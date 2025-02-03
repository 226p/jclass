<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키정보 모두보기</title>
	</head>
	<body>
		<h2>모든 쿠키 정보</h2>
		<%
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies){
			out.print("쿠키정보 : "+cookie.getName()+","+cookie.getValue()+"<br/>");
		}
		%>
		<button onclick="javascript:location.href='./login.jsp'">이동하기</button>
	</body>
</html>