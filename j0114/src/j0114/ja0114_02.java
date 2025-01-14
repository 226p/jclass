package j0114;

import java.util.Scanner;

public class ja0114_02 {

	public static void main(String[] args) {
		// Scanner 선언
		Scanner scan = new Scanner(System.in);  // 입력을 위해서 객체선언을 해야 함.
		
		// 문자열 - next(enter키 전까지 입력받고, enter키는 다음으로 순연함 → 다음 명령에 영향을 줌) / nextLine
		System.out.println("문자열을 입력하세요.");
		String str = scan.next();  // 띄어쓰기하면 그 다음 문자열 출력 못함
		System.out.println("문자열1 : "+str);
		scan.nextLine();   // 때문에 next() 사용 경우, scan.nextLine(); 한번 더 명령해줘야 됨.
		
		System.out.println("문자열을 입력하세요.");
		String str2 = scan.nextLine();  // enter키까지 모든 것 출력
		System.out.println("문자열2 : "+str2);
		//------------
		
		// 숫자형(정수형 - nextInt, nextLong, nextByte, nextShort / 실수형 - nextFloat, nextDouble)
		System.out.println("정수를 입력하세요.");
		int num = scan.nextInt();
		System.out.println("입력한 정수 : "+num);
		
		System.out.println("실수를 입력하세요.");
		double d = scan.nextDouble();
		System.out.println("입력한 실수 : "+d);
		//--------------
		
	}

}
