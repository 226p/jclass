package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ja0124_08 {

	public static void main(String[] args) {
		try {
			
			String folder = "c:/save3";
			File f = new File(folder);
			
			if(!f.exists()) {
				f.mkdirs();  // 폴더생성
			}
			
			File file = new File(folder+"/ccc.txt");
			if(!file.exists()) {
				file.createNewFile();  // 파일생성
				System.out.println("파일이 생성되었습니다.");
			}
			
			FileOutputStream fos = new FileOutputStream("c:/save3/bbb.txt"); // 없는 폴더에 하면 error
			
			String str = "1,hong홍,100,100,100,300,100.0,0";
			str += "1,yu유,90,90,90,270,90.0,0";
			
			byte[] bytes = str.getBytes();  // byte단위로 분리
			for(byte b:bytes) {  // 단순for문
				fos.write(b);
			}
			fos.close();
			// byte단위로 분리해야 함
		} catch (Exception e) {e.printStackTrace();}
		
		System.out.println("프로그램 종료");
		
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/bbb.txt");
//			int read = 0;
//			while((read = fis.read()) != -1) {
//				System.out.println((char)read);
//			}
//		} catch (Exception e) {e.printStackTrace();}

	}

}
