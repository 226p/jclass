<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>	
		<!-- 아이디를 쿠키에 저장하기 / 쿠키이름 : cook_id, 변수값 : 입력한 데이터 -->
		<%
		 String saveId = request.getParameter("saveId");
		
		 if(saveId != null){
			 String cookN = "cook_id";
			 String id = request.getParameter("id");
			 
			 Cookie cookie = new Cookie(cookN, id);
			 cookie.setMaxAge(60*60*24*365);
			 response.addCookie(cookie);%>
		<div><%= cookN %>이 저장되었습니다.</div> 
		 <% }else{
			Cookie[] cookies = request.getCookies();
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("cook_id")){
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
			} %>
		<div>저장한 쿠키가 삭제되었습니다.</div>
			
		<%
		 }
		%>
		<button onclick="javascript:location.href='loginOk.jsp'">이동하기</button>
	</body>
</html>