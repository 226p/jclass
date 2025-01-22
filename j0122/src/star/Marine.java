package star;

public class Marine extends Unit {

	@Override  // 상속받아 메소드를 재정의하는 것
	void move(int x, int y) {
		System.out.printf("Marine 이동 : %d,%d\n",x,y);
	}

}
