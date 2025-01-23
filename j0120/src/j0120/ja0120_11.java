package j0120;

import java.util.Scanner;

public class ja0120_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StuScore[] s = new StuScore[10];
		int[] score = new int[3];
		int no=0, kor=0, eng=0, math=0, total=0, choice=0, count=0, rank=0;  // 메인메소드 지역변수 꼭 초기화해줘야 함!!
		String name;
		double avg;
		int temp=0, rankC=0;
		
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------------------");
			System.out.println("원하는 번호를 입력하세요. >>");
			choice = scan.nextInt();
			
			switch(choice) {
				case 1:{
					System.out.println("[ 성적입력 ]");
					while(count<10) {
						System.out.printf("<< %d번째 >>\n",count+1);
						System.out.println("학생 이름을 입력하세요.(이전화면:-) >>");
						name = scan.next();
						
						if(name.equals("-")) {
							System.out.println("이전 화면으로 돌아갑니다.");
							break;
						}
						
						for(int i=0;i<score.length;i++) {
							System.out.printf("%s점수를 입력하세요. >>",title[i+2]);
							score[i] = scan.nextInt();
						}
						
						s[count] = new StuScore(name, score[0], score[1], score[2]);
						
						s[count].print();
						System.out.println("성적이 저장되었습니다.");
						count++;
					}
					break;
				}
				
				case 2:{
					System.out.println("[ 성적출력 ]");
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("-----------------------------------------------------------");
					for(int i=0;i<count;i++) {
						System.out.printf("%d\t",s[i].no);
						System.out.printf("%s\t",s[i].name);
						System.out.printf("%d\t",s[i].kor);
						System.out.printf("%d\t",s[i].eng);
						System.out.printf("%d\t",s[i].math);
						System.out.printf("%d\t",s[i].total);
						System.out.printf("%.2f\t",s[i].avg);
						System.out.printf("%d\n",s[i].rank);
					}
					break;
				}
				
				case 3:{
					int searchNo = 0;
					System.out.println("[ 성적수정 ]");
					System.out.println("성적을 수정할 학생의 이름을 입력하세요.(이전화면:-) >>");
					name = scan.next();
					for(int i=0;i<count;i++) {
						if(name.equals("-")) {
							System.out.println("이전 화면으로 돌아갑니다.");
							break;
						}else if(name.equals(s[i].name)) {
							temp = 1;
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
									System.out.printf("기존 국어점수 : %d\n",s[i].kor);
									System.out.printf("변경 국어점수 : ");
									s[i].kor = scan.nextInt();
									
									break;
								}
								case 2:{
									System.out.println("[ 영어점수 수정 ]");
									System.out.printf("기존 영어점수 : %d\n",s[i].eng);
									System.out.printf("변경 영어점수 : ");
									s[i].eng = scan.nextInt();
									
									break;
								}
								case 3:{
									System.out.println("[ 수학점수 수정 ]");
									System.out.printf("기존 수학점수 : %d\n",s[i].math);
									System.out.printf("변경 수학점수 : ");
									s[i].math = scan.nextInt();
									
									break;
								}
								
							} // switch문
							System.out.println("수정이 완료되었습니다.");
							
							s[i].total = s[i].kor+s[i].eng+s[i].math;
							s[i].avg = s[i].total/3.0;
						}else{
							System.out.printf("%s 님의 정보를 찾을 수 없습니다.\n",name);
							break;
						} // if절
						
					}
					break;
				}
				
				case 4:{
					System.out.println("[ 등수처리 ]");
					for(int i=0;i<count;i++) {
						rankC = 1;
						for(int j=0;j<count;j++) {
							if(s[i].total<s[j].total) {
								rankC++;
							}
						}
						s[i].rank = rankC;
					}
					System.out.println("등수처리가 완료되었습니다.");
					break;
				}
				
				default:{
					System.out.println("프로그램을 종료합니다.");
					break loop;
				}
				
				
				
				
				
				
			} // switch문
			
		} // while:loop
		

	}

}