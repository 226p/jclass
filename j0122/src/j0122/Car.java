package j0122;

public class Car extends Object {
	Car(){};
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	String color;
	String gearType;
	int door;
	
	void drive() {
		System.out.println("자동차가 출발합니다.");
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	String getcolor() { // 제약조건을 걸 수 있음(관리자가 아니면 접근제한되도록)
//		if(user.id == "관리자") {
			return color;			
//		}
	}
	
	void setDoor(int door) {
		if(door>0 && door<10) {
			this.door = door;			
		}
	}
	
	int getDoor() {
		return door;
	}
}
