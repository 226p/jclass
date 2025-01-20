package j0120;

public class ja0120_06 {

	public static void main(String[] args) {
		int total = 1;
		for(int i=1;i<=5;i++) {
			total = total*i;
		}

		System.out.println(total);
		System.out.println(fac(5));
		
		int k = 0;
		double m = 0;
		float n = 0;
		System.out.println(m);
		System.out.println(k);
		System.out.println(n);
		
		
	}
	
	// 재귀호출
	static long fac(int n) {
		long result = 0;
		if(n==1) {
			result = 1;
		}else {
			result = n*fac(n-1);
		}
		return result;
	}

}
