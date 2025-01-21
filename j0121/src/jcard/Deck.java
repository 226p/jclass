package jcard;

import java.util.Scanner;

public class Deck {
	// 52장 카드 생성 -> 순차적으로 출력
	Deck(){
		for(int i=0;i<4;i++) {  // 메소드 내에서만 선언가능(for문, if문)
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(s[i],j+1);
			}
		}
	}
	
	
	Card[] c = new Card[52];
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] s = {"Spade","Diamond","Heart","Clover"};
	
	void print_all(int no) {
		System.out.println("-----------------------------------");
		System.out.println("[ 카드게임 ]");
		for(int i=0;i<no;i++) {
				System.out.printf("[%s,%s]\n",c[i].shape,n[c[i].number]);
		}
	}
	
	// 해당번호 출력
	void print_all(Card c) {
		System.out.println(c);
	}
	
	// 랜덤섞기 -> 출력
	void shuffle() {
		Card temp = null;
		for(int i=0;i<300;i++) {
			int ran = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[ran];
			c[ran] = temp;
		}
	}
	
	
	// 0~51까지의 숫자를 입력받아, 해당되는 위치 카드 출력
	Card pick(int no) {
		return c[no];
	}
}
