package j0121;

public class ja0121_02 {

	public static void main(String[] args) {
		String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		Card[] c = new Card[52];  // 배열
		String[] shape = {"Spade","Diamond","Heart","Clover"};
		
		// A,1,2,3,4,5,6,7,8,9,10,J,Q,K
		// spade, diamond, heart, clover
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(i,j+1);
			}
		}
		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<13;j++) {
//				System.out.printf("[ %s, %d ] \n",c[i*13+j].shape,c[i*13+j].number);
//			}
//		}
		
		
//		System.out.println(c[12]);
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				System.out.printf("[%s,%s]\n",c[i*13+j].shape,n[c[i*13+j].number]);
			}
		}
	}

}
