package j0123;

import java.util.Scanner;

public class ja0123_06 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Scanner scan = new Scanner(System.in);
		
//		String a = "a";
//		for(int i=0;i<10;i++) {
//			a += i;
//		}
		
		String a = new String("a");
		StringBuffer str = new StringBuffer("aaa");
		System.out.println(a+1);   // a1출력을 원하면 (a라는 공간과 a2라는 공간을 만듬)
		System.out.println(str.append(2));  // aaa2출력을 원하면 (원래 있던 aaa공간에 추가해서 만듬(하나의공간))
		
		
//		String str = "bbaaccAABBCCaaddeeffAAaa";
//		System.out.println(str.indexOf("aa"));  // 처음 발견된 위치만 찍어줌
		
//		int count = 0;
//		for(int i=0;i<str.length();i++) { // aa가 들어간 모든 글자를 찾을때 사용
//			if(str.indexOf("aa",i)!=-1) {
//				i = str.indexOf("aa",i);
//				System.out.println("존재하는 위치 : "+i);
//				count++;
//			}else {
//				break;
//			}
//		}
//		
//		System.out.println("총 갯수 : "+count);
		
		// valueOf : 문자열로 변경해줌(잘안씀)
//		int a = 10;
//		double b = 3.14;
//		String.valueOf(a);  // ""+a 
//		String.valueOf(b);  // ""+b  이게 나음
//		
//		String str1 = "3.14";
//		double a5 = Double.parseDouble(str1);
		
		
//		String[] arr = {"홍길동임","유관순입니다.","이순신입니다.","강감찬일까요?","난김구야!"};
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i].substring(1,arr[i].length()-1));
//		}
		
		// substring : 
//		String str = "1조1234567";
//		System.out.println(str.substring(2,6));  // 2부터 6자리까지
//		System.out.println(str.substring(2));  // 2부터 끝까지
		
		//---------------------------------------------------------
		// length() : 문자의 길이
//		String str = "안녕하세요. 반갑습니다. 홍길동입니다.";
//
//		while(true) {
//			System.out.println("글자를 입력하세요.(10자 이내) >>");
//			String input = scan.next();
//			if(input.length()<10) {
//				System.out.println(input);
//				break;
//			}else {
//				System.out.println("10자 이내로 글자를 줄여주세요. >>");
//			}
//		}
		
		//---------------------------------------------------------
		// trim : 빈공백제거
//		String str = "     안  녕   ㅏㅎ    세이  호";
//		System.out.println(str);
//		System.out.println(str.trim());
		
		// replace : 문자를 다른문자로 대체
//		String str = "안녕하세요. 홍길동입니다. 성은 홍입니다.";
//		String input = "김";
//		str.replace("홍","김");
//		System.out.println(str);
//		System.out.println(str.replace("홍","김"));  // 원본은 안 바뀌어서 이렇게 해야됨
		
//		String str = "     안  녕   ㅏㅎ    세이  호";
//		System.out.println(str.replace(" ", ""));
		
		
		//---------------------------------------------------------
		// indefOf : 존재하는 데이터의 위치값을 알려줌
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "홍";
//		System.out.println(str.indexOf(input));
//		int no = str.indexOf(input);
		
		
		//---------------------------------------------------------
		// contains : 문자열 포함되어 있는지 확인
//		String[] arr = {"홍길동","유관순","이순신","강감찬","김구","홍길순","홍길자"};
//		String str1 = "안녕하세요. 성은 홍입니다.";
//		String input = "홍";
		
