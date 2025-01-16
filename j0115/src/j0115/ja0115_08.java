package j0115;

public class ja0115_08 {

	public static void main(String[] args) {
		// for문 활용 / 1~10까지 랜덤숫자 저장하는데, 동일한 번호가 없게 저장
		int[] num = new int[10];  // 10개 배열 선언
		
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;  // 1~10 삽입
		}
		
		int temp = 0;
		
		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*10);  // 배열의 주소값
			temp = num[0];
			num[0] = num[ranNum];
			num[ranNum] = temp;
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+ " ");
		}
		System.out.println();
		System.out.println("--------------------");
		
		// while문 활용 / 1~10까지 랜덤숫자 저장하는데, 동일한 번호가 없게 저장
		int[] num2 = new int[10];  // 10개 배열 선언
		
		int i = 0;
		loop:while(i<num2.length) {
			int ranNum = (int)(Math.random()*10)+1;
			
			// 동일한 숫자가 배열에 있으면, 다음 진행
			for(int j=0;j<i;j++) {
				if(num2[j] == ranNum) {
					continue loop;
				}
			}
			num2[i] += ranNum;
			i++;
		}
		
		for(int j=0;j<num2.length;j++) {
			System.out.print(num2[j]+" ");			
		}
		
		
	}

}
