package j0121;

class Card {
	// card 1장
	Card(){}
	Card(int shape, int number){
		this.shape = shape;
		this.number = number;
	}
	
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] s = {"","Spade","Diamond","Heart","Clover"};
	
	int number;
	int shape;
	
	@Override 
	public String toString() {
		return "["+shape+","+n[number]+"]";
	}
}
