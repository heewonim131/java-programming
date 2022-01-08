package ch05;

class MyGraph {
	
	private int count;			// 노드 수
	private int[][] vertexMatrix;
	private int[] distance;		// 특정 노드에서 각 노드에 대한 최단 거리
	private boolean[] visited;
	private static int UNLIMIT = 99999999;
	
	public MyGraph(int count) {
		this.count = count;
		vertexMatrix = new int[count][count];
		distance = new int[count];
		visited = new boolean[count];
	}
	
	public void addEdges(int from, int to, int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;		
	}
	
	// from 노드로부터 각 노드의 최단 거리 구하는 메서드
	public void calcShortestPath(int from) {
		// 초기값 설정
		for (int i = 0; i < count; i++) {
			distance[i] = UNLIMIT;
		}
		
		visited[from] = true;
		distance[from] = 0;
		
		// 기존 거리 (경유하지 않은)
		for (int i = 0; i < count; i++) {
			if (visited[from] && vertexMatrix[from][i] != 0) {
				distance[i] = vertexMatrix[from][i];
			}
		}
		
		// 최단 거리
		for (int i = 0; i < count-1; i++) {
			int min = UNLIMIT;
			int minIndex = -1;
			
			// 방문하지 않은 노드 중 최소값을 기억
			for (int j = 0; j < count; j++) {
				if (!visited[j] && distance[j] != UNLIMIT) {
					if (distance[j] < min) {
						min = distance[j];
						minIndex = j;
					}
				}
			}
			
			// 방문 처리 후, distance를 최소값으로 갱신
			visited[minIndex] = true;
			for (int j = 0; j < count; j++) {
				if (!visited[j] && vertexMatrix[minIndex][j] != 0) {
					if (distance[j] > distance[minIndex] + vertexMatrix[minIndex][j]) {
						distance[j] = distance[minIndex] + vertexMatrix[minIndex][j];
					}
				}
			}
		}
	}
	
	public void showDistance(int from) {
		for (int i = 0; i < count; i++) {
			System.out.println(from + "노드로부터 " + i + "노드의 최단 거리는 " + distance[i]);
		}
	}
}

public class ShortestPath {

	public static void main(String[] args) {
		
		MyGraph graph = new MyGraph(6);
		
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 4);
		graph.addEdges(1, 2, 2);
		graph.addEdges(2, 3, 1);
		graph.addEdges(3, 4, 8);
		graph.addEdges(3, 5, 3);
		graph.addEdges(4, 5, 4);
		
		graph.calcShortestPath(3);
		graph.showDistance(3);
	}

}
