package j0122;

import java.util.Calendar;
import java.util.Date;

public class ja0122_02 {

	public static void main(String[] args) {
		
//		Date d = new Date();
//		System.out.println(d.toString());		게시판 시간 저장은 Date
//		Date d2 = new Date();
//		System.out.println(d2.toString());
//		
//		Calendar c1 = Calendar.getInstance();	공용(시간확인)은 Calendar
//		System.out.println(c1.getTime());
//		Calendar c2 = Calendar.getInstance();	
//		System.out.println(c2.getTime());
		
		
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance();  // 객체선언
		System.out.println("s1 : "+s1.getNum());
		Singleton s2 = Singleton.getInstance();  // s1과 s2의 저장장소가 같음
		System.out.println("s2 : "+s2.getNum());
		Singleton s3 = Singleton.getInstance();
		System.out.println("s3 : "+s3.getNum());
		s1.setNum(100);
		Singleton s4 = Singleton.getInstance();
		System.out.println("s4 : "+s3.getNum());
		
		Car c3 = new Car();
		Car c4 = new Car();
		Car c5 = new Car();
		
		Time t1 = new Time();
		
		// 상속관계가 아닌 객체끼리 형변환 불가능
		
		
		int a = 10;
		long b = 100;
		a = (int)b;  // 형변환
	}

}
