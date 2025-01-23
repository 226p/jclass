package j0123;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ja0123_08 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(2);  // set특징 : 순서X(순서 없어서 Iterator 사용해서 읽어야 함), 중복X
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(1);  // 안 들어감
		
		System.out.println("갯수 : "+set.size());
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());  // 1,2,3,4로 출력(데이터 넣은 순서(2,3,4,1)대로 출력되지 않음)
		}
		
		Iterator i2 = set.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());  // 1,2,3,4로 출력(데이터 넣은 순서(2,3,4,1)대로 출력되지 않음)
		}
		
		
		
//		ArrayList list = new ArrayList();
		
//		for(int i=0;i<10;i++) {
//			list.add(i+1);
//		}
//		
//		// 기본형태
//		Iterator i1 = list.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//		
//		// 편하게 사용하는 형태
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i+1));  // 값 입력
//		}
		
	}

}
