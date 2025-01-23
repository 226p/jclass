package j0123;

import java.io.File;
import java.util.Scanner;

public class ja0123_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일 이름을 입력하세요. >>");
		String name = scan.next();
		File f = createFile(name+".txt");
		System.out.println("파일이 생성되었습니다.");
	}
	
//	static File createFile(String fileName) throws Exception {
//		File f = new File(fileName);
//		f.createNewFile(); // 파일생성 - 외부 하드디스크에 파일을 1개 생성(외부 연결은 try-catch 해줘야함)
//		return f;
//	}
	
	static File createFile(String fileName) {
		File f = new File(fileName);
		try{
			f.createNewFile(); // 파일생성 - 외부 하드디스크에 파일을 1개 생성(외부 연결은 try-catch 해줘야함)
		}
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		return f;
	}
	
	

}
