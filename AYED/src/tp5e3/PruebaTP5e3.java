package tp5e3;

import java.util.ArrayList;
import java.util.List;

import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.listaAdy.AdjListGraph;

public class PruebaTP5e3 {

	public static void main(String[] args) {
		Graph<String> vertices = new AdjListGraph<>();
		Vertex<String> A = vertices.createVertex("A");
		Vertex<String> B = vertices.createVertex("B");
		Vertex<String> C = vertices.createVertex("C");
		Vertex<String> D = vertices.createVertex("D");
		Vertex<String> E = vertices.createVertex("E");
		Vertex<String> F = vertices.createVertex("F");
		Vertex<String> G = vertices.createVertex("G");
		Vertex<String> H = vertices.createVertex("H");
		Vertex<String> I = vertices.createVertex("I");
		Vertex<String> J = vertices.createVertex("J");
		vertices.connect(A, B, 100);
		vertices.connect(A, C, 70);
		vertices.connect(A, D, 50);
		vertices.connect(B, E, 30);
		vertices.connect(C, B, 10);
		vertices.connect(C, E, 40);
		vertices.connect(C, G, 70);
		vertices.connect(C, F, 60);
		vertices.connect(D, C, 20);
		vertices.connect(D, F, 60);
		vertices.connect(E, H, 40);
		vertices.connect(E, G, 30);
		vertices.connect(F, G, 20);
		vertices.connect(F, I, 10);
		vertices.connect(H, G, 10);
		vertices.connect(H, J, 90);
		vertices.connect(G, I, 80);
		vertices.connect(I, J, 20);
		Mapa mapa = new Mapa(vertices);
		List<Vertex<String>> exceptuados = new ArrayList<Vertex<String>>();
		exceptuados.add(D);
		exceptuados.add(C);
		exceptuados.add(G);
		System.out.println(mapa.devolverCamino("A", "J").toString());
		System.out.println(mapa.devolverCaminoExceptuando("A", "J",exceptuados).toString());
		System.out.println(mapa.caminoMasCorto("A", "J"));
		System.out.println(mapa.caminoSinCargarCombustible("A", "J", 200));
		System.out.println(mapa.caminoConMenorCargaDeCombustible("A", "J", 50));
		mapa.printGraph();
	}

}
