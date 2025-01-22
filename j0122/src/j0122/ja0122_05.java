package j0122;

import java.util.ArrayList;

public class ja0122_05 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();  // 객체를 저장하는 배열
		Car c = new Car();
		c.color = "red";
		c.door = 4;
		c.gearType = "auto";
		c.getcolor();
		c.getDoor();
		
		list.add(c);  // Object c = c
		list.add(new Car("white","stick",5));  // Object c2 = new Car("white","stick",5);
		System.out.println("개수 : "+list.size());
		
		Car car = (Car)list.get(0);  // Object라서 Car로 강제 형변환
		System.out.println("0번째 데이터 : "+car.color);
		System.out.println("0번째 데이터 : "+((Car)list.get(0)).color);
		System.out.println("0번째 데이터 : "+car.door);
		
		Car car2 = (Car)list.get(1);
		System.out.printf("1번째 데이터 : %s, %d, %s",car2.color,car2.door, car2.gearType);
		
	}

}
