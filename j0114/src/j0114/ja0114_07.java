package j0114;

import java.util.Scanner;

public class ja0114_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 2;  // 초기값
		while(i<=9) {  // 조건식
			System.out.printf("[%d]단 \n",i);
			
			int j = 1;
			while(j<=9) {
				System.out.printf("%d x %d = %d \t",i,j,i*j);
				j++;
			}
			System.out.println();
			i++;  // 증감식 가장 마지막 돌아야 함.
		}
		
//		// while문 - 조건(크다, 작다 등)이 있는 경우
//		int k = 1;
//		while(k<=5) {
//			System.out.println("안녕"+k);
//			i++;
//		}
//		
//		 //for문 - 반복횟수 있는 경우
//		for(int j=1;j<=5;j++) {
//			System.out.println("안녕"+j);
//		}
		
		// 구구단
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[%d]단 \n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d x %d = %d \t",i,j,i*j);
//			}
//		}
		
		//입력받은 값으로 구구단 표시
//		System.out.println("숫자1를 입력하세요.");
//		int num1 = scan.nextInt();		
//		System.out.println("숫자2를 입력하세요.");
//		int num2 = scan.nextInt();	
//		
//		int max, min;
//		
//		if(num1>num2) {
//			max = num1;
//			min = num2;
//		}else {
//			max = num2;
//			min = num1;
//		}
//		for(int i=min;i<=max;i++) {
//			System.out.printf("[%d]단 \n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d x %d = %d \n",i,j,i*j);
//			}
//		}---------------------------------------------------------------------------------
		
//		for(int i=0;;i++) {
//			// 조건식 없는 for문 -> 무한반복
//			System.out.println("안녕"+i);
//			if(i==54460) {
//				break;
//			}
//		}
		
		// 입력받은 글자를 1개씩 출력하는 프로그램 구현(영문자의 경우, 하나씩 출력하는 시스템)------------------
//		System.out.println("글자를 입력하세요.(영문자만 입력가능)");
//		String word = scan.next();
//		
//		int temp = 0;
//		for(int i=0;i<word.length();i++) {
//			// 1. 영문자인지 먼저 확인
//			if (!(word.charAt(i)>='a' && word.charAt(i)<='z')||(word.charAt(i)>='A' && word.charAt(i)<='Z')) { 
//				temp = 1;
//				break;
//			}
//		}
//		
//		// 영문자이면 출력, 그렇지 않으면 다시 입력출력
//		if (temp == 0) {
//			for(int i=0;i<word.length();i++) {
//				System.out.println(word.charAt(i));		
//			}
//		}else {
//			System.out.println("입력한 글자 중 영문자가 아닌 것이 있습니다. 다시 입력하세요.");
//		}
		//-----------------------------------------------------------------------------------
		
		// 단어를 1개씩 출력
//		String input = "abcdefghijk";
//		System.out.println(input.length());  // length() 문자열의 길이
//		System.out.println(input.charAt(input.length()-1));  // length() 문자열의 길이
//		
//		for(int i=0;i<input.length();i++) {
//			System.out.println(input.charAt(i));
//		}
		
//		System.out.println("글자를 입력하세요.(영문자만 입력가능)");
//		String str = scan.next();
//		char ch = str.charAt(0);
//		if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
//			System.out.println("출력 : "+ch);
//		}else {
//			System.out.println("영문자가 아닙니다. 다시 입력하세요!!");
//		}
		
		
		
		// 반복문
//		int sum = 0;
//		for(int i=1;i<=100;i++) {
//			System.out.println(i);
//			sum += i;  // 한줄 for문의 경우 {} 생략가능
//		}
//		System.out.println(sum);
	}

}
