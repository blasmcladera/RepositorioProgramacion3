package tp5e3;

import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.listaAdy.AdjListGraph;

public class PruebaTP5e3 {

	public static void main(String[] args) {
		Graph<String> ciudades = new AdjListGraph<>();
		Vertex<String> v1 = ciudades.createVertex("Buenos Aires");
		Vertex<String> v2 = ciudades.createVertex("Santiago");
		Vertex<String> v3 = ciudades.createVertex("Asunción");
		Vertex<String> v4 = ciudades.createVertex("Caracas");
		Vertex<String> v5 = ciudades.createVertex("Madrid");
		Vertex<String> v6 = ciudades.createVertex("seis");
		Vertex<String> v7 = ciudades.createVertex("sete");
		Vertex<String> v8 = ciudades.createVertex("ocho");
		ciudades.connect(v1, v2, 3); //"Buenos Aires", "Santiago"
		ciudades.connect(v4, v3, 6); //"Buenos Aires", "Asunción"
		ciudades.connect(v2, v5, 4); //"Santiago", "Roma"
		ciudades.connect(v1, v6, 3);
		ciudades.connect(v3, v7, 3);
		ciudades.connect(v5, v8, 3);
		Mapa mapa = new Mapa(ciudades);
		System.out.println(mapa.devolverCamino("Caracas", "sete").toString());
	}

}
