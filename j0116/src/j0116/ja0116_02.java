package j0116;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ja0116_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자1를 입력하세요.");
		String input1 = scan.next();
		System.out.println("숫자2를 입력하세요.");
		String input2 = scan.next();
		
		int num = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.println("입력한 숫자 : "+(num+num2));
		
//		String input = JOptionPane.showInputDialog("1-100까지 숫자를 입력하세요.");		
//		System.out.println(input);
		
//		int[] num = {1,2,3,4,5};
//		int[] num2 = new int[6];
//		
//		System.arraycopy(num, 0, num2, 0, 5);
//		System.arraycopy(num, 2, num2, 0, 3);
//		
//		System.out.println(Arrays.toString(num2));
		
		
//		num[3] = 0;
//		System.out.println(Arrays.toString(num));
		
		// 배열복사
//		for(int i=0;i<num.length;i++) {
//			num2[i] = num[i];
//		}
//		num = num2;
//		num2[5] = 6;
//		
//		System.out.println(Arrays.toString(num2));
		
		
		// 2차 배열
//		int[][] score = new int[4][6];  // 행, 열
//		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<6;j++) {
//				score[i][j] = (6*i)+j+1;  // (6*1) - 열 / j+1 - 행 
//				System.out.print(score[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		int[][] score = new int[5][5];
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score.length;j++) {
//				score[i][j] = (5*i)+j+1;
//			}
//		}
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score.length;j++) {
//				System.out.print(score[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		
		// 1차 배열
//		int[] num = new int[5];
//		for(int i=0;i<5;i++) {
//			num[i] = i+1;
//			System.out.print(num[i]+" ");
//		}
		
		
		
		
//		int[] num = new int[5];
//		num[0] = 1;
//		num[1] = 2;
//		num[2] = 3;
//		num[3] = 4;
//		num[4] = 5;
//		
//		int[] num2 = {1,2};
//		num2 = num;
//		
//		num[0] = 200;
//		
//		System.out.println(num2);
//		System.out.println(Arrays.toString(num2));
		
		
//		int n = 10;
//		int n2 = 0;
//		
//		n2 = n;
//		n = 100;
//		
//		System.out.println(n2);
//		System.out.println(n);

	}

}
