package j0124;

public class MyThread1 extends Thread {  // 1. Thread를 상속받음
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.println("i : "+i);
		}
	}
}
