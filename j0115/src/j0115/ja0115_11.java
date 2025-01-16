package j0115;

public class ja0115_11 {

	public static void main(String[] args) {
		// 1. 1차원배열
		int[] num = new int[10];
		num[0] = 10;
		num[1] = 9;
		
		// 1-2. 직접입력
		int[] n = {1,2,3,4,5};
		
		// 1-3. for문으로 입력
		int[] n2 = new int[10];
		for(int i=0;i<10;i++) {
			n2[i] = i+1;
		}
		
		// 2. 2차원배열
		int[][] score = new int[5][3]; // 5행3열
		score[0][0] = 1;
		score[0][1] = 2;
		score[0][2] = 3;
		score[1][0] = 4;
		score[1][1] = 5;
		
		// 2-2. 직접입력
		int[][] s = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12},
				{13,14,15}
		};
		
		// 2-3. for문으로 입력(for문 2개)
		int[][] s2 = new int[5][3];
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				s2[i][j] = (3*i)+j+1;
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(s2[i][j]);
			}
		}
		
		
	}
}
