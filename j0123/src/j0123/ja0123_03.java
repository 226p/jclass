package j0123;

import java.util.Scanner;

public class ja0123_03 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			Exception e = new Exception("error 강제삽입");
			System.out.println(4);
			throw e;  
			// 정상적으로 돌아가는 프로그램 구현
		} catch(Exception e) {
			// error 발생시 실행되는 부분
			System.out.println(e.getMessage());
			e.printStackTrace();  // 에러구문 확인
		}
		System.out.println(5);
		System.out.println(6);
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("안녕하세요.");  // 오타 : 컴파일 에러
//		int[] n = new int[3];
//		for(int i=0;i<4;i++) {
//			System.out.println("숫자를 입력하세요.");
//			n[i] = scan.nextInt(); // 런타임에러
//		}
	}

}
