package jbuy;

import java.util.Scanner;

public class jaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로그인 구현 (보유금액, 포인트 확인가능)
		Buyer b = new Buyer();
		
		loop:while(true) {
			System.out.println("\t[ 전자제품 쇼핑몰 ]");
			System.out.println("1. TV");
			System.out.println("2. COMPUTER");
			System.out.println("3. AUDIO");
			System.out.println("9. 장바구니");
			System.out.println("0. 프로그램 종료");
			System.out.println("원하는 상품을 선택해주세요. >>");
			System.out.println("-------------------------------");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:{
				b.buy(new Tv());
				b.myInfo();
				System.out.println();
				break;
			}
			case 2:{
				b.buy(new Computer());
				b.myInfo();
				System.out.println();
				break;
			}
			case 3:{
				b.buy(new Audio());
				b.myInfo();
				System.out.println();
				break;
			}
			case 9:{
				b.cartInfo();
				break;
			}
			
			default:{
				System.out.println("프로그램을 종료합니다.");
				break loop;  // switch가 종료되기 때문에 while loop지정
			}
			
			
			} // switch
		} // while
		
		
	} // main

}
