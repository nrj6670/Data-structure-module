package graph;

public interface UnweightedGraphIntf {
	public void AddEdge(int v, int u);
	public int[] DFS(int startVertex);
	public int[] BFS(int startVertex);
}
