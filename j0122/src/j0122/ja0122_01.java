package j0122;

public class ja0122_01 {

	public static void main(String[] args) {
		// private - 같은 클래스 / default - 같은 클래스, 같은 패키지
		// protected - 같은 클래스, 같은 패키지, 자손 클래스 / public - 전체
		
		Time t1 = new Time(12,05,10);
		System.out.println(t1.getHour());
		t1.setHour(t1.getHour()+1);
		t1.hour = 50;
		System.out.println(t1.getHour());
		
		Time t2 = new Time(17,35,30);
		System.out.printf("현재시간 : %d:%d:%d",t2.getHour(),t2.getMinute(),t2.getSecond());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Car c = new Car();
//		System.out.println(c.getcolor());
//		Car c2 = new Car("white","auto",5);
//		System.out.println(c2.getcolor());
//		c2.setDoor(-50);
//		System.out.println(c2.getDoor());
		
	}

}
