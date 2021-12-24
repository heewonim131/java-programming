package ch16.gamelevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
//	템플릿 메서드 final로 선언하여 재정의 할 수 없도록
	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();			
		}
		turn();
	};
	
}