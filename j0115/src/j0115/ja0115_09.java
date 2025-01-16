package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class ja0115_09 {

	public static void main(String[] args) {
		// 1-45까지 로또번호 6개와
		// 입력한 숫자 6개를 비교해서 맞춘 개수와 번호를 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int[] ball = new int[45];  // 번호 45개
		int[] lotto = new int[6];  // 로또번호 6개
		int[] input = new int[6];  // 입력번호 6개
		int[] answer = new int[6]; // 맞춘번호 6개
		int count = 0 ; // 맞춘개수
		
		
		//1-45 번호저장
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		//배열섞기
		int temp = 0;
		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*45); //0-44
			temp = ball[0];
			ball[0] = ball[ranNum];
			ball[ranNum] = temp;
		}
		
		//6개 로또번호
		for(int i=0;i<6;i++) {
			lotto[i] = ball[i];
		}
		System.out.println("로또번호 : "+Arrays.toString(lotto));
		// 6개 입력번호
		String[] balls = new String[45];  // 번호 45개
		//1-45 번호저장
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1+"";
		}
		
		int k=0;
		while(k<6) {
			System.out.print("           [ 로또맞추기 ]");
			for(int j=0;j<balls.length;j++) {
				if(j%5==0) {
					System.out.println();
				}
				System.out.print(balls[j]+"\t");
			}
			
			System.out.println();
			System.out.printf("원하는 번호를 입력하세요.( 입력: %d번째 ) : \n",k+1);
			input[k] = scan.nextInt();
			// 입력한 번호 5 -> 5번자리 X를 입력
     		balls[input[k]-1] = "X";
			k++;
		}
		
		// 맞춘번호 확인 - input,lotto
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto.length;j++) {
				if(input[i]==lotto[j]) {
					answer[count] = lotto[j];
					count++;
					break;
				}
			}
		}
		
		// 출력
		System.out.println("[ 로또번호 확인 ]");
		System.out.print("로또번호 : ");
		System.out.println(Arrays.toString(lotto));
		System.out.print("입력번호 : ");
		System.out.println(Arrays.toString(input));
		System.out.print("맞춘개수 : ");
		System.out.println(count);
		System.out.print("맞춘번호 : ");
		for(int i=0;i<count;i++) {
			System.out.print(answer[i]+" ");
		}
		
		// [ 로또 확인 ]
		// 로또번호 : 1 4 10 26 45 34
		// 입력번호 : 5 7 10 9 34 44
		// 맞춘개수 : 2
		// 맞춘번호 : 10 34
		
		
		// 로또번호 6개와 입력한 숫자 비교해서 맞춘 개수와 번호 출력
		
//		int[] ball = new int[45];  // 랜덤 숫자 배열
//		int[] lotto = new int[6];  // 로또번호 6
//		
//		for(int i=0;i<ball.length;i++) {
//			ball[i] = i+1;
//		}
//		
//		int temp = 0;
//
//		// 배열섞기
//		for(int i=0;i<300;i++) {
//			int ranNum = (int)(Math.random()*45);
//			temp = ball[0];
//			ball[0] = ball[ranNum];
//			ball[ranNum] = temp;
//		}
//		
//		for(int i=0;i<lotto.length;i++) {
//			lotto[i] = ball[i];
//		}
//		//----------------------------------------------------------------로또번호 생성 끝
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int[] num_list = new int[6];  // 로또배열
//		int count = 0;
//		int[] answer = new int[6];
//		
//		// 6개 입력번호
//		// System.out.println(Arrays.toString(lotto));
//		System.out.println("2025년 1월15일 오늘의 로또!!!");
//		for(int i=0;i<6;i++) {
//			System.out.print("1~45까지의 숫자를 입력해주세요) ");
//			int num = scan.nextInt();		
//			
//			num_list[i]=num;
//		}
//		
//		// 맞춘번호 확인
//		for(int i=0;i<lotto.length;i++) {
//			for(int j=0;j<lotto.length;j++) {
//				if(num_list[i] == lotto[j]) {
//					answer[count] = lotto[j];
//					count += 1;
//					break;
//				}
//			}
//		}
//		
//		// 맞춘 결과 출력
//		System.out.print("로또번호 : ");
//		for(int i=0;i<6;i++) {
//			System.out.print(lotto[i]+" ");
//		}
//		System.out.println();
//		System.out.print("내 로또 : ");
//		for(int i=0;i<6;i++) {
//			System.out.print(num_list[i]+" ");
//		}
//		System.out.println();
//		System.out.println("맞춘갯수 : "+count);
//		System.out.print("맞춘번호 : ");
//		for(int i=0;i<count;i++) {
//			System.out.print(answer[i]+" ");
//		}
		
		
		
	}
}
