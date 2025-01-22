package jbuy;

import java.util.ArrayList;

public class Buyer {
	int money = 10000000;
	int bonusPoint = 0;
	int total = 0;
	Product[] cart = new Product[10];  // 배열선언
	
	ArrayList list = new ArrayList();
	// 생성자
	Buyer(){}
	Buyer(int money,int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	// 나의 정보 메소드
	void myInfo() {
		System.out.printf("[ 보유금액 : %,d ]\n",money);
		System.out.printf("[ 보유금액 : %,d ]\n",bonusPoint);
	}
	
	void aaa() {} // 완성 메소드
	
	// void bbb(); 미완성 메소드(추상메소드)
	
	// 구매 메소드
	void buy(Product p){  // 다형성
		list.add(p);
		System.out.println();
		total += p.price;
		money -= p.price;
		bonusPoint += p.bonusPoint;
		aaa(); // 메소드 호출
		// bbb(); 추상메소드 호출
		
	}
	
	void cartInfo() {
		System.out.print("구매목록 : ");
		for(int i=0;i<list.size();i++) {
			System.out.printf("%s ",((Product)list.get(i)).name);		
		}
		System.out.println();
		System.out.println("구매갯수 : "+list.size());
		System.out.printf("총 구매금액 : %,d\n",total);
		System.out.println();
		
		
	}
	
	
	// 원래하던방식
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
}
