package j0115;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ja0115_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		String[] balls = new String[45];
		int[] input = new int[6];
		
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1+"";
		}
		
		int j = 0;
		while(j<6) {
			System.out.println("         [ 제1582회 LOTTO ]");
			for(int i=0;i<balls.length;i++) {
				if(i%5==0) {
					System.out.println();
				}
				System.out.print(balls[i]+"\t");
			}
			
			System.out.println();
			System.out.println();
			System.out.printf("%d번째 원하는 번호를 입력하세요. >>",j+1);
			input[j] = scan.nextInt();
			
			// 입력한 번호 옆에 - 입력
			balls[input[j]-1] = "-";
			j++;
		}
		
		// 입력번호 출력
		
		
		
		
		
		
		
//		int[] num = {1,19,3,28,5,32,7};
//		Integer[] num2 = {1,19,3,28,5,32,7};
//		//순차정렬
//		System.out.println(Arrays.toString(num));
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
//		// 역순정렬
//		Arrays.sort(num2,Collections.reverseOrder());
//		System.out.println(Arrays.toString(num2));
	}

}
