package j0117;

import java.util.Scanner;

public class ja0117_09 {
//	int add(int a, int b) {
//		int result = a+b;
//		return result;
//	}
//	
//	boolean power;
//	void power() {
//		power = !power;
//	}
//
//	// 메소드
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 메소드 3개 / a,b-> a+10, b+10 두 수의 합 리턴 / a,b-> a*10, b*10 두 수의 합 리턴 / a,b-> a*b 리턴
		Cal2 c = new Cal2();
		while(true) {
			System.out.println("숫자1를 입력하세요. >>");
			int a = scan.nextInt();
			System.out.println("숫자2를 입력하세요. >>");
			int b = scan.nextInt();
			
			int result = c.add(a, b);
			int result2 = c.mult10(a, b);
			int result3 = c.mult(a, b);
			
			if(a==-1||b==-1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println(result);
				System.out.println(result2);
				System.out.println(result3);
			}
		}
		
		
//		Cal c = new Cal();  // 객체선언
//		int num = 100;
//		int num2 = 20;
//		
//		int result = c.add(num, num2);
//		System.out.println("더하기 : "+result);
//		
//		int result2 = c.sub(num, num2);
//		System.out.println("빼기 : "+result2);
//		
//		c.mult(num, num2);
		
		
	}
//		int a = 0;  // 지역변수
//		ja0117_09 j = new ja0117_09();
//		j.power = true;
//		System.out.println(j.power);

}
