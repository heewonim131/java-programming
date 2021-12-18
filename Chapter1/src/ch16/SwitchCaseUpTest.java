package ch16;

public class SwitchCaseUpTest {

	public static void main(String[] args) {
		
		int month = 10;
		int day = 0;
		
		switch (month) {
	    	case 1: case 3: case 5: case 7: case 8: case 10: case 12 :
	    		System.out.println("한 달은 31일입니다."); 
	    		day = 31;
	    	
	    	case 4: case 6: case 9: case 11 :
	    		System.out.println("한 달은 30일입니다."); 
	    	day = 30;
	    	
	    	case 2 :
	    		System.out.println("한 달은 28일입니다.");
	    		day = 28;
	    	
	    	default :
	    		System.out.println("존재하지 않는 달 입니다."); 
	    		day = 0;
		};
		
		System.out.println(month + "월은 " + day + "일입니다.");
	}
}
