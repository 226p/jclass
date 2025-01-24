package j0124;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ja0124_07 {

	public static void main(String[] args) {
		// c:/save/stu.txt 읽어와서 list에 넣기
		ArrayList<Stu> list = new ArrayList<Stu>();
		int no=0,kor=0,eng=0,math=0,total=0,rank=0;
		String name = "";
		double avg = 0;
		
		String[] str = ("1,홍길동,100,100,100,300,100.0,0").split(",");
//		for(int i=0;i<str.length;i++) {
//			System.out.println(str[i]);
//		}
		
		try {
			FileReader fr = new FileReader("c:/save/stu.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();
				if(line == null) break;
//				System.out.println(line);
				
				// 가져온 데이터를 변수에 저장
				String[] str2 = line.split(",");
				no = Integer.parseInt(str2[0]);
				name = str2[1];
				kor = Integer.parseInt(str2[2]);
				eng = Integer.parseInt(str2[3]);
				math = Integer.parseInt(str2[4]);
				total = Integer.parseInt(str2[5]);
				avg = Double.parseDouble(str2[6]);
				total = Integer.parseInt(str2[7]);
				list.add(new Stu(no,name,kor,eng,math,total,avg,rank));
				
				for(int i=0;i<list.size();i++) {
					System.out.printf("[%d,%s,%d,%d,%d,%d,%.2f,%d]\n",
							list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),
							list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),
							list.get(i).getAvg(),list.get(i).getRank());
				}
			}
			br.close();
			fr.close();
		} catch (Exception e) {e.printStackTrace();}

	}

}
