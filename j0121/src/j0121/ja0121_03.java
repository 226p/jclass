package j0121;

public class ja0121_03 {

	public static void main(String[] args) {
		Deck d = new Deck();
		
		// 전체 출력
//		d.print_all(52);
		
		// 랜덤섞기
		d.shuffle();
		
		// 카드뽑기
		Card c = d.pick(10);
		d.print_all(c);
		
		// 랜덤섞고 7장 출력
		d.print_all(7);
		
		
		
		
	}

}
