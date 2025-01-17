package j0117;

public class ja0117_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv();  // t1= 참조변수 : Tv.java 안에 여러개의 변수 사용 가능
		t1.color = "red";
		t1.power = false;
		t1.channel = 7;
		
		t1.power();  // Tv on
		t1.channelUp();  // 채널8로 이동
		
		System.out.println("현재채널 : "+t1.channel);
	}

}
