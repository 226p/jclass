package com.naver.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FormSend")
public class FormSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction 호출");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String major = request.getParameter("major");
		String[] hobby = request.getParameterValues("hobby");
		String hobbys = "";
		System.out.println("아이디 : "+id);
		System.out.println("비밀번호 : "+pw);
		System.out.println("이름 : "+name);
		System.out.println("이름 : "+gender);
		System.out.println("이름 : "+major);
		for(int i=0;i<hobby.length;i++) {
			if(i==0) hobbys += hobby[i];
			else hobbys += ","+hobby[i];
			System.out.println(hobby[i]+" ");
		}
		System.out.println("이름 : "+hobbys);
//		String[] h = hobbys.split(",");
		
		response.setContentType("text/html;charset=utf-8");  // html
		request.setCharacterEncoding("utf-8");  // 한글인코딩
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>서블릿페이지</title></head>");
		writer.println("<body>");
		writer.println("<h2>회원정보</h2>");
		writer.printf("<h4>이름 : %s</h4>\n",name);
		writer.printf("<h4>아이디 : %s</h4>\n",id);
		writer.printf("<h4>비밀번호 : %s</h4>\n",pw);
		writer.println("</body>");
		writer.println("</html>");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request, response);
	}

}
