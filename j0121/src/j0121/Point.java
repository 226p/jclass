package j0121;

public class Point {
	// 기본생성자
	Point(){this(0,0);}  // this : 다른생성자 / Point(0,0)와 같은 의미
	Point(int x, int y){  // 지역변수 
		this.x = x;  // this : 지역변수의 값을 인스턴스 변수로 넘겨줌
		this.y = y;  
	}
	
	int x;  // 인스턴스 변수 - 객체선언 후 참조변수명.변수명
	int y;
}
