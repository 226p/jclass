package j0121;

public class Deck {
	// 카드에 사용되는 메소드
	
	// 생성자
	Deck(){
		// 입력
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(i,j+1);
			}
		} // for문
		
		
	} // Deck
	
	Card[] c = new Card[52];
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] s = {"Spade","Diamond","Heart","Clover"};
	
	
	
	// 카드전체 출력 메소드
	void print_all(int no) {
		// 출력
		System.out.println("------------------------------------");
		System.out.printf("[ %d장 출력 ]\n",no);
		for(int i=0;i<no;i++) {
				System.out.printf("[%s,%s]\n",c[i].shape,n[c[i].number]);
		}
	} // print_all()
	
	// 오버로딩
	void print_all(Card c) {
		// 출력
		System.out.printf("[%s,%s]\t",s[c.shape],n[c.number]);
	} // print_all()
	
	
	
	
	// 랜덤섞기
	void shuffle() {
		Card temp = null;
		
		for(int i=0;i<300;i++) {
			int ran = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[ran];
			c[ran] = temp;
		}
	}  // shuffle()
	
	
	// 카드뽑기
	Card pick(int no) {
		if(no>=0 && no<=51) {
			return c[no];			
		}else {
			System.out.println("번호를 다시 확인하세요.");
			return c[0];
		}
	}
	
}
