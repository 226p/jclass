package j0116;

import java.util.Arrays;
import java.util.Scanner;

public class ja0116_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 5,5 배열 생성
		int[] num = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		String[][] lucky = new String[5][5];
		String[][] arr = new String[5][5];
		int temp = 0;
		int count = 0;
		
		// 2. 배열섞기
		for(int i=0;i<300;i++) {
			int ran = (int)(Math.random()*25);			
			temp = num[0];
			num[0] = num[ran];
			num[ran] = temp;
		}
		// System.out.println(Arrays.toString(num));
		
		
		// 3. 2차 배열 생성
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = num[5*i+j]+"";
			}
		}
		
		for(int i=0;i<lucky.length;i++) {
			for(int j=0;j<lucky.length;j++) {
				lucky[i][j] = "★☆★";
			}
		}
		
		
		//4. 뽑기
		int no = 0;
		while(true) {
			System.out.println("               [ 랜덤뽑기 ]");
			System.out.println("----------------------------------------");
			System.out.println("좌표 |  0       1      2       3      4");
			System.out.println("----------------------------------------");
			for(int i=0;i<lucky.length;i++) {
				System.out.printf(" %d  | ",i);
				for(int j=0;j<lucky.length;j++) {
					System.out.printf("%s    ",lucky[i][j]);
				}
				System.out.println();
			}
			System.out.println("");
			
			// 5. 좌표 입력
			System.out.print("x좌표(행)를 입력하세요. >>");
			int x = scan.nextInt();
			System.out.print("y좌표(열)를 입력하세요. >>");
			int y = scan.nextInt();
			System.out.printf("입력한 좌표 : [%d,%d]\n",x,y);
			
			// 6. 당첨확인
			if(arr[x][y].equals("1")) {
				lucky[x][y] = "당첨~";
			}else {
				lucky[x][y] = "꽝!!";
			}
			
			no++;
			
			
		}
		
		
		
		// 뽑기확인
//		int no = 0;
//		while(true) {
//			System.out.println("               [ 랜덤뽑기 ]");
//			System.out.println("----------------------------------------");
//			System.out.println("좌표 |  0       1      2       3      4");
//			System.out.println("----------------------------------------");
//			for(int i=0;i<arr.length;i++) {
//				System.out.printf(" %d  | ",i);
//				for(int j=0;j<arr.length;j++) {
//					System.out.printf("%s    ",arr[i][j]);
//				}
//				System.out.println();
//			}
//			System.out.println("");
//			
//			// 5. 좌표 입력
//			System.out.print("x좌표(행)를 입력하세요. >>");
//			int x = scan.nextInt();
//			System.out.print("y좌표(열)를 입력하세요. >>");
//			int y = scan.nextInt();
//			System.out.printf("입력한 좌표 : [%d,%d]\n",x,y);
//			
//			// 6. 당첨확인
//			if(arr[x][y] == "1") {
//				lucky[x][y] = "당첨";
//			}else {
//				lucky[x][y] = "꽝!!";
//			}
//				
//			no++;
//			
//				
//		}
		
		

	}

}
