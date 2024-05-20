package tp5.ejercicio2;

import tp5.ejercicio1.*;
import java.util.List;
import java.util.ArrayList;
import tp1e8.Queue;

public class Recorridos <T>{
	
	public List<T> dfs(Graph<T> grafo){
		boolean[] marcas = new boolean[grafo.getSize()];
		List<T> l = new ArrayList<T>();
		for (int i=0;i<grafo.getSize();i++) {
			if (!marcas[i])dfsRecursivo(grafo.getVertex(i),l,marcas,grafo);
		}
		return l;
	}
	
	private void dfsRecursivo(Vertex<T> vertice, List<T> l, boolean[] marcas,Graph<T> grafo) {
		if (!(marcas[vertice.getPosition()])){
			l.add(vertice.getData());
			marcas[vertice.getPosition()]=true;
		}
		List<Edge<T>> adyacentes = grafo.getEdges(vertice);
		for (Edge<T> edge : adyacentes) {
			dfsRecursivo(edge.getTarget(),l,marcas,grafo);
		}
	}
	
	public List<T> bfs(Graph<T> grafo){
		boolean[] marcas = new boolean[grafo.getSize()];
		List<T> l = new ArrayList<T>();
		Queue<Edge<T>> queue = new Queue<Edge<T>>();
		for (int i=0;i<grafo.getSize();i++) {
			if (!marcas[i])bfsRecursivo(grafo.getVertex(i),l,marcas,grafo,queue);
		}
		return l;
	}
	
	private void bfsRecursivo(Vertex<T> vertice, List<T> l, boolean[] marcas,Graph<T> grafo,Queue<Edge<T>> queue){
		if (!(marcas[vertice.getPosition()])){
			l.add(vertice.getData());
			marcas[vertice.getPosition()]=true;
		}
		List<Edge<T>> adyacentes = grafo.getEdges(vertice);
		for (Edge<T> edge : adyacentes) {
			queue.enqueue(edge);
		}
		while (!queue.isEmpty()) {
			Edge<T> actual = queue.dequeue();
			bfsRecursivo(actual.getTarget(),l,marcas,grafo,queue);
		}
	}
	

}
