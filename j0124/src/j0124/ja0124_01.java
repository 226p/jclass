package j0124;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ja0124_01 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new Stu("홍길동",100,100,99));  // 1명 입력
		list.add(new Stu("유관순",90,90,99));    // 1명 입력
		
		// Map(★)
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("userId", "aaa");  // map 저장
		map.put("userPw", "1111");
		map.put("userName", "홍길동");
//		map.put("list", list);  // Object(데이터 넣는 것)
		
//		System.out.println(map.containsKey("userId"));  // key값이 존재하는지 확인
		System.out.println(map.containsValue("1111"));  // value값이 존재하는지 확인
		if(map.containsKey("userId")==true) {
			System.out.println(map.get("userId"));  // map key값에 해당하는 데이터 출력
		}
		
		// 전체출력 : Iterator 활용
//		Iterator i = map.entrySet().iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		System.out.println("id : "+map.get("userId")); 
//		System.out.println("id2 : "+map.get("userId2"));  // 없으면 null으로 반환
//		System.out.println("pw : "+map.get("userPw"));
//		
//		ArrayList list2 = (ArrayList)map.get("list");  // map을 ArrayList로 형변환(★★★)
		
//		for(int i=0;i<list2.size();i++) {
//			Stu s = (Stu)list2.get(i);
//			System.out.println(s.getNo()+","+s.getName());
//		}
		
		
		// set
//		HashSet set = new HashSet();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		
//		Iterator i = set.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		i = set.iterator();
//		while(i.hasNext()) {
//			
//		}
		
		// list(★)
//		ArrayList list = new ArrayList();
//		list.add(new Stu("홍길동",100,100,99));  // 1명 입력
//		list.add(new Stu("유관순",90,90,99));    // 1명 입력
//		list.add(new Stu("이순신",80,80,89));    // 1명 입력
//		Stu s1 = new Stu();
//		s1.setName("강감찬");
//		s1.setKor(70);
//		s1.setEng(80);
//		s1.setMath(88);
//		list.add(s1);
//
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.println(s.getNo()+","+s.getName());
//		}
	}

}
