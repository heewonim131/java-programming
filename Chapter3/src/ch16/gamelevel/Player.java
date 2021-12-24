package ch16.gamelevel;

public class Player {

	PlayerLevel level = new BeginnerLevel();

	public PlayerLevel getLevel() {
		return this.level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
	
	public void play(int i) {
		this.level.go(i);
	}
}
