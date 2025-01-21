package j0121;

public class ja0121_01 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		// 원넓이 = 반지름*반지름*3.14
		double di = c1.r*c1.r*3.14;
		
		c1.draw();
		System.out.println("넓이 : "+di);
		
		// Circle(Point center,int r)
		Circle c2 = new Circle(new Point(150,150),50);
		double di2 = c2.r*c2.r*3.14;
		
		c2.draw();
		System.out.println("넓이 : "+di2);
		
		// Triangle : 3개의 꼭지점을 알아야 넓이를 구할 수 있음
		Point[] p = new Point[3];
		p[0] = new Point(100,100);
		p[1] = new Point(140,50);
		p[2] = new Point(200,100);
		
//		Point[] p = {};
//		int[] arr = {1,2,3};
		Triangle t1 = new Triangle(p);  // ctrl 누르고 클릭하면 해당 클래스로 넘어감 
		t1.draw();
		
		// 객체선언 - 포함
//		Point p = new Point();
//		p.x = 10;
//		p.y = 5;
//		System.out.println(p.x);
//		System.out.println(p.y);
	}

}
