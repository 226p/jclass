package j0115;

public class ja0115_01 {

	public static void main(String[] args) {
		// 1~10까지의 random 숫자 입력하여 합계 출력
		int[] score = new int[10];
		int sum = 0;
		for(int i=0;i<10;i++) {
			score[i] = (int)(Math.random()*10)+1;
			sum += score[i];			
		}
		
		System.out.println(sum);
		
		// score 배열 100개 만들어서 1~100 숫자 입력 출력
//		int[] score = new int[100];
//		int sum = 0;
//		for(int i=0;i<100;i++) {
//			score[i] = i+1;
//			sum += score[i];			
//		}
//		System.out.println(sum);
		
		
		// 배열 데이터 넣는 방법(3가지)
//		int[] score = new int[10];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		score[5] = 6;
//		score[6] = 7;
//		score[7] = 8;
//		score[8] = 9;
//		score[9] = 10;
//		
//		int[] score2 = {1,2,3,4,5,6,7,8,9,10};
//		
//		int[] score3 = new int[10];
//		for(int i=0;i<10;i++) {
//			score3[i] = i+1;
//		}
		//-------------------------------------------------------------------------------
 		
//		int[] num = new int[10];
//		for(int i=0;i<10;i++) {
//			num[i] = i;
//			System.out.println(num[i]);
//		}
		
//		int[] score = new int[5];
//		score[0] = 0;
//		score[1] = 1;
//		score[2] = 2;
//		score[3] = 3;
//		score[4] = 4;
//		
//		System.out.println(score);  // 주소값이 출력됨
//		
//		System.out.println(score[0]);  
//		System.out.println(score[1]);  
//		System.out.println(score[2]);  
//		System.out.println(score[3]);  
//		System.out.println(score[4]);  
		
		
//		String str = new String("abc");
//		String str2 = "abc";
//		System.out.println(str);
//		
//		if(str == str2) {
//			System.out.println("같습니다");
//		}else {
//			System.out.println("다릅니다");
//		}
//		
//		if(str.equals(str2)) {   // equals
//			System.out.println("같습니다");
//		}else {
//			System.out.println("다릅니다");
//		}
	}

}
