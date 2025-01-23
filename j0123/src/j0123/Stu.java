package j0123;

public class Stu {
	
	static int count = 0;
	
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	
	Stu(){}
	Stu(String name,int kor,int eng,int math){
		this.no = ++count; 		    // 자동
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;  // 자동
		this.avg = total/3.0; 	    // 자동
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	// get, set 캡슐화
	int getNo() {
		return no;
	}
	
	void setNo(int no) {  // set이 없으면 데이터를 수정못하고 읽기만 가능
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	//--------------------------------------------ja0123_06
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Stu) {
			return name == ((Stu)obj).name;  // 강제 형변환
		}else {
			return false;
		}
	}
	
	
	
	
}
