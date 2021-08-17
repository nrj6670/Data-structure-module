package graph;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class UnweightedGraphTest {

	@Test
	void testAddingElementToGraphAndBFS() {
		UnweightedGraph graph = new UnweightedGraph(5);
		graph.AddEdge(0, 1);
		graph.AddEdge(0, 4);
		graph.AddEdge(1, 2);
		graph.AddEdge(1, 3);
		graph.AddEdge(1, 4);
		graph.AddEdge(2, 3);
		graph.AddEdge(3, 4);
		int startVertex = 2;
		int [] result = graph.BFS(startVertex);
		System.out.println("BFS : " + Arrays.toString(result));
		assertTrue(true);
	}
	
	@Test
	void testDFS() {
		UnweightedGraph graph = new UnweightedGraph(5);
		graph.AddEdge(0, 1);
		graph.AddEdge(0, 4);
		graph.AddEdge(1, 2);
		graph.AddEdge(1, 3);
		graph.AddEdge(1, 4);
		graph.AddEdge(2, 3);
		graph.AddEdge(3, 4);
		int startVertex = 0;
		int [] result = graph.DFS(startVertex);
		System.out.println("DFS : " + Arrays.toString(result));
		assertTrue(true);
	}

}
