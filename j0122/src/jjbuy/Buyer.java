package jjbuy;

import java.util.ArrayList;

public class Buyer {
	ArrayList list = new ArrayList();
	
	int money = 10000000;
	int point = 0;
	int total = 0;
	
	// 생성자
	Buyer(){}
	Buyer(int money, int point){
		this.money = money;
		this.point = point;
	}
	
	// 구매 메소드 
	void buy(Product p) {
		list.add(p);
		System.out.println();
		total += p.price;
		money -= p.price;
		point += p.point;
	}
	
	// 내 정보보기
	void myInfo() {
		System.out.printf("[ 보유금액 : %,d ]\n",money);
		System.out.printf("[ 보유포인트 : %,d ]\n",point);
	}
	
	// 장바구니
	void cart() {
		System.out.print("구매목록 : ");
		for(int i=0;i<list.size();i++) {
			System.out.printf("%s ",((Product)list.get(i)).name);
		}
		System.out.println();
		System.out.println("구매갯수 : "+list.size());
		System.out.printf("총 구매금액 : %,d",total);
	}
}
