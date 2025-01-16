package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class ja0115_03 {

	public static void main(String[] args) {
		// 1~5 랜덤숫자 생성 후 5번 입력받아 랜덤숫자 몇번 맞췃는지 횟수 출력, 입력했던 숫자 모두 출력
		
		Scanner scan = new Scanner(System.in);
		
		int random_num = (int)(Math.random()*5)+1;  // 랜덤숫자
		int[] num= new int[5];  // 입력한 숫자배열
		int count = 0;    // 정답횟수 변수
		
		System.out.println("1~5까지의 랜덤 숫자를 맞춰보세요!!");
		for(int i=0;i<num.length;i++) {
			System.out.printf("%d번째 도전) ",i+1);
			int input = scan.nextInt();
			num[i] = input;
			
			if(input == random_num) {
				count += 1;
				System.out.println("정답입니다!!");
				break;
			}else {
				System.out.println("오답입니다..");
			}

		}
		System.out.printf("정답 : %d \n",random_num);
		System.out.printf("정답횟수 : %d \n",count);
//		System.out.printf("입력한 숫자 : %d \n",num[0],num[1],num[2],num[3],num[4]);
		System.out.printf("입력한 숫자 : %s \n",Arrays.toString(num));

	}

}
