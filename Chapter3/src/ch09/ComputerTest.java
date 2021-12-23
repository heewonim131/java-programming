package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		
//		Computer computer = new Computer();	추상클래스 타입 선언 오류
		Computer computer = new Desktop();
		computer.display();
		computer.typing();
		computer.turnOn();
		computer.turnOff();
		
		NoteBook myNote = new MyNoteBook();
		myNote.display();
	}
}
