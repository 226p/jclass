package j0124;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int choice=0, temp=0,count=0;
		StuDeck sd = new StuDeck();
		
		sd.fileRead();  // 파일 읽어오기
		
		// list출력
		
		
		loop:while(true) {
		System.out.println("\t    [ 학생성적프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 성적검색");
		System.out.println("6. 등수정렬");
		System.out.println("7. 이름정렬");
		System.out.println("8. 등수처리");
		System.out.println("9. 파일저장");
		System.out.println("0. 프로그램 종료");
		System.out.println("----------------------------------------");
		System.out.println("원하는 번호를 입력하세요.  >>");
		choice = scan.nextInt();
			
		switch(choice) {
			case 1:
				sd.input();  // 성적입력
				break;
				
			case 2:
				sd.listPrint();  // 성적출력
				break;
				
			case 3:
				sd.stuUpdate();  // 성적수정
				break;
				
			case 4:
				sd.stuDelete();  // 성적삭제
				break;
				
			case 5:
				break;
				
			case 6:
				break;
				
			case 7:
				break;
				
			case 8:
				sd.ranking();
				break;
				
			case 9:
				sd.filesave();
				break;
				
			default :
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
		} // while:loop
		
	}

}
