package j0114;

public class ja0114_01 {

	public static void main(String[] args) {
		boolean temp = true;  // 논리형
		char ch = 'a';  	  // 문자형
		byte b = 1;  		  // 정수형
		short s = 2; 		  // 정수형
		int n = 100;  		  // 정수형
		long n1 = 1000L;  	  // 정수형
		float f = 3.14F; 	  // 실수형
		double d = 10.345; 	  // 실수형
		String str = "abc";	  // 문자열
		String str2 = new String("abc");  // 원래는 이렇게 써야되는데, 많이 사용해서 기본형 변수처럼 사용가능
		
		System.out.println(temp);
		
		// printf
		System.out.printf("%b \n",temp);
		System.out.printf("문자형 : %c \n",ch);
		System.out.printf("정수형 : %d, %d \n",n,n1);
		System.out.printf("실수형 : %.2f, %.2f \n",f,d);
		System.out.printf("문자열 : %s \n",str);
	}

}
