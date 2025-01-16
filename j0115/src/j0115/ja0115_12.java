package j0115;

import java.util.Scanner;

public class ja0115_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] title = {"이름","국어","영어","수학","합계","평균"};

		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		
		// 입력
		for(int i=0;i<score.length;i++) {
			// 이름 입력
			System.out.printf("%d번째 학생의 이름을 적으세요.",i+1);
			name[i] = scan.next();
			
			int total = 0;
			for(int j=0;j<score[i].length-1;j++) {
				System.out.printf("%s점수를 적으세요.",title[j+1]);
				score[i][j] = scan.nextInt();
				total += score[i][j];
				if(j==2) {
					score[i][j+1] = total;
					avg[i] = total/3.0;
					}
				}
				
			}
		
		// 출력
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5]);
		System.out.println("-----------------------------------------------");
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(avg[i]+"\n");
		}
		
		
		
		
		
	}

}
