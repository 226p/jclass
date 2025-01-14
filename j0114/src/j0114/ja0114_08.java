package j0114;

import java.util.Scanner;

public class ja0114_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 구구단
		for(int i=2;i<=9;i++) {
			System.out.printf("\n [%d]단 \n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d \t",i,j,i*j);
				if(j==3) {
					break;
				}
			}
		}
//		
//		String str = "홍길동";
//		System.out.println("이름을 입력하세요. >>");
//		String name = scan.next();
//		
//		if(str.equals(name)) {
//			System.out.println("홍길동이 맞습니다.");
//		}else {
//			System.out.println("홍길동이 아닙니다.");
//		}
		
		
		// boolean, char, byte, short, int, long, float, double
		// == 등가비교
//		int num = 10;
//		int num2 = 10;
//		
//		if(num == num2) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		
//		String str1 = "안녕하세요.";
//		String str2 = "안녕";
//		String str3 = "안녕하세요.";
//		String str4 = new String("안녕하세요.");
//		
//		System.out.println(str1);
//		System.out.println(str3);
//		System.out.println(str4);
//		
//		System.out.println("----------------------------------");
//		if(str1 == str3) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		if(str3 == str4) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		// 8가지 기본형 타입 이외 비교 .equals()
//		if(str3.equals(str4)) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
		// python 리스트 주소값으로 비교
		// String 2개 이상의 값을 저장하기 때문에 == 비교 안됨
		
		
		// 조건문 : if, switch
		// 반복문 : for, while
				
		
		// 0.000000000 <= x < 1.000000000
//		double num = Math.random();  
//		System.out.println(num);
//		
//		// 1부터 10까지의 값 출력
//		double num2 = (int)(Math.random()*10)+1;  
//		System.out.println(num2);
		
		// 랜덤숫자 20개 출력(중복있음)
//		for(int i=0;i<20;i++) {
//			int ran = (int)(Math.random()*100)+1;
//			System.out.println(ran);
//		}
		
		// 1부터 100까지 랜덤숫자를 입력받아, 10번을 입력해서 숫자 맞추기 게임 구현(마지막 정답공개)
//		int num = (int)(Math.random()*100)+1;
//		
//		for(int i=0;i<10;i++) {
//			System.out.println("1~100 중 숫자를 맞춰보세요!");
//			int num2 = scan.nextInt();
//			
//			if(num2<num) {
//				System.out.printf("%d번) 입력한 숫자가 더 작습니다. 큰 수를 입력하세요.",i+1);
//			}else if(num2>num) {
//				System.out.printf("%d번) 입력한 숫자가 더 큽니다. 작은 수를 입력하세요.",i+1);
//			}else {
//				System.out.printf("%d번) 정답입니다! 답: %d \n",i+1,num);
//				break;
//				}
//		
//		}
//		System.out.printf("정답: %d",num);
		
		
		// 반복문을 활용하여 000 ~ 999까지 출력  001,002,003 .... 010,011, ... 999
//		for(int i=0;i<=9;i++) {
//			for(int j=0;j<=9;j++) {
//				for(int k=0;k<=9;k++) {
//					System.out.printf("%d%d%d \n",i,j,k);
//				}
//			}
//		}
		
//		for(int i=0;i<1000;i++) {
//			System.out.printf("%03d \n",i);
//		}
	}

}
