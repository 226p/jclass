package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class ja0115_05 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 평균(소수점 셋째자리) - 5명 입력
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];  // 모든 변수 초기화
		int[] kor = new int[3];  // 1차원배열
		int[] eng = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
			
		for(int i=0;i<name.length;i++) {
			System.out.printf("%d번째 이름을 입력하세요. >>",i+1);
			name[i] = scan.next();
			System.out.printf("%d번째 국어점수 입력하세요. >>",i+1);
			kor[i] = scan.nextInt();
			System.out.printf("%d번째 영어점수 입력하세요. >>",i+1);
			eng[i] = scan.nextInt();
			
			total[i] = kor[i]+eng[i];
			avg[i] = total[i]/2.0;
			System.out.println("------------------------------------------------------------------------");
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(eng));
		System.out.println(Arrays.toString(total));
		for(int i=0;i<avg.length;i++) {
				System.out.printf("%.3f \t",avg[i]);							
		}
		
		
		
	}
}


