package jjcard;

import java.util.Scanner;
import java.util.*; // 이거 써도됨

public class jjmain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck();  // 52장 카드생성
		Card[] my_card = new Card[5];
		int choice = 0;
		while(true) {
			System.out.println("\t  [ 카드게임 ]");
			System.out.println("------------------------------");
			System.out.println("1. 카드생성");
			System.out.println("2. 카드출력");
			System.out.println("3. 카드섞기");
			System.out.println("4. 카드분배");
			System.out.println("5. 내 패 보기");
			System.out.println("6. 카드뽑기");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------------------");
			System.out.println("원하는 번호를 입력하세요. >>");
			choice = scan.nextInt();
			
			switch(choice) {
				case 1:{
					d.input();   // 번호부여
					break;
				}
				case 2:{
					System.out.println("\t[ 전체카드 출력 ]");
					d.print(52); // 전체 카드출력
					System.out.println("------------------------------");
					break;
				}
				case 3:{
					d.shuffle();
					System.out.println("카드섞기 완료");
					break;
				}
				case 4:{
					for(int i=0;i<5;i++) {
						my_card[i] = d.pick(i);
					}
					System.out.println("카드분배 완료");
					break;
				}
				case 5:{
					for(int i=0;i<5;i++) {
						System.out.printf("%s\t",my_card[i]);
					}
					System.out.println();
					break;
				}
				case 6:{
					System.out.println("몇번째 카드를 출력하겠습니까?");
					int no = scan.nextInt();
					Card c_pick = d.pick(no);
					d.print(c_pick);
					break;
				}
				default:{
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			
		}// while문
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
