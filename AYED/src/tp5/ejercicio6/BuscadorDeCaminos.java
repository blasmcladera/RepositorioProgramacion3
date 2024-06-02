package tp5.ejercicio6;

import java.util.ArrayList;
import java.util.List;
import tp5.ejercicio1.Edge;
import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;

public class BuscadorDeCaminos {
	Graph <String> grafo;
	
	public BuscadorDeCaminos (Graph<String> grafo) {
		this.grafo=grafo;
	}
	
	public List<ArrayList<String>> recorridosMasSeguro(){
		Vertex<String> actual = grafo.search("Casa Caperucita");
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		ArrayList<String> camino = new ArrayList<String>();
		recorridoMasSeguro(actual,result,camino);
		return result;
	}
	
	private void recorridoMasSeguro(Vertex<String> actual,ArrayList<ArrayList<String>> result,ArrayList<String> camino) {
		camino.add(actual.getData());
		if (actual.getData().equals("Casa Abuelita")) {
			ArrayList<String> aux =new ArrayList<String>();
			aux.addAll(camino);
			result.add(aux);
		}
		for (Edge<String> edge : grafo.getEdges(actual))if(edge.getWeight()<5) recorridoMasSeguro(edge.getTarget(),result,camino);
		camino.remove(camino.size()-1);
	}
}
