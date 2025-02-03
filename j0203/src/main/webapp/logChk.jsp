<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">	
		<title>로그인 성공</title>
	</head>
	<body>
		<!-- html주석 : 소스보기 하면 나옴 -->
		<%-- jsp주석 : 소스보기 안나옴 / 저장안되니까 저장되게 다시하기 --%>
		<!-- 저장되었는지, 삭제되었는지 출력 -->
		<%
		String idsave = request.getParameter("idsave");
		String id = request.getParameter("id");
		if(idsave != null){
			Cookie cookie = new Cookie("cook_id",id);
			cookie.setMaxAge(60*60*24*365);
			response.addCookie(cookie);%>
		<div>cook_id가 저장되었습니다.</div>
		<%}else{
			Cookie[] cookies = request.getCookies();
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("cook_id")){
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
			}%>
		<div>저장되었던 cook_id가 삭제되었습니다.</div>
		<%}
		%>
		<button onclick="javascript:location.href='./logOK.jsp'">이동하기</button>
	</body>
</html>