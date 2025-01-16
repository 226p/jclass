package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class ja0115_04 {

	public static void main(String[] args) {
		// 1~100 랜덤숫자 생성 후 10번 입력받아 랜덤숫자 몇번 맞췃는지 횟수 출력, 입력했던 숫자 모두 출력
		int random_num = (int)(Math.random()*100)+1;
		
		Scanner scan = new Scanner(System.in);
		int[] num_list = new int[10];
		int count = 0;
		
		System.out.println("<<1~100까지의 랜덤숫자 맞추기 게임>>");
		for(int i=0;i<10;i++) {
			System.out.printf("%d번째 기회) ",i+1);
			int num = scan.nextInt();
			num_list[i] = num;
			
			if(num == random_num) {
				count += 1;
				System.out.println("정답입니다!!");
				break;
			}else if(num > random_num){
				count += 1;		
				System.out.println("입력한 숫자가 정답보다 큽니다. 더 작은 수를 입력해주세요.");
			}else if(num < random_num){
				count += 1;		
				System.out.println("입력한 숫자가 정답보다 작습니다. 더 큰 수를 입력해주세요.");
			}
			
		}
		
		System.out.println();
		System.out.printf("정답 : %d \n", random_num);
		System.out.printf("도전횟수 : %d \n", count);
		System.out.print("입력한 숫자 : ");
		for(int i=0;i<count;i++) {
			if(i == (count-1)) {
				System.out.print(num_list[i]);				
			}else {
				System.out.print(num_list[i]+",");								
			}
		}
		// System.out.printf("입력한 숫자 : %s \n", Arrays.toString(num_list));

	}

}
