package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class MyContainer {
	public int index;
	public int [] array;
	
	public MyContainer(int size) {
		index = 0;
		array = new int[size];
	}
}

public class UnweightedGraph implements UnweightedGraphIntf {
	private ArrayList<Integer> [] adjacencyList;
	
	public UnweightedGraph(int size) {
		adjacencyList = new ArrayList[size];
		for(int i=0; i<size; i++) {
			adjacencyList[i] = new ArrayList<>();
		}
	}
	
	@Override
	public void AddEdge(int v, int u) {
		if(u == v) {
			return;
		}
		adjacencyList[v].add(u);
		adjacencyList[u].add(v);
	}
	
	private void DFSHelper(int startVertex, boolean[] visited, MyContainer dfsContainer) {
		visited[startVertex] = true;
		dfsContainer.array[dfsContainer.index] = startVertex;
		dfsContainer.index += 1;
		
		for(int el : adjacencyList[startVertex]) {
			if(visited[el] == false) {
				DFSHelper(el, visited, dfsContainer);
			}
		}
	}
	
	@Override
	public int[] DFS(int startVertex) {
		boolean [] visited = new boolean[adjacencyList.length];
		for(int i=0; i<visited.length; i++) {
			visited[i] = false;
		}
		MyContainer dfsContainer = new MyContainer(visited.length);
		DFSHelper(startVertex, visited, dfsContainer);
		return dfsContainer.array;
	}

	@Override
	public int[] BFS(int startVertex) {
		boolean [] visited = new boolean[adjacencyList.length];
		for(int i=0; i<visited.length; i++) {
			visited[i] = false;
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		MyContainer bfsContainer = new MyContainer(visited.length);
		
		queue.add(startVertex);
		visited[startVertex] = true;
		
		while(!queue.isEmpty()) {
			int queueSize = queue.size();
			
			while(queueSize != 0) {
				int frontElement = queue.peek();
				queue.poll();
	
				bfsContainer.array[bfsContainer.index] = frontElement;
				bfsContainer.index += 1;
				
				for(int el : adjacencyList[frontElement]) {
					if(visited[el] == false) {
						visited[el] = true;
						queue.add(el);
					}
				}
				queueSize--;
			}
		}
		return bfsContainer.array;
	}

}
