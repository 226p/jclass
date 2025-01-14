package j0113;

public class ja0113_05 {

	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);

		char ch2 = '\u0041';  // 16*4 + 1*1 = 65 → A
		System.out.println(ch2);
		
		char ch3 = 97;  // 97 → a
		System.out.println(ch3);
		
		char ch4 = '\t'; // tab기능, 단 print로
		System.out.print(ch4);
		
		char ch5 ='a'; 
		System.out.print(ch5);
		
		char ch6 ='b'; 
		System.out.print(ch6);
		
		char ch7 ='c'; 
		System.out.print(ch7);
		
		// boolean - true, false(소문자)
		boolean p = true;
		boolean p2 = false;
		
		// 정수형 - byte, short 거의 사용안함. 기본형 정수 int
		long l = 10000000L;  // long에는 접미사 L을 붙임
		
		// 실수형 - float, double 기본형 실수 double
		float f = 3.14F;  // float는 F 붙임
		double d = 3.14;  
	}

}
