package j0122;

public class ja0122_03 {

	public static void main(String[] args) {
		// CaptionTv - text, caption()
		CaptionTv c = new CaptionTv();
		// Tv - power, channel, power(), channelUp(), channelDown()
		c.caption();
		c.text = "[ 뮤직비디오 로제 - APT ]";
		System.out.println("자막 : "+c.text);
		
		Tv t2 = new Tv();
		Tv t = new CaptionTv();  // 다형성
		
		// t.text = ""; 자손에만 있는 데이터는 객체선언해서 사용할 수는 없음(공간만 생김) error
		
		CaptionTv c3;  // 자손의 참조변수로 형변환시키면 사용가능
		c3 = (CaptionTv)t;  // 부모 → 자손(형변환 생략불가)
		c3.text = "aaa";
		t = c3;  //자손 → 부모(형변환 생략가능)
		System.out.println(c3.text);
		
//		c3 = (CaptionTv)t2;
		// c3.text = "bbb";
		
		
		
	}
	

}
