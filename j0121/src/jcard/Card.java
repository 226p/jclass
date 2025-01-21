package jcard;

public class Card {
	String[] s = {"Spade","Diamond","Heart","Clover"};
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	// 생성자
	Card(){}
	Card(String shape, int number){
		this.number = number;  // this : 지역변수 값을 인스턴스 변수로 넘겨줌
		this.shape = shape;
	}
	
	int number;  // 인스턴스 변수
	String shape;
	
	@Override
	public String toString() {
		return String.format("[%s,%s]",shape,n[number]);
	}
	
}
