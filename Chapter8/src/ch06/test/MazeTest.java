package ch06.test;

import ch06.maze.Robot;

public class MazeTest {

	public static void main(String[] args) {
		
		Robot robot;
		System.out.println("출구는 (7,7)입니다.");
		
		robot = new Robot();
		robot.findExit(0, 0, 7, 7);
		robot.showPath();
	}

}
