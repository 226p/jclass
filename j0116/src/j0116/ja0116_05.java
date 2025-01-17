package j0116;

import java.util.Scanner;

public class ja0116_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생성적프로그램
		// 변수선언(번호,이름,국어,영어,수학,합계,평균)
		int count = 0;
		int[] no = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int choice = 0;  // 번호선택
		int temp = 0;    // 검색확인
		int rankC = 0;   // 등수
		int[] rank = new int[10];
		
//		// 무한반복
		loop:while(true) {
			// 화면구현
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("----------------------------------------------------");
			System.out.println("원하는 번호를 입력하세요. >>");
			choice = scan.nextInt();
			
			switch(choice) {
				case 1:{
					System.out.println("[ 학생성적 입력 ]");
					
					int i = count;
					while(i<10) {
						System.out.printf(" << %d번째 >>\n",count+1);
						no[i] = count+1;  // 번호
						System.out.println("이름을 입력하세요.(- 이전페이지 이동)");
						name[i] = scan.next();  // 이름
						
						if(name[i].equals("-")){
							break;
							}
						
						int total = 0;
						for(int j=0;j<3;j++) {
							System.out.printf("%s점수를 입력하세요.\n",title[j+2]);
							score[i][j] = scan.nextInt();  // 국어, 영어, 수학
							total += score[i][j];
						}
						
						score[i][3] = total;  // 합계
						avg[i] = total/3.0;  // 평균
						
						
						System.out.printf("%d번 학생이 저장되었습니다. \n",count+1);
						
						i++;
						count++;
						
					} // while
					
					break;
				}
				case 2:{
					System.out.println("[ 학생성적 출력 ]");
					for(int j=0;j<title.length;j++) {
						System.out.printf("%s\t",title[j]);
						}
					System.out.println();
					System.out.println("-----------------------------------------------------------");
					for(int j=0;j<count;j++) {
						System.out.printf("%d\t",no[j]);
						System.out.printf("%s\t",name[j]);
						for(int k=0;k<4;k++) {
							System.out.printf("%d\t",score[j][k]);
						}  
						System.out.printf("%.2f\t",avg[j]);
						System.out.printf("%d\n",rank[j]);
					}
					System.out.println();
					
					break;  
					
				}
				case 3:{
					System.out.println("[ 학생성적 수정 ]");
					// 수정할 학생의 이름 입력
					System.out.println("수정할 학생이름을 입력하세요. >>");
					String search = scan.next();
					
					if(search.equals("-")){
						break;
						}
					
					int searchNo = 0;
					for(int j=0;j<name.length;j++) {
						if(search.equals(name[j])) {
							temp = 1;  // 검색결과 있음
							searchNo = j;  // 위치값
						}
					}
					
					if(temp == 0) {
						System.out.println("검색결과가 없습니다."); 
					}else {
						System.out.printf("[ %s 님 성적 수정 ]\n",search);
						System.out.println(" 1. 국어점수 수정");
						System.out.println(" 2. 영어점수 수정");
						System.out.println(" 3. 수학점수 수정");
						System.out.println("----------------------------------------------------");
						System.out.println("원하는 번호를 입력하세요. >>");
						choice = scan.nextInt();
						switch(choice) {
							case 1:{
								System.out.println("[ 국어점수 수정 ]");
								System.out.printf("현재점수 : %d\n",score[searchNo][0]);
								System.out.print("변경점수 : ");
								score[searchNo][0] = scan.nextInt();
								
								break;
							}
							case 2:{
								System.out.println("[ 영어점수 수정 ]");
								System.out.printf("현재점수 : %d\n",score[searchNo][1]);
								System.out.print("변경점수 : ");
								score[searchNo][1] = scan.nextInt();
								
								break;
							}
							case 3:{
								System.out.println("[ 수학점수 수정 ]");
								System.out.printf("현재점수 : %d\n",score[searchNo][2]);
								System.out.print("변경점수 : ");
								score[searchNo][2] = scan.nextInt();
								
								break;
							}							
						} // switch
						score[searchNo][3] = score[searchNo][0]+score[searchNo][1]+score[searchNo][2];
						avg[searchNo] = score[searchNo][3]/3.0;
						
					} // if~else
					
					break;
				}
				case 4:{
					System.out.println("[ 등수처리 ]");
					for(int i=0;i<count;i++) {
						rankC = 1;  // 리셋(등수처리할 때마다, 축적되지 않게)
						for(int j=0;j<count;j++) {
							if(score[i][3]<score[j][3]) {
								rankC++;
							}
						}
						rank[i] = rankC;
					}
					System.out.println("등수처리가 완료되었습니다.");
					
					break;
				}
				
				default:{
					System.out.println("프로그램을 종료합니다.");
					break loop;
				}
			}
			
			  
		} // loop:while
		
		
		
		
		
		
		// System.out.printf("%d,%s,%d,%d,%d,%d,%.2f\n ",no[i],name[i],score[0][0],score[0][1],score[0][2],score[0][3],avg[i]);
		
		
		// 화면구현
