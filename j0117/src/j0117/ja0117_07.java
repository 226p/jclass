package j0117;

public class ja0117_07 {

	public static void main(String[] args) {
		Stu.count = 10;  // 클래스변수 클래스명.변수명
		System.out.println(Stu.count);
		
		Stu s1 = new Stu();
		s1.id = "aaa";  // 인스턴스변수 - 객체선언 후 참조변수명.변수명
		s1.count = 100;  
		s1.age = 100;  
		System.out.println(s1.id);
		System.out.println("s1.age : "+s1.age);

		Stu s2 = new Stu();
		s2.id = "bbb";
		s2.count = 500;  
		s2.age = 500;  
		System.out.println("s1.age : "+s2.age);
		System.out.println("s1.count : "+s1.count);
		System.out.println("s2.count : "+s2.count);
	}

}
