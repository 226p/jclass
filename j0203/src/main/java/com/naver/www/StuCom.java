package com.naver.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StuCom")
public class StuCom extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 학번, 이름, 국, 영, 수, 합계, 평균 출력
       
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction 호출");
		String stuNo_ = request.getParameter("stuNo");
		int stuNo = Integer.parseInt(stuNo_);
		String name = request.getParameter("name");
		String kor_ = request.getParameter("kor");
		int kor = Integer.parseInt(kor_);
		String eng_ = request.getParameter("eng");
		int eng = Integer.parseInt(eng_);
		String math_ = request.getParameter("math");
		int math = Integer.parseInt(math_);
		int total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.println(stuNo);
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(total);
		System.out.println(avg);
		
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>학생성적 페이지</title></head>");
		writer.println("<body>");
		writer.printf("<h4>학번 : %d<h4>\n",stuNo);
		writer.printf("<h4>이름 : %s<h4>\n",name);
		writer.printf("<h4>국어 : %d<h4>\n",kor);
		writer.printf("<h4>영어 : %d<h4>\n",eng);
		writer.printf("<h4>수학 : %d<h4>\n",math);
		writer.printf("<h4>합계 : %d<h4>\n",total);
		writer.printf("<h4>평균 : %.2f<h4>\n",avg);
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
