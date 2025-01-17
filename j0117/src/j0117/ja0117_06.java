package j0117;

public class ja0117_06 {
	
	static int c = 0;  // 클래스변수 - 프로그램이 실행되면 사용가능
	int num = 10; // 인스턴스 변수 - 객체선언을 해야 사용가능

	public static void main(String[] args) {
//		int a = 5;  // 지역변수 - 객체선언을 해야 사용가능(main안에 있으면 자동으로 사용가능)
		
		Stu.count = 1;
		System.out.println(Stu.count);
		
		
		
//
//		int sum = 0;
//		int sum2 = 0;
//		int k = 0;
//		int j = 0;
//		
//		for(int i=1;i<101;i++) {
//			sum += i;
//			if(sum > 200) {
//				k = i;
//				j = i-1;
//				sum2 = sum-j;
//				break;
//			}
//		}
//		System.out.println("합 200이 초과하기 전 : "+j);
//		System.out.println("합 200이 초과하는 시점 : "+k);
//		System.out.println("200초과 합계 : "+sum);
//		System.out.println("200초과 직전 합계 : "+sum2);
	}

}
