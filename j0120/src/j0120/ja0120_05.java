package j0120;

public class ja0120_05 {

	public static void main(String[] args) {
		String[] name = new String[3];
		int[] kor = new int[3];
		
		// 객체 선언
		Cal4 c = new Cal4();
		c.input(name,kor);
		for(int i=0;i<name.length;i++) {
			System.out.printf("%s,%d\n",name[i],kor[i]);
		}
	}

}
