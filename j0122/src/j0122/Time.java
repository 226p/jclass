package j0122;

public class Time {
	Time(){}
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	int hour;  // 접근제한(보안강화)
	private int minute;
	private int second;
	
	void setHour(int hour) {  // 데이터 삽입 관련
		if(hour>=0 && hour<=23) {
			this.hour = hour;
		}
	}
	
	int getHour() { // 권한부여(변수접근 제한)
		return hour;
	}
	
	
	void setMinute(int minute) {
		this.minute = minute;
	}
	
	int getMinute() {
		return minute;
	}
	
	
	void setSecond(int second) {
		this.second = second;
	}
	
	int getSecond() {
		return second;
	}
}
