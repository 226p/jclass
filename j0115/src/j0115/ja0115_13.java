package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class ja0115_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로또맞추기
		
		//1. 변수선언
		int[] ball = new int[45];
		int[] lotto = new int[6];
		int[] input = new int[6];
		int temp = 0;
		int count = 0;
		String money = "";
		
		//2. 1-45 번호저장
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		//3. 배열섞기
		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[ranNum];
			ball[ranNum] = temp;
		}
		
		//4. 6개 로또번호
		for(int i=0;i<6;i++) {
			lotto[i] = ball[i];
			
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		Arrays.sort(lotto);
		
		//5. 입력창만들기
		String[] balls = new String[45];  // 번호 45개
		
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1+"";
		}
		
		int j = 0;
		while(j<6) {
			System.out.print("         [ 제1582회 LOTTO ]");
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
		
		// 6. 맞춘번호 확인 - input,lotto
		for(int i=0;i<6;i++) {
			for(int k=0;k<6;k++) {
				if(input[i]==lotto[k]) {
					count += 1;
					break;
				}
			}
		}
		
		// 7. 출력
		System.out.println();
		System.out.println("[ 나의 당첨현황 ]");
		System.out.print("로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		System.out.print("나의로또 : ");
		for(int i=0;i<6;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		
		if(count==3) {
			money = "5,000원";
		}else if(count==4) {
			money = "50,000원";
		}else if(count==5){
			money = "2등) 54,226,666원";
		}else if(count==6) {
			money = "축!! 1등) 1,952,160,000원";
		}else {
			money = "낙첨";
		}
		System.out.printf("당첨금액 : %s",money);
	}

}