//		if(str1.contains(input)) {
//			System.out.println("홍홍홍");
//		}else {
//			System.out.println("NO홍-철");
//		}
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i].contains(input)) {
//				System.out.println(arr[i]);
//			}
//		}
		
		
		//---------------------------------------------------------
		// Integer.parseInt : 문자열을 숫자로 변경
//		String str = "1,홍길동,89,100,90,0,0.0,0";
//		String[] arr = str.split(",");
//		
//		System.out.println("번호 : "+arr[0]);
//		System.out.println("이름 : "+arr[1]);
//		System.out.println("국어점수 : "+arr[2]);
//		int kor = Integer.parseInt(arr[2]);
//		System.out.println("영어점수 : "+arr[3]);
//		int eng = Integer.parseInt(arr[3]);
//		System.out.println("수학점수 : "+arr[4]);
//		int math = Integer.parseInt(arr[4]);
//		System.out.println("합계 : "+(kor+eng+math));
//		int total = Integer.parseInt(arr[5]);
//		System.out.println("평균 : "+((kor+eng+math)/3.0));
		
		
//		System.out.println("숫자를 입력하세요.>>    10,9");
//		
//		
//		String input = scan.next();
//		String[] arr = input.split(",");
//		int n1 = Integer.parseInt(arr[0]);
//		int n2 = Integer.parseInt(arr[1]);
//		System.out.println(n1+n2);
//		System.out.println(n1*n2);
		
//		String str = "5";
//		int n = Integer.parseInt(str);  // 문자열을 숫자로 변경
		
		
		
		//---------------------------------------------------------
		// split : 특정 분리자로 분리
//		String str = "100,100,100";
//		String[] arr = str.split(",");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//---------------------------------------------------------
		// concat : 문자열합치기
//		String str = "안녕";
//		String str2 = "반가워";
//		System.out.println(str.concat(str2));
		
		//---------------------------------------------------------
		// str.charAt(n)  지정된 위치 문자 반환(n번째)
//		String str = "abcdef";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
		
		
		
		
//		String str = "abc";
//		String str2 = "aBc";
//		String str3 = "abc";
//		
//		if(str.equalsIgnoreCase(str2)) {  // 대소문자 구분없이 확인
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		if(str.equals(str3)) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
		
//		Point p1 = new Point(3,5);
//		Point p2 = (Point)p1.clone();   // 객체 복사
//		Point p3 = new Point(p1);  		// 객체 복사
//		
//		// 값 변경
//		p1.x = 10;
//		p2.x = 100;
//
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
//		
//		Stu s = new Stu();
//		System.out.println(s);
//		
//		Class s2 = Stu.class;
//		System.out.println(s2.getName());
//		
//		String a = "a";
//		String b = "b";
//		a += b;
//		
//		for(int i=0;i<100;i++) {
//			a += i;
//		};
			
		
//		String txt = "윤석열 대통령 변호인단은 23일 “공수처의 위법 수사와 불법행위에 대해서는 끝까지 법적 책임을 물을 것임을 엄중히 경고한다”고 밝혔다.\r\n"
//				+ "\r\n"
//				+ "고위공직자범죄수사처가 윤 대통령 사건을 검찰에 넘기며 기소를 요구하자 입장문을 통해 비판의 메시지를 전한 셈이다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “공수처장은 세 번이나 강제구인을 시도하며 대통령에게 사법부를 존중해 달라고 요청했지만, 불법 수사를 자행하던 공수처가 법질서의 존중을 이야기하는 것은 언어도단”이라고 말했다.\r\n"
//				+ "\r\n"
//				+ "이어 “공수처는 수사권이 없음에도 관할권 없는 법원에서 불법 영장을 받아낸 후 수사지휘권 없이 경찰 기동대 수천 명을 동원해 불법 영장 집행을 강행했다”고 주장했다.\r\n"
//				+ "\r\n"
//				+ "또 “55경비단의 공문서를 위조하거나 경호처 관계자로부터 군사시설의 배치 등 기밀 사항을 유출하도록 하는 행위에 공모하는 등 온갖 불법을 저질렀다”고도 했다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “대통령을 체포한 후 진술을 강요하며 망신 주기에 앞장섰고, 가족의 접견과 서신도 제한하는 등 과도한 인권침해를 자행했다”면서 “수사 착수 후 51일 동안 공수처가 한 것은 불법과 꼼수, 대통령의 인권과 방어권을 침해하는 위법이 전부”라고 전했다.\r\n"
//				+ "\r\n"
//				+ "이후 검찰을 향해서는 \"공수처와 같은 불법 수사가 아니라 법적 정당성을 갖춘 수사로 적법절차를 준수하라\"고 요청했다.\r\n"
//				+ "\r\n"
//				+ "그러면서 \"대통령은 향후 수사와 재판, 탄핵심판에서 비상계엄 선포의 필요성을 국민들에게 알리고, 헌정질서 회복과 국정 마비 상황을 극복하기 위해 노력할 것\"이라고 덧붙였다.";
//		
//		String txt2 = "윤석열 대통령 변호인단은 23일 “공수처의 위법 수사와 불법행위에 대해서는 끝까지 법적 책임을 물을 것임을 엄중히 경고한다”고 밝혔다.\r\n"
//				+ "\r\n"
//				+ "고위공직자범죄수사처가 윤 대통령 사건을 검찰에 넘기며 기소를 요구하자 입장문을 통해 비판의 메시지를 전한 셈이다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “공수처장은 세 번이나 강제구인을 시도하며 대통령에게 사법부를 존중해 달라고 요청했지만, 불법 수사를 자행하던 공수처가 법질서의 존중을 이야기하는 것은 언어도단”이라고 말했다.\r\n"
//				+ "\r\n"
//				+ "이어 “공수처는 수사권이 없음에도 관할권 없는 법원에서 불법 영장을 받아낸 후 수사지휘권 없이 경찰 기동대 수천 명을 동원해 불법 영장 집행을 강행했다”고 주장했다.\r\n"
//				+ "\r\n"
//				+ "또 “55경비단의 공문서를 위조하거나 경호처 관계자로부터 군사시설의 배치 등 기밀 사항을 유출하도록 하는 행위에 공모하는 등 온갖 불법을 저질렀다”고도 했다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “대통령을 체포한 후 진술을 강요하며 망신 주기에 앞장섰고, 가족의 접견과 서신도 제한하는 등 과도한 인권침해를 자행했다”면서 “수사 착수 후 51일 동안 공수처가 한 것은 불법과 꼼수, 대통령의 인권과 방어권을 침해하는 위법이 전부”라고 전했다.\r\n"
//				+ "\r\n"
//				+ "이후 검찰을 향해서는 \"공수처와 같은 불법 수사가, 아니라 법적 정당성을 갖춘 수사로 적법절차를 준수하라\"고 요청했다.\r\n"
//				+ "\r\n"
//				+ "그러면서 \"대통령은 향후 수사와 재판, 탄핵심판에서 비상계엄 선포의 필요성을 국민들에게 알리고, 헌정질서 회복과 국정 마비 상황을 극복하기 위해 노력할 것\"이라고 덧붙였다.";
//		
//		String txt3 = "안녕하세요";
//		String str1 = new String(txt);
//		String str2 = new String(txt2);
//		System.out.println(str1.hashCode());  // 파일이 수정되었는지 확인하는 용도(한글자만 달라져도 해시코드가 다름)
//		System.out.println(str2.hashCode());
		
		
		
//		Stu s1 = new Stu("홍길동",100,90,90);
//		Stu s2 = new Stu("홍길동",70,70,70);
//		
//		if(s1.equals(s2)) {
//			System.out.println("같은 사람입니다.");
//		}else {
//			System.out.println("다른 사람입니다.");
//		}
		
		
		
//		Person p1 = new Person(200101011111111L);
//		Person p2 = new Person(200101011111111L);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		if(p1.equals(p2)) {
//			System.out.println("같은 사람입니다.");
//		}else {
//			System.out.println("다른 사람입니다.");
//		}
	}

}
