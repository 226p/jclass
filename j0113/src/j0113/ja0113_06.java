package j0113;

public class ja0113_06 {
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch); 
		
		char ch2 = 65;
		System.out.println(ch2);
		
		int ch3 = 65;
		System.out.println(ch3);
		
		String ch4 = "ab";
		System.out.println(ch4);
		
		String s1 = "A"+"B";
		System.out.println(s1);  // 타입 : string
		
		System.out.println(""+7);  // 타입 : string
		System.out.println(""+7+7);  // 타입 : string
		System.out.println(7+7+"");  // 타입 : string
		
		char ch5 = ' '; // ''는 error / ' '는 띄어쓰기(빈공백문자) 가능
		String s4 = "";  // String은 빈공백 가능
		
		byte b1 = 127;
		// byte b2 = 128;
		System.out.println(b1+1);
		
		int n1 = 2147483647;
		// int n2 = 2147483648;
		
		System.out.println(n1+1);
		
		
	}
}
