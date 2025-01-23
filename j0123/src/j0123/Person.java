package j0123;

public class Person {
	long id; 	 // 주민번호
	String name; //이름
	
	Person(){}
	
	Person(long id){
		this.id = id;
	}
	
	Person(long id,String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {  // equals : 비교대상 객체
		if(obj!=null && obj instanceof Person) {
//			if(id==((Person)obj).id) {
//				return true;
//			}else {
//				return false;
//			}  ← 이 구문을 ↓이렇게 변경
			return id == ((Person)obj).id;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {  // toString : 주소값이 아닌 데이터값이 출력되도록 함(Object클래스 메소드)
		return id+"";
	}
	
	
	
}
