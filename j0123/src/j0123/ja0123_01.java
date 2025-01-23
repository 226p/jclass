package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class ja0123_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		Stu_Deck sd = new Stu_Deck();
		
		int choice=0;
		
		// 무한반복
		loop:while(true) {
			choice = sd.main_print();
			
			// 3. 번호선택 switch
			switch(choice) {
				case 1:{
					sd.input();
					break;
				}
					
				case 2:{
					sd.output();
					break; 
				}
				
				case 3:{
					sd.update();
					break;
				}
				
				case 4:{
					sd.ranking();
					break;
				}
				
				default:{
					System.out.println("프로그램을 종료합니다.");
					break loop;
				}
				
			}
		} // while:loop

	}

}
