package j0120;

import java.util.Arrays;
import java.util.Scanner;

public class Cal4 {
	Scanner scan = new Scanner(System.in);
	void input(String[] name, int[] kor) {
		// 이름, 국어점수
		for(int i=0;i<name.length;i++) {
			System.out.printf("이름%d을 입력하세요\n",i+1);
			name[i] = scan.next();
			System.out.printf("국어점수%d를 입력하세요\n",i+1);
			kor[i] = scan.nextInt();
		}
	}
}
