package j0120;

public class StuScore {
	{   // 초기화블럭
		++count;
		this.no = count;
	} 
	
	StuScore(){}  // 1. 기본생성자
	StuScore(String name,int kor,int eng,int math){  // 2. 매개변수생성자
		// 지역변수가 아닌 외부에 있는 참조변수(인스턴스변수)를 가르킴★★★
		this.name =  name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+math+eng;
		this.avg = this.total/3.0;
		
	}
	
	// 학생성적
	static int count;  // 클래스 변수 : 객체선언없이 클래스명.변수명 (공용)
	int no;			   // 인스턴스 변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void print() {
		System.out.printf("출력 : %d, %s, %d, %d, %d, %d, %.2f \n",no,name,kor,eng,math,total,avg);
	}
}



