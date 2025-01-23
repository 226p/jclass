package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Deck {
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	
	// 1. 변수선언(번호, 이름, 국어, 영어, 수학, 합계, 평균)
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","순위"};
	int no=0, rank=0, kor=0, eng=0, math=0, total=0;
	String name ="";
	double avg = 0;
	
	int choice=0, temp=0, rankC=0;
	
	// 1. 메인메뉴 메소드
	int main_print() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("-----------------------------------");
		System.out.println("원하는 번호를 입력하세요. >>");
		choice = scan.nextInt();
		return choice;
	} // 1번 끝
	
	// 2. 입력 메소드
	void input() {
		System.out.println("[ 학생성적 입력 ]");
		
		while(true) {
			System.out.printf("   < %d번째 >\n",list.size()+1);
			System.out.println("이름을 입력하세요.(- 이전페이지 이동)");
			name = scan.next();
			
			if(name.equals("-")) {
				break;
			}
			
			System.out.printf("국어점수를 입력하세요.\n");
			kor = scan.nextInt();
			System.out.printf("영어어점수를 입력하세요.\n");
			eng = scan.nextInt();
			System.out.printf("수학점수를 입력하세요.\n");
			math = scan.nextInt();
			
			// list 저장
			list.add(new Stu(name,kor,eng,math));
			
			System.out.printf("%s 님의 성적이 저장되었습니다.\n",name);
		} // case1.while
	} // 2번 끝
	
	// 3. 출력 메소드
	void output() {
		System.out.println("                    [ 학생성적 출력 ]");
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		
		for(int i=0;i<list.size();i++) {
			Stu s = (Stu)list.get(i);  // Object 형변환
			System.out.printf("%d\t",s.getNo());
			System.out.printf("%s\t",s.getName());
			System.out.printf("%d\t",s.getKor());
			System.out.printf("%d\t",s.getEng());
			System.out.printf("%d\t",s.getMath());
			System.out.printf("%d\t",s.getTotal());
			System.out.printf("%.2f\t",s.getAvg());					
			System.out.printf("%d\n",s.getRank());
		}
		System.out.println();
	} // 3번 끝
	
	// 4. 수정 메소드
	void update() {
		int searchNo = 0;
		System.out.println("[ 성적수정 ]");
		System.out.println("성적을 수정할 학생의 이름을 입력하세요.(이전화면:-) >>");
		name = scan.next();
		for(int i=0;i<list.size();i++) {
			Stu s = (Stu)list.get(i);
			if(name.equals("-")) {
				System.out.println("이전 화면으로 돌아갑니다.");
				break;
			}else if(name.equals(s.getName())) {
				searchNo = i;
				System.out.printf("%s 님의 정보를 찾았습니다. \n",name);
				System.out.println("1. 국어점수");
				System.out.println("2. 영어점수");
				System.out.println("3. 수학점수");
				System.out.println("수정할 과목번호를 입력하세요. >>");
				choice = scan.nextInt();
				
				switch(choice) {
					case 1:{
						System.out.println("[ 국어점수 수정 ]");
						System.out.printf("기존 국어점수 : %d\n",kor);
						System.out.printf("변경 국어점수 : ");
						s.setKor(scan.nextInt());
						
						break;
					}
					case 2:{
						System.out.println("[ 영어점수 수정 ]");
						System.out.printf("기존 영어점수 : %d\n",eng);
						System.out.printf("변경 영어점수 : ");
						s.setEng(scan.nextInt());
						
						break;
					}
					case 3:{
						System.out.println("[ 수학점수 수정 ]");
						System.out.printf("기존 수학점수 : %d\n",math);
						System.out.printf("변경 수학점수 : ");
						s.setMath(scan.nextInt());
						
						break;
					}
					
				} // switch문
				System.out.println("수정이 완료되었습니다.");
				
				s.setTotal(s.getKor()+s.getEng()+s.getMath());
				s.setAvg(s.getTotal()/3.0);
			}else{
				System.out.printf("%s 님의 정보를 찾을 수 없습니다.\n",name);
				break;
			} // if절
			
		} // for문
	} // 4번 끝
	
	// 5. 등수처리 메소드
	void ranking() {
//		System.out.println("[ 등수처리 ]");
//		for(int i=0;i<count;i++) {
//			rankC = 1;
//			for(int j=0;j<count;j++) {
//				if(s[i].total<s[j].total) {
//					rankC++;
//				}
//			}
//			s[i].rank = rankC;
//		}
//		System.out.println("등수처리가 완료되었습니다.");
//		break;
		
	} // 5번 끝
	
	
	
}
