package j0116;

import java.util.Arrays;
import java.util.Scanner;

public class ja0116_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 변수 선언
		int[] ball = new int[45];
		int[] lotto = new int[6];
		int[] input = new int[6];
		int[] answer = new int[6];
		int temp = 0;
		int count = 0;
		
		// 2. 45개 번호 생성
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		// 3. 배열섞기(겹치지 않는 랜덤형 배열)
		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[ranNum];
			ball[ranNum] = temp;
		}
		
		// 4. 6개 로또 생성
		for(int i=0;i<6;i++) {
			lotto[i] = ball[i];
		}
		
		// 5. 번호입력
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째 원하는 번호를 입력하세요. >>",i+1);
			input[i] = scan.nextInt();
		}
		
		// 6. 맞춘번호 확인 - input, lotto
		for(int i=0;i<6;i++) {
			for(int k=0;k<6;k++) {
				if(input[i]==lotto[k]) {
					count++;
					answer[count] = input[i];
					break;
				}
			}
		}
		
		// 7. 출력
		System.out.println("[ 로또번호 확인 ]");
		System.out.println("-------------------------------------");
		System.out.printf("로또번호 : %s\n",Arrays.toString(lotto));
		System.out.printf("입력번호 : %s\n",Arrays.toString(input));
		System.out.printf("맞춘갯수 : %d\n",count);
		System.out.print("맞춘번호 : ");
		for(int i=0;i<count;i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[] num = new int[5];
//		num[0] = 1;
//		num[1] = 2;
//		num[2] = 3;
//		num[3] = 4;
//		num[4] = 5;
//		
//		System.out.println(num);
//		
//		int[] num2 = {1,2,3,4,5};
//		
//		int[] num3 = new int[5];
//		for(int i=0;i<5;i++) {
//			num3[i] = i+1;
//		}

	}

}
