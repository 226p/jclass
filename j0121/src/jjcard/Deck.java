package jjcard;

class Deck {
	final int CARD_NUM = 52;  // final 값은 변경할 수 없고, 대문자로 다 적어야함.
	Card[] c = new Card[CARD_NUM];
	
	// 번호부여 메소드
	void input() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(i,j+1);
			}
		}
	} // 1. input
	
	
	// 번호출력(전체 52장)
	void print(int cnt) {
		for(int i=0;i<cnt;i++) {
			System.out.println(c[i]);
		}
	} // 2. print
	
	
	// 해당번호 출력
	void print(Card c) {
		System.out.println(c);
	}
	
	
	// 카드섞기
	void shuffle() {
		Card temp = null;
		for(int i=0;i<300;i++) {
			int ran = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[ran];
			c[ran] = temp;
		}
	}
	
	
	// 카드뽑기
	Card pick(int no) {
		return c[no];
	}
	
} // class
