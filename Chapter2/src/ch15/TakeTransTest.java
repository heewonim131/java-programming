package ch15;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("Edward", 20000);
		Taxi t1 = new Taxi("잘나간다 운수");
		
		s1.takeTaxi(t1);
		
		s1.showInfo();
		t1.showTaxiInfo();
	}

}
