package j0124;

import java.util.ArrayList;
import java.util.Comparator;

public class ja0124_02 {

	public static void main(String[] args) {
		ArrayList<Stu> list = new ArrayList();  // <E> E에다가 넣을 클래스를 한정해서 다른 타입을 넣을 때 에러발생, 실수를 방지함(형변환도 안해도됨)
		list.add(new Stu("홍길동",100,100,100)); 
//		list.add(new Card());
//		
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i); // <Stu> 형변환 생략해도 됨
//			System.out.printf("[%d,%s,%d]\n",list.get(i).getNo(),list.get(i).getName(),list.get(i).getTotal());
//		}
//		
//		System.out.println("프로그램 종료");
		
		
//		ArrayList list = new ArrayList();
//		list.add(new Stu("홍길동",100,100,100)); 
//		list.add(new Stu("유관순",90,90,90));   
//		list.add(new Stu("이순신",95,95,95));    
//		list.add(new Stu("강감찬",93,93,93));    
//		list.add(new Stu("김구",80,80,80));    
//		list.add(new Stu("홍길자",70,70,70));    
//		list.add(new Stu("홍길순",75,75,75));    
//		
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d]\n",s.getNo(),s.getName(),s.getTotal());
//		}
		
		// 숫자정렬
//		list.sort(new Comparator<Stu>() {
//			@Override
//			public int compare(Stu s1, Stu s2) {  
//				return s2.getTotal()-s1.getTotal();   // 역순비교  (DB는 나중에 orderby 하면되서 잘 안씀)
//				return s1.getTotal()-s2.getTotal();   // 순차비교
//			}
//		});
		
		// 문자열정렬
		list.sort(new Comparator<Stu>() {
			
			@Override  // @ : 애너테이션 - 주석, 스프링 명령어...
			public int compare(Stu s1, Stu s2) {
				return s1.getName().compareTo(s2.getName());  // 순차정렬
//				return s1.getName().compareTo(s2.getName());  // 역순정렬
			}
			
		});
		
//		System.out.println("-------종합점수 순차정렬-------");
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d]\n",s.getNo(),s.getName(),s.getTotal());
//		}

	}

}
