package tp5.ejercicio5;

import java.util.ArrayList;
import java.util.List;

import tp1e8.Queue;
import tp5.ejercicio1.Edge;
import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;

public class Banco {

	public static List<Jubilado> listaJubilados (Graph<Jubilado> grafo, Jubilado empleado, int radio){
		Vertex<Jubilado> actual = grafo.search(empleado);
		Queue<Vertex<Jubilado>> queue = new Queue<Vertex<Jubilado>>();
		List<Jubilado> result = new ArrayList<Jubilado>();
		if (actual!=null) {
			int dist[]=new int[grafo.getSize()];
			for (int i=0;i<grafo.getSize();i++) dist[i]=999;
			dist[actual.getPosition()]=0;
			queue.enqueue(actual);
			while (!queue.isEmpty()) {
				actual=queue.dequeue();
				for (Edge<Jubilado> edge : grafo.getEdges(actual)) {
					if (dist[edge.getTarget().getPosition()]==999) {
						dist[edge.getTarget().getPosition()]=dist[actual.getPosition()]+1;
						queue.enqueue(edge.getTarget());
					}
				}
			}
			for (int i=0;i<grafo.getSize();i++) {
				if (dist[i]<=radio && dist[i]>0 && grafo.getVertex(i).getData().getEs())result.add(grafo.getVertex(i).getData());
			}
		}
		return result;
	}
}
