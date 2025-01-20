package j0120;

public class ja0120_07 { // public이 붙으면 파일명이랑 같아야 함
//	Ja0120_07(){} 기본생성자
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		d1.value = 10;
		d1.name = "홍길동";
		d1.kor = 100;
		d1.eng = 100;
		d1.math = 90;
		System.out.println(d1.value);
		
		Data1 dd = new Data1();
		dd.value = 11;
		dd.name = "유관순";
		dd.kor = 99;
		dd.eng = 98;
		dd.math = 97;
		System.out.println(dd.value);
		
		Data2 d2 = new Data2(1,"홍길동",100,100,99);
		Data2 d3 = new Data2(2,"홍길동",99,98,97);
		System.out.println(d2.value);
		
		
//		Cal c = new Cal();  // 객체선언 - new Cal(): 생성자 호출
	}
		
	}
class Data1{
	int value; // 인스턴스변수 : 객체선언 후 참조변수명.변수명
	String name;
	int kor;
	int eng;
	int math;
	
}
class Data2{
	int value; // 인스턴스변수 : 객체선언 후 참조변수명.변수명
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
//		Data2(){} // 기본생성자
	Data2(int x,String n,int k,int e,int m){
		value = x;
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = kor+eng+math;
		avg = total/3.0;
	}

}
