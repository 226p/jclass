package j0116;

import java.util.Arrays;
import java.util.Scanner;

public class ja0116_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int money = 0;
		int count = 0;
		int x = 0;
		int y = 0;
		// 5,5 배열 생성
		int[] num = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		// 섞기
		int temp = 0;
		for(int i=0;i<300;i++) {
			int ran = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[ran];
			num[ran] = temp;
		}
		// System.out.println(Arrays.toString(num));  // 1차원 배열 
		
		String[][] arr = new String[5][5];
		String[][] arr2 = new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr2[i][j] = num[5*i+j]+"";
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = "★";
			}
		}
		
		// 뽑기 출력
		int no = 0;
		loop:while(no<11) {
			System.out.println("       [ 뽑기게임 ]");
			System.out.println("------------------------");
			System.out.println("좌표 | 0   1   2   3   4   ");
			System.out.println("------------------------");
			for(int i=0;i<arr.length;i++) {
				System.out.printf(" %d  |",i);
				for(int j=0;j<arr.length;j++) {
					System.out.printf(" %s  ",arr[i][j]);
				}
				System.out.println();
				
			}			
			
			while(true) {
				// 좌표입력
				System.out.println("------------------------");
				System.out.printf("현재잔액 : %,d\n",money);
				System.out.print("x좌표(행)를 입력하세요. >>");
				x = scan.nextInt();
				if(x == -1) {
					System.out.println("프로그램을 종료합니다.");
					break loop;
				}
				System.out.print("y좌표(열)를 입력하세요. >>");
				y = scan.nextInt();
				System.out.printf("입력한 좌표 : [%d,%d]\n",x,y);
				
				if((x>=0 && x<=4) && (y>=0 && y<=4)) {
					break;
				}else {
					System.out.println("좌표를 잘못입력했습니다. 다시 입력하세요.");
				}
			}	
			
			
			if(arr2[x][y].equals("1")) {
				arr[x][y] = "당첨";
				money += 100000000;
				count++;
				if(count == 2) {
					money += 200000000;
				}else if(count == 3){
					money += 400000000;
				}else if(count == 6){
					money += 800000000;
				}else if(count == 9){
					money += 1600000000;
				}
			}else {
				arr[x][y] = "꽝!!";
			}
				
			
			no++;
		}
		
		
		
		
		// 번호 확인용 출력
//		System.out.println("       [ 뽑기게임 ]");
//		System.out.println("------------------------");
//		System.out.println("좌표 | 0   1   2   3   4   ");
//		System.out.println("------------------------");
//		for(int i=0;i<arr.length;i++) {
//			System.out.printf(" %d  |",i);
//			for(int j=0;j<arr.length;j++) {
//				System.out.printf(" %s  ",arr2[i][j]);
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
	}

}
