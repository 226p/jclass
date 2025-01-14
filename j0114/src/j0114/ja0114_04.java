package j0114;

import java.util.Scanner;

public class ja0114_04 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소문자를 입력하세요.");
//		char str = scan.next().charAt(0);   // 입력한 문자열 중 원하는 문자만 출력하기
//		System.out.println(str);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("소문자를 입력하세요.");
		char str = scan.next().charAt(0);   
		str = (char)(str-32);   // 소문자 → 대문자로 치환
		System.out.println(str);
		
//		char ch1 = 'a';
//		char ch2 = (char)(ch1-32);
//		System.out.println(ch2);
//		
//		char ch3 = 'A';
//		char ch4 = (char)(ch3+32);
//		System.out.println(ch4);
		
//		char c1 = 'a';
//		char c2 = (char)(c1 + 1); // 아스키코드에서 1이 더해짐
//		System.out.println(c2);   // b 출력
//		
//		int n1 = c1 + 1;  // a의 아스키코드 10진법 : 97 + 1
//		System.out.println(n1);  // 98 출력
//		
//		char c3 = ++c1;
//		System.out.println(c3);
//		
//		int n2 = 'B' - 'A';
//		System.out.println(n2);
//		
//		int n3 = '9'- '0';
//		System.out.println(n3);
//		
//		int n4 = '2' - '0';
//		System.out.println(n4);
		
		// byte, short, char 사칙연산을 하면 int타입으로 변경됨.
//		byte a = 1;
//		byte b = 2;
//		byte c = (byte)(a+b);  // 강제형변환 시켜야함
//		
//		char ch = 'a';
//		char ch2 = 'b';
//		int ch3 = ch+ch2;
//		System.out.println(ch3);  // 97 + 98 = 195
//		
//		double d1 = 3.14;
//		int num = (int)d1;
//		System.out.println(num);
		
//		int a = 1000000;
//		int b = 2000000;
//		long c = (long)(a) * b;  // int는 21억이 넘어가면 overflow발생(하나는 long으로 바꿔야 됨)
//		System.out.println(c);
//		
//		
//		int n1 = 2100000000;
//		int n2 = 2000000000;
//		long n3 = (long)(n1)+n2;
//		System.out.println(n3);
		
		// 증감연산자
//		int a = 10;
//		a++;
//		int b = a;  //  1을 증가시키라는 뜻
//		int c = a++;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
	}

}
