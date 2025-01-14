package j0114;

import java.util.Scanner;

public class ja0114_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 3개 숫자를 입력받아 가장 큰 수 출력
		System.out.println("숫자1를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("숫자2를 입력하세요.");
		int num2 = scan.nextInt();
		System.out.println("숫자3를 입력하세요.");
		int num3 = scan.nextInt();
		int maxNum = (num1>num2)?((num1>num3)?(num1):(num3)):((num2>num3)?(num2):(num3));
		System.out.println(maxNum);
		
		// 3개 숫자를 입력받아 가장 큰 수 출력
		System.out.println("숫자1를 입력하세요.");
		int num4 = scan.nextInt();
		System.out.println("숫자2를 입력하세요.");
		int num5 = scan.nextInt();
		System.out.println("숫자3를 입력하세요.");
		int num6 = scan.nextInt();
		int minNum = (num4<num5)?((num4<num6)?(num4):(num6)):((num5<num6)?(num5):(num6));
		System.out.println(minNum);
		
		
		// 양수(0포함)인지 음수인지
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		String result = (num>0)?"양수입니다.":(num==0)?"0":"음수입니다.";
//		System.out.println(result);
		
//		System.out.println("점수를 입력하세요. >>");
//		int score = scan.nextInt();
//		String result = (score>=60)?"합격":"불합격";
//		System.out.println(result);
		
//		System.out.println("숫자를 입력하세요.");
//		int x = scan.nextInt();
//		int absX = x>=0?x:-x;  // 절대값
//		System.out.println(absX);
		
//		System.out.println("영문자를 입력하세요.");
//		char input = scan.next().charAt(0);
//		if((input>='a' && input<='z')||(input>='A' && input<='Z')) {
//			System.out.println("영문자입니다.");
//		}else {
//			System.out.println("영문자가 아닙니다.");
//		}
		
		
//		if(5>3) {
//			System.out.println("정답입니다.");
//		}else {
//			System.out.println("오답입니다.");
//		}
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소수점 셋째자리 실수를 입력하세요.");
//		double input = scan.nextDouble();
//		
//		System.out.println(Math.round(input*100)/100.0);  // 소수점 셋째자리에서 반올림
		
		// 올림 - ceil, 버림 - floor, 반올림 - round
		
		// 버림 공식
//		float pi = 3.141592f;
//		float pi2 = (int)(pi*1000)/1000f;   
//		System.out.println(pi2);
		
		// 반올림 공식
//		double pi = 3.141592;
//		double pi2 = Math.round(pi*1000)/1000.0;  // Math.round() 소수점 첫째자리에서 반올림 진행
//		System.out.println(pi2);
//		
//		System.out.println(Math.round(102.3));
	}

}
