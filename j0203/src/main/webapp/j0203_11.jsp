<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키저장하기</title>
	</head>
	<body>
		<h2>로그인</h2>
		<%
		String ck_id = "";
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("cook_id")){
				ck_id = cookie.getValue();
			}
		} %>
		<form action="./LoginCk.jsp" method="get">
		 <label>ID</label>
		 <input type="text" name="id" value=<%=ck_id %>><br/>
		 <label>PassWord</label>
		 <input type="text" name="pw"><br/>
		 <input type="checkbox" name="saveId" value="saveId" 
		 <% if(!ck_id.equals("")) {%>checked<%} %>
		 >
		 <label for="saveId">아이디 저장</label>
		 <br/>
		 <input type="submit" value="로그인">
		</form>
	</body>
</html>