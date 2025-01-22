package j0122;

public class ja0122_04 {

	public static void main(String[] args) {
		Car c = null;
		FireEngine fe = new FireEngine();
		Ambulance a2 = new Ambulance();
		FireEngine fe2;
		Ambulance a=null;
		fe.water();
		
		c = fe;
//		c.water();  // 공간은 있지만 출력되지 않음 error
		c = a2;
		if(c instanceof FireEngine) {
			fe2 = (FireEngine)c;
			fe2.water();
		}else if(c instanceof Ambulance) {
			a =(Ambulance)c;
			a.siren();
			
		}
	}

}
