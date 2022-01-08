package ch04;

public class UndirectedGraph {
	
	// fields
	private int count;
	private int[][] vertexMatrix;
	
	// constructor
	public UndirectedGraph(int count) {
		this.count = count;
		vertexMatrix = new int[count][count];
	}
	
	public void addEdges(int from, int to, int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}
	
	// getter
	public int[][] getMatrix(){
		return vertexMatrix;
	}

}
