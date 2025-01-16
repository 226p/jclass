package j0115;

import java.util.Scanner;

public class ja0115_02 {

	public static void main(String[] args) {
		// 5개 숫자 입력받아, 배열에 저장 후 값과 합계 출력
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			System.out.printf("숫자%d을 입력하세요. \n",i+1);
			num[i] = scan.nextInt();
			
			sum += num[i];
		}
		for(int i=0;i<num.length;i++) {
			System.out.printf("%d번째 숫자 : %d \n",i+1,num[i]);
		}
		System.out.printf("최종합계 : %d",sum);
	
	}

}
