package j0121;

import java.util.Scanner;

public class ja0121_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("[ 카드게임 ]");
			System.out.println("1. 게임시작");
			System.out.println("0. 프로그램 종료");
			System.out.println("원하는 번호를 입력하세요.");
			int choice = scan.nextInt();
			
			// 클래스(설계도, 아직 저장공간이 없음) =/= 객체(클래스에 저장공간이 생기면 객체라 함) (둘이 다름!!)
			switch(choice) {
				case 1:{
					Deck d = new Deck();
					d.shuffle();
					System.out.println("[ GAME START ]");
					int ran = (int)(Math.random()*52);
					Card ai = d.pick(ran);
					System.out.println("카드 한 장을 뽑아주세요. >>");
					int no = scan.nextInt();
					Card c = d.pick(no);
					
					System.out.printf("[ AI ]\t");
					System.out.println("[ ME ]");
					d.print_all(ai);
					d.print_all(c);
					System.out.println();
					
					if(c.shape<ai.shape) {
						System.out.println("당신이 승리하였습니다.");
					}else if(c.shape==ai.shape) {
						if(c.number>ai.number) {
							System.out.println("당신이 승리하였습니다.");							
						}else if(c.number==ai.number) {
							System.out.println("무승부입니다.");
						}else {
							System.out.println("패배하였습니다..");
						}
					}else if(c.shape==ai.shape){
						System.out.println("무승부입니다.");
					}else {						
						System.out.println("패배하였습니다..");						
					}
					
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					
					break;
				}
				
				default:{
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			
		}

		

	}

}
