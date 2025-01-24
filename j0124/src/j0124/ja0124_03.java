package j0124;

public class ja0124_03 {

	public static void main(String[] args) {
		// 싱글스레드
//		for(int i=0;i<300;i++) {
//			System.out.println("i : "+i);
//		}
//		
//		for(int j=0;j<300;j++) {
//			System.out.println("j : "+j);  // i 300개 후 j 300개 출력됨
//		}
		
		
		// 멀티스레드
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		
		th1.start();
		th2.start();   // i와 j가 섞임(f11할 때(프로그램 구동할)때마다 윈도우 성능에 따라 다르게 출력)
		
		
		
		
		
		
	}

}
