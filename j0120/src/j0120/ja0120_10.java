package j0120;

import java.util.Scanner;

public class ja0120_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생성적프로그램
		// 변수선언(번호,이름,국어,영어,수학,합계,평균)
		StuScore[] s = new StuScore[10]; // 배열선언(공간은 아직없음)
		int[] score = new int[3];
		int no=0, kor=0, eng=0, math=0, total=0, rank=0;
		String name = "";
		double avg = 0;
		
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int choice = 0, temp = 0, rankC = 0, count = 0;  // 번호선택, 검색확인, 등수, 총 학생수 확인
		
		
		// 무한반복
		loop:while(true) {
			// 2. 화면구현
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------------------");
			System.out.println("원하는 번호를 입력하세요. >>");
			choice = scan.nextInt();
			
			// 3. 번호선택 switch
			switch(choice) {
				case 1:{  // 4. 학생성적입력
					System.out.println("[ 성적입력 ]");
					while(count<10) {
						System.out.printf("%s번째 학생 이름을 입력하세요.(이전화면 : -) >>\n",count+1);
						name = scan.next();
						
						if(name.equals("-")) {
							System.out.println("이전 화면으로 돌아갑니다.");
							break;
						}
						
						// 국어, 영어, 수학
//						System.out.println("국어점수를 입력하세요. >>");
//						kor = scan.nextInt();
//						System.out.println("영어점수를 입력하세요. >>");
//						eng = scan.nextInt();
//						System.out.println("수학점수를 입력하세요. >>");
//						math = scan.nextInt();
						
						for(int i=0;i<score.length;i++) {
							System.out.printf("%s점수를 입력하세요. >>\n",title[i+2]);
							score[i] = scan.nextInt();
						}
						
						// name,kor,eng,math -> no,total,avg
//						s[count] = new StuScore(name,kor,eng,math);
						s[count] = new StuScore(name,score[0],score[1],score[2]);
						
						// System.out.printf("%d번째 학생의 정보가 저장되었습니다.\n",s[count].no);
						s[count].print();
						System.out.printf("학생 성적이 저장되었습니다.\n");
						count++;
					}
					break;
				}
				
				case 2:{
					System.out.println("[ 성적출력 ]");
					for(int j=0;j<title.length;j++) {
						System.out.printf("%s\t",title[j]);
					}
					System.out.println();
					System.out.println("-----------------------------------------------------------");
					for(int j=0;j<count;j++) {
						System.out.printf("%d\t",s[j].no);
						System.out.printf("%s\t",s[j].name);
						System.out.printf("%d\t",s[j].kor);
						System.out.printf("%d\t",s[j].eng);
						System.out.printf("%d\t",s[j].math);
						System.out.printf("%d\t",s[j].total);
						System.out.printf("%.2f\t",s[j].avg);
						System.out.printf("%d\n",s[j].rank);
					}
					break;
				}
				
				case 3:{}
				
				case 0:{
					System.out.println("프로그램을 종료합니다.");
					break loop;
				}
			
			
			}
		}
		
		
		
		
		

	}

}
