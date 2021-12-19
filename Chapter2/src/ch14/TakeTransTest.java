package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("James", 5000);
		Student s2 = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway(2);
		
		s1.takeBus(bus100);
		s2.takeSubway(subwayGreen);
		
		s1.showInfo();
		s2.showInfo();
		
		bus100.showBusInfo();
		subwayGreen.showSubwayInfo();
	}

}
