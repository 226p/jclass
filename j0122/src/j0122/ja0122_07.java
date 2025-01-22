package j0122;

import java.util.ArrayList;

public class ja0122_07 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		Time t = new Time(1,1,1);
		// 20개 생성해서 20개 출력
		
		for(int i=0;i<20;i++) {
//			int h = (int)(Math.random()*24)+1;
//			int m = (int)(Math.random()*60)+1;
//			int s = (int)(Math.random()*60)+1;
//			list.add(new Time(h,m,s));
			
			list.add(new Time(i+1,i+1,i+1));
		}
		
		// 삭제
		list.remove(1);
		list.remove(7);
		list.remove(15);
		
		for(int i=0;i<list.size();i++) {
			Time t = (Time)list.get(i);
			System.out.printf("%d. [ %02d:%02d:%02d ]\n",i+1,t.hour,t.getMinute(),t.getSecond());
		}
		
	}

}
