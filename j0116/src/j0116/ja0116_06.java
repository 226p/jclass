package j0116;

import java.util.Scanner;

public class ja0116_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 변수선언(번호, 이름, 국어, 영어, 수학, 합계, 평균)
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[] no = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int count = 0;
		int choice = 0;
		int temp = 0;
		
		// 2. 화면구현
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("<< 1. 성적 입력 >>");
			System.out.println("<< 2. 성적 출력 >>");
			System.out.println("<< 3. 성적 수정 >>");
			System.out.println("<< 0. 프로그램 종료 >>");
			System.out.println("--------------------------------------------");
			System.out.println("원하는 번호를 입력하세요. >>");
			choice = scan.nextInt();
			
			// 3. 번호선택 switch
			switch(choice) {
				case 1:{
					// 4. 학생성적 입력
					System.out.println("[ 학생성적 입력 ]");
					
					int i = count;
					while(i<10) {
						System.out.printf("   < %d번째 >\n",count+1);
						no[i] = count+1;
						System.out.println("이름을 입력하세요.(- 이전페이지 이동)");
						name[i] = scan.next();
						
						if(name[i].equals("-")) {
							break;
						}
						
						int total = 0;
						for(int j=0;j<3;j++) {
							System.out.printf("%s점수를 입력하세요.\n",title[j+2]);
							score[i][j] = scan.nextInt();
							total += score[i][j];
						}
						score[i][3] = total;
						avg[i] = total/3.0;
						
						System.out.printf("%d번째 학생 성적이 저장되었습니다.\n",count+1);
						
						i++;
						count++;
					} // case1.while
					
					break;
				}
					
				case 2:{
					// 5. 학생성적 출력
					System.out.println("                    [ 학생성적 출력 ]");
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("-----------------------------------------------------");
					
					for(int i=0;i<count;i++) {
						System.out.printf("%d\t",no[i]);
						System.out.printf("%s\t",name[i]);
						for(int j=0;j<4;j++) {
							System.out.printf("%d\t",score[i][j]);						
						}
						System.out.printf("%.2f\n",avg[i]);					
					}
					System.out.println();
					break; 
				}
				
				case 3:{
					// 6. 학생성적 수정
					System.out.println("[ 학생성적 수정 ]");
					System.out.println("수정할 학생의 이름을 적으세요. >>");
					String search = scan.next();
										
					if(search.equals("-")) {
						break;
					}
					
					int searchNo = 0;
					for(int i=0;i<name.length;i++) {
						if(search.equals(name[i])) {
							temp = 1;
							searchNo = i;
						}
					}
					
					if(temp == 0) {
						System.out.println("검색결과가 없습니다.");
					}else {
						System.out.printf("%s 님의 데이터를 찾았습니다.",search);
						System.out.println("1. 국어성적");
						System.out.println("2. 영어성적");
						System.out.println("3. 수학성적");
						System.out.println("----------------------------------------------------");
						System.out.println("수정할 과목을 선택하세요. >>");
						choice = scan.nextInt();
					
						switch(choice){
							case 1:{
								System.out.println("[ 국어점수 수정 ]");
								System.out.printf("현재점수 : ",score[searchNo][0]);
								System.out.println("변경점수 : ");
								score[searchNo][0] = scan.nextInt();
								
								break;
							}
							case 2:{
								System.out.println("[ 국어점수 수정 ]");
								System.out.printf("현재점수 : ",score[searchNo][0]);
								System.out.println("변경점수 : ");
								score[searchNo][0] = scan.nextInt();
								break;
							}
							case 3:{
								System.out.println("[ 국어점수 수정 ]");
								System.out.printf("현재점수 : ",score[searchNo][0]);
								System.out.println("변경점수 : ");
								score[searchNo][0] = scan.nextInt();
								
								break;
							}
						}
					}
					
					
					
					break;
				}
				
				default:{
					// 7. 프로그램 종료
					System.out.println("프로그램을 종료합니다.");
					break loop;
				}
				
			}
		} // while:loop
		

		

	}

}