//		System.out.println("[ 학생성적프로그램 ]");
//		System.out.println("1. 성적 입력");
//		System.out.println("2. 성적 출력");
//		System.out.println("0. 프로그램 종료");
//		System.out.println("----------------------------------------------------");
//		System.out.println("원하는 번호를 입력하세요. >>");
//		choice = scan.nextInt();
//		
//		switch(choice) {
//			case 1:{
//				System.out.println("[ 학생성적 입력 ]");
//				
//				int i = 0;
//				while(i<3) {
//					System.out.printf(" << %d번째 >>\n",count+1);
//					no[i] = count+1;  // 번호
//					System.out.println("이름을 입력하세요.");
//					name[i] = scan.next();  // 이름
//					int total = 0;
//					for(int j=0;j<3;j++) {
//						System.out.printf("%s점수를 입력하세요.\n",title[j+2]);
//						score[i][j] = scan.nextInt();  // 국어, 영어, 수학
//						total += score[i][j];
//					}
//					
//					score[i][3] = total;  // 합계
//					avg[i] = total/3.0;  // 평균
//					
//					
//					i++;
//					count++;
//					
//					
//				} // while
//				
//				break;
//			}
//			case 2:{
//				System.out.println("[ 학생성적 출력 ]");
//				
//				// 출력
//				System.out.printf("%d번 학생이 저장되었습니다. \n",count+1);
//				System.out.println("[ 학생성적 ]");
//				for(int j=0;j<title.length;j++) {
//					System.out.printf("%s\t",title[j]);
//					}
//				System.out.println();
//				System.out.println("----------------------------------------------------");
//				for(int j=0;j<3;j++) {
//					System.out.printf("%d\t",no[j]);
//					System.out.printf("%s\t",name[j]);
//					for(int k=0;k<4;k++) {
//						System.out.printf("%d\t",score[j][k]);
//					}
//					System.out.printf("%.2f\n",avg[j]);
//				}
//				System.out.println();
//				
//				break;
//			}
//			case 0:{
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//		}

		
		//------------------------------------------------------------------------------------------------
//		int i = 0;
//		while(i<3) {
//			System.out.printf(" << %d번째 >>\n",count+1);
//			no[i] = count+1;  // 번호
//			System.out.println("이름을 입력하세요.");
//			name[i] = scan.next();  // 이름
//			int total = 0;
//			for(int j=0;j<3;j++) {
//				System.out.printf("%s점수를 입력하세요.\n",title[j+2]);
//				score[i][j] = scan.nextInt();  // 국어, 영어, 수학
//				total += score[i][j];
//			}
//			
//			score[i][3] = total;  // 합계
//			avg[i] = total/3.0;  // 평균
//			
//			
//			i++;
//			count++;
//
//		} // while
//		
//		// 출력
//		System.out.printf("%d번 학생이 저장되었습니다. \n",count+1);
//		System.out.println("[ 학생성적 ]");
//		for(int j=0;j<title.length;j++) {
//			System.out.printf("%s\t",title[j]);
//		}
//		System.out.println();
//		System.out.println("----------------------------------------------------");
//		for(int j=0;j<3;j++) {
//			System.out.printf("%d\t",no[j]);
//			System.out.printf("%s\t",name[j]);
//			for(int k=0;k<4;k++) {
//				System.out.printf("%d\t",score[j][k]);
//			}
//			System.out.printf("%.2f\n",avg[j]);
//		}
//		System.out.println();
		
	}

}
