package j0121;

public class Circle extends Shape {  // 상속
	// 생성자
	Circle(){
		this(new Point(0,0),100);
	}
	Circle(Point center,int r){
		this.center = center;
		this.r = r;
	}
	// 인스턴스 변수 선언
	Point center; 
	int r;
}
