package j0120;

import java.util.Scanner;

public class Cal3 {
	Scanner scan = new Scanner(System.in);
	void result(int num1,int num2,int[] re) {
//		System.out.println("숫자1를 입력하세요. >>");
//		num1 = scan.nextInt();
//		System.out.println("숫자2를 입력하세요. >>");
//		num2 = scan.nextInt();
		
		re[0] = num1+num2;
		re[1] = num1-num2;
		re[2] = num1*num2;
		// double result4 = num1/num2;
	}
}
