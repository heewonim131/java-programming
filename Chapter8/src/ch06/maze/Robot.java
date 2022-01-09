package ch06.maze;

import java.util.Stack;

public class Robot {

	// 움직임을 표시할 변수들
	public static int NUMDIRECTIONS = 4;
	public static int WIDTH = 8;
	public static int HEIGHT = 8;
	
	Stack<Move> stack = new Stack<Move>();
	Move Move;
	Maze maze = new Maze();
	
	public int[][] DIRECTION_OFFSETS = {
			{0, -1},	// 상
			{0, 1},		// 하
			{-1, 0},	// 좌
			{1, 0}		// 우
	};
	
	public static int NONVISIT = 0;
	public static int WALL = 1;
	public static int VISIT = 2;
	int[][] markArray = new int[8][8];
	
	// 출구 찾기
	public void findExit(int startX, int startY, int endX, int endY) {
		boolean isEmpty = false;
		boolean isFound = false;
		int i = 0;
		
		// 시작 위치
		Move start =  new Move(startX, startY);
		start.direction = 0;
		stack.push(start);
		
		while (!isEmpty && !isFound) {
			// 현재 위치
			Move curPos = stack.pop();
			int x = curPos.x;
			int y = curPos.y;
			int direction = curPos.direction;
			
			while (!isFound && direction < NUMDIRECTIONS) {
				int newX = x + DIRECTION_OFFSETS[direction][0];
				int newY = y + DIRECTION_OFFSETS[direction][1];
				
				if (newX >= 0 && newX < WIDTH
						&& newY >= 0 && newY < HEIGHT
						&& maze.myMaze[newY][newX] == NONVISIT
						&& markArray[newY][newX] == NONVISIT) {
					Move newPosition = new Move(newX, newY);
					newPosition.direction = direction + 1;
					stack.push(newPosition);
					markArray[y][x] = VISIT;
					
					x = newX;
					y = newY;
					direction = 0;
					
					// 출구를 찾은 경우
					if (newX == endX && newY == endY) {
						isFound = true;
						newPosition.x = newX;
						newPosition.y = newY;
						newPosition.direction = 0;
						stack.push(newPosition);
						markArray[newY][newX] = VISIT;
					}//if
					
				} else {
					direction++;
				}//if
				
			}//while
			
			isEmpty = stack.isEmpty();
			
		}//while
		
	}//findExit
	
	// 찾은 길 출력
	public void showPath() {
		int[][] resultArray = new int[8][8];
		boolean isEmpty = false;
		
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				resultArray[i][j] = maze.myMaze[i][j];
			}
		}
		
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				if (maze.myMaze[i][j] == WALL) {
					System.out.print("■　");
				} else if (markArray[i][j] == VISIT) {
					System.out.print("□　");
				} else {
					System.out.print("Ｘ　");
				}
			}
			System.out.println();
		}//for
		
		// 스택에 저장한 위치 출력 (이동 경로)
		int i = 0;
		while (!isEmpty) {
			Move move = stack.pop();
			int x = move.x;
			int y = move.y;
			resultArray[y][x] = VISIT;
			
			if (i > 0) {
				System.out.print("<-");
			}
			System.out.print("(" + x + "," + y + ")");
			i++;
			isEmpty = stack.isEmpty();
		}//while
		System.out.println();
		
	}//showPath
	
}//class
