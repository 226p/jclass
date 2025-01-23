package j0123;

import java.util.ArrayList;
import java.util.List;

public class ja0123_07 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		for(int i=0;i<10;i++) {
			list.add(i+1);
		}
		list.add(4,100);  // 특정 구간에 데이터 삽입 가능
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.remove(2);
		System.out.println("--------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(int i=0;i<list.size();i++) {
			list.remove(i);
		}
		System.out.println("--------전체삭제시도----------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));  // 2,100,6,8,10 남아있음 → ArrayList 저장된 첫번째 순서부터 차례대로 삭제하면 앞으로 한칸씩 당겨지기 때문에 데이터가 남아있음(다 삭제하려면 거꾸로 삭제해야됨)
		}
		System.out.println("--------다시 전체삭제시도----------");
		for(int i=list.size()-1;i<=0;i--) {
			System.out.println(list.get(i));  
		}
		
		
//		List list2 = new ArrayList();
		
//		Integer i1 = new Integer(1);
//		Integer i2 = new Integer(2);
//		Integer i3 = new Integer(3);
//		Integer i4 = new Integer(4);
		
//		list.add(1);  // 1 → 기본타입, list → 객체타입
//		list.add(2);  // 값 입력
//		list.add(3);
//		list.add(4);
//		
//		for(int i=0;i<list.size();i++) {  
//			System.out.println(list.get(i));  // 데이터 출력
//		}
//		
//		list.remove(3); // index번호 삭제
//		System.out.println("------------------------------");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		list.clear();  // 전체삭제
//		System.out.println("------------------------------");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		if(list.isEmpty()) {  // 값의 유무
//			System.out.println("파일이 없습니다.");
//		}
		
	}

}
