package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ja0124_05 {

	public static void main(String[] args) {
		// fileWriter 문서 작성하기
		try {
			FileWriter fw = new FileWriter("c:/save2/abc.txt");
			BufferedWriter bw = new BufferedWriter(fw);  // 대용량 Buffer
			
			for(int i=0;i<10;i++) {
				String str = "안녕하세요. "+i+"\r\n";  // \r : 문장 가장 끝에 , \n : enter키 
				bw.write(str);
			}
			bw.close();
		} catch (Exception e) {e.printStackTrace();}
		
		
		// filereader 문서 읽어오기
//		try {
//			FileReader fr = new FileReader("c:/save/aaa.txt");
//			BufferedReader br = new BufferedReader(fr); // 1줄 씩 가져오기
//			
//			while(true) {
//				String line = br.readLine();
//				if(line == null) break;
//				System.out.println(line);
//			}
//			
//		} catch(Exception e){
//			e.printStackTrace();
//		}
//		
		System.out.println("프로그램 종료");
	}

}
