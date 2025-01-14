package j0114;

import java.util.Scanner;

public class ja0114_03 {

	public static void main(String[] args) {
		// 학생성적프로그램
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생이름을 입력하세요.");
		String name = scan.nextLine();
		
		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();
		
		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();
		
		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;  // 타입에 따라 맞춰야함(3으로 하면 int처럼 소수점 뒤 생략됨)
		// 영어, 수학 받고 합계까지
		System.out.printf("이름 : %s, 합계 : %d, 평균 : %.2f \n",name,total,avg);
		
	
	}

}
