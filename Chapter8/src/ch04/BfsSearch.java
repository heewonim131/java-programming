package ch04;

import java.util.ArrayList;

public class BfsSearch {
	
	// fields
	int count;
	int[][] matrix;
	boolean[] visited;
	ArrayList<Integer> queue;

	// constructor
	public BfsSearch(int count) {
		this.count = count;
		visited = new boolean[count];
		queue = new ArrayList<Integer>();
		// matrix는 생성한 그래프 객체로부터 받음
	}
	
	// 트리 순회
	public void bfsTraversal() {
		queue.add(0);
		visited[0] = true;
		
		while (queue.size() != 0) {
			int node = queue.remove(0);
			System.out.println(node + " ");
			for (int i = 0; i < count; i++) {
				// 0이 아니고 방문하지 않았다면
				if (matrix[node][i] != 0 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int count = 8;
		UndirectedGraph graph = new UndirectedGraph(count);
		BfsSearch bfs = new BfsSearch(count);
		
		// 간선 추가
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 1);
		graph.addEdges(1, 3, 1);
		graph.addEdges(1, 4, 1);
		graph.addEdges(2, 5, 1);
		graph.addEdges(2, 6, 1);
		graph.addEdges(4, 5, 1);
		graph.addEdges(3, 7, 1);
		
		bfs.matrix = graph.getMatrix();
		bfs.bfsTraversal();
	}

}
