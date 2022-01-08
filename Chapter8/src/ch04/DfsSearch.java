package ch04;

import java.util.Stack;

public class DfsSearch {
	
	// fields
	int count;
	int[][] matrix;
	boolean[] visited;
	Stack<Integer> stack;

	// constructor
	public DfsSearch(int count) {
		this.count = count;
		visited = new boolean[count];
		stack = new Stack<Integer>();
		// matrix는 생성한 그래프 객체로부터 받음
	}
	
	// 트리 순회
	public void dfsTraversal() {
		stack.push(0);
		visited[0] = true;
		
		while (stack.size() != 0) {
			int node = stack.pop();
			System.out.println(node + " ");
			for (int i = 0; i < count; i++) {
				// 0이 아니고 방문하지 않았다면
				if (matrix[node][i] != 0 && !visited[i]) {
					stack.push(i);
					visited[i] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int count = 8;
		UndirectedGraph graph = new UndirectedGraph(count);
		DfsSearch dfs = new DfsSearch(count);
		
		// 간선 추가
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 1);
		graph.addEdges(1, 3, 1);
		graph.addEdges(1, 4, 1);
		graph.addEdges(2, 5, 1);
		graph.addEdges(2, 6, 1);
		graph.addEdges(4, 5, 1);
		graph.addEdges(3, 7, 1);
		
		dfs.matrix = graph.getMatrix();
		dfs.dfsTraversal();
	}

}
