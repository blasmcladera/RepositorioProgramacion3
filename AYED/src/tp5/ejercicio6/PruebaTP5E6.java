package tp5.ejercicio6;

import java.util.List;

import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.listaAdy.AdjListGraph;

public class PruebaTP5E6 {

	public static void main(String[] args) {
		Graph<String> grafo = new AdjListGraph<String>();
		
		Vertex<String> cc = grafo.createVertex("Casa Caperucita");
		Vertex<String> c1 = grafo.createVertex("Claro 1");
		Vertex<String> c2 = grafo.createVertex("Claro 2");
		Vertex<String> c3 = grafo.createVertex("Claro 3");
		Vertex<String> c4 = grafo.createVertex("Claro 4");
		Vertex<String> c5 = grafo.createVertex("Claro 5");
		Vertex<String> ca = grafo.createVertex("Casa Abuelita");
		
		grafo.connect(cc, c3,4);
		grafo.connect(cc, c1,3);
		grafo.connect(cc, c2,4);
		grafo.connect(c3, c5,15);
		grafo.connect(c1, c5,3);
		grafo.connect(c2, c1,4);
		grafo.connect(c2, c5,11);
		grafo.connect(c2, c4,10);
		grafo.connect(c5, ca,4);
		grafo.connect(c4, ca,9);
		
		BuscadorDeCaminos buscador = new BuscadorDeCaminos(grafo);
		for (List<String> lista : buscador.recorridosMasSeguro()) {
			System.out.println(lista.toString());
		}
		

	}

}
