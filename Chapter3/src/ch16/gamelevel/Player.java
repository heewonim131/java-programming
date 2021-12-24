package ch16.gamelevel;

public class Player {

//	PlayerLevel level = new BeginnerLevel();
	private PlayerLevel level;
	
	public Player() {	// 생성자를 통한 의존성 주입
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
