package j0114;

import java.util.Scanner;

public class ja0114_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 조건문 - switch문
		
		System.out.println("사용자권한을 생성합니다.");
		int num = scan.nextInt();
		switch(num) {
		case 5:
			System.out.println("super");
		case 4:
			System.out.println("delete");
		case 3:
			System.out.println("modify");  
		case 2:
			System.out.println("write");   
		case 1:
			System.out.println("read");
		}
		
//		// 1-입력창, 2-검색창, 3-수정창, 4-삭제창, 5-종료창
//		System.out.println("원하는 번호를 입력하세요.");
//		int num = scan.nextInt();
//		switch(num) {
//		case 1:
//			System.out.println("검색창");
//			break;     // switch문은 무조건 break; 필수
//		case 2:
//			System.out.println("입력창");
//			break;     
//		case 3:
//			System.out.println("수정창");
//			break;     
//		case 4:
//			System.out.println("삭제창");
//			break;     
//		case 5:
//			System.out.println("종료창");
//			break;     
//		}
		
		
		// 조건문 - if문
		// 점수를 입력받아 학점을 주세요.
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		if(score>=90) {
//			System.out.print("A");  // print : enter키 안누르고 출력 / println : enter키 포함하여 출력
//		}else if(score>=80) {
//			System.out.print("B");
//		}else if(score>=70) {
//			System.out.print("C");
//		}else if(score>=60) {
//			System.out.print("D");
//		}else {
//			System.out.print("F");
//		}
//		
//		System.out.println("학점");
		
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		if(num>0) {
//			System.out.println("양수입니다.");
//		}else if(num==0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}
	}

}
