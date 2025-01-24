package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ja0124_04 {

	public static void main(String[] args) throws Exception {
		
		//---------------------------글을 파일에 저장-------------------------------
		File f = new File("c:/save2");
		if(!f.exists()) {  // exists : 존재하는지
			f.mkdirs();  //  c:/save2/aaa  
//			f.mkdir();    // c:/save2/aaa/ 폴더 하나만 만드는 데 save2 없으면 에러   
		} 
		
		// 파일 복사할 때, inputstream 많이 씀 
//		FileInputStream fis = new FileInputStream("c:/save/rose.jpg");
//		FileOutputStream fos = new FileOutputStream("c:/save2/rose2.jpg");
//		while(true) {
//			int read = fis.read();
//			if(read==-1) break;
//			fos.write(read);
//		}
//		fis.close();   // 꼭 닫아줘야 함.
//		fos.close();
		
		System.out.println("이미지 복사 프로그램 종료");
		
		
		//----------------------파일에 있는 글자를 읽어서 출력-------------------------
//		byte[] b = new byte[1024];
//		FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//		fis.read(b);
//		System.out.println(new String(b));
		
		
		// 글을 가져와서 출력하는 기본형태
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			int read = 0;
//			while((read=fis.read())!=-1) {  // if 읽을 데이터가 있다면,
//				System.out.println((char)read);  // 2byte 글자 하나씩 읽어옴
//			}
//		} catch(Exception e){
//			e.printStackTrace();
//		}
		
	}

}
