package j0115;

public class ja0115_06 {

	public static void main(String[] args) {
		int[] ball = new int[45]; //45개 배열선언
		
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;  // 1~45 번호저장
		}
		
		for(int i=0;i<ball.length;i++) {
			System.out.print(ball[i]+" "); // 1~45 순차출력
		}
		System.out.println();
		
		int temp = 0;

		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*45);  // 랜덤숫자 0~44
			temp = ball[0];
			ball[0] = ball[ranNum];
			ball[ranNum] = temp;
		}
		
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" "); // 1~45 랜덤출력
		}
		
	}

}
