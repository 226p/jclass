package j0117;

public class ja01117_05 {

	public static void main(String[] args) {
		// 객체선언(배열방법)
		Stu[] stu1 = new Stu[3];
		
		stu1[0] = new Stu();
		stu1[0].id = "aaa";
		stu1[0].pw = "1111";
		stu1[0].name = "홍길동";
		stu1[0].age = 20;
		
		stu1[1] = new Stu();
		stu1[1].id = "bbb";
		stu1[1].pw = "2222";
		stu1[1].name = "유관순";
		stu1[1].age = 24;
		
		stu1[2] = new Stu();
		stu1[2].id = "ccc";
		stu1[2].pw = "3333";
		stu1[2].name = "이순신";
		stu1[2].age = 22;
		
		
		

	}

}
