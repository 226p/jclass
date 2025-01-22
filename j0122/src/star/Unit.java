package star;

abstract public class Unit {
	int x, y;
	// 상속받아 완성해야 사용가능
	abstract void move(int x, int y) ;  // 추상메소드(1개라도 있으면 abstract class앞에 붙여야됨)
	void stop() {
		System.out.println("자리에 멈춤!!");
	}
}
