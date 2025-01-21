package jcard;  // package : 폴더

import java.util.Scanner;

public class ja01 {

	public static void main(String[] args) {
		Deck d = new Deck();
	
		d.print_all(5);
		
		d.shuffle();
		
		d.print_all(5);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("[ 카드뽑기 ]");
		System.out.println("카드를 한 장 뽑아주세요.");
		int no = scan.nextInt();
		Card c = d.pick(no);
		d.print_all(c);
		
		
		
	}

}
