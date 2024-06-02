package tp5.ejercicio5;

import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.listaAdy.AdjListGraph;

public class PruebaTP5E5 {

	public static void main(String[] args) {
		Graph<Jubilado> grafo = new AdjListGraph<Jubilado>();
		
		Jubilado j1 = new Jubilado(true, "Pepe", "Calle 27");
		Jubilado j2 = new Jubilado(true, "Marta", "Calle 38");
		Jubilado j3 = new Jubilado(true, "Juan", "Calle 45");
		Jubilado j4 = new Jubilado(true, "Ana", "Calle 52");
		Jubilado j5 = new Jubilado(true, "Carlos", "Calle 60");
		Jubilado j6 = new Jubilado(true, "Luisa", "Calle 68");
		Jubilado j7 = new Jubilado(true, "Roberto", "Calle 74");
		Jubilado j8 = new Jubilado(true, "María", "Calle 80");
		Jubilado j9 = new Jubilado(true, "Pedro", "Calle 90");
		Jubilado j10 = new Jubilado(true, "Elena", "Calle 100");
		
		Jubilado e = new Jubilado(false, "Lucía", "Calle 120");
		
		Vertex<Jubilado> E = grafo.createVertex(e);
		Vertex<Jubilado> J1 = grafo.createVertex(j1);
        Vertex<Jubilado> J2 = grafo.createVertex(j2);
        Vertex<Jubilado> J3 = grafo.createVertex(j3);
        Vertex<Jubilado> J4 = grafo.createVertex(j4);
        Vertex<Jubilado> J5 = grafo.createVertex(j5);
        Vertex<Jubilado> J6 = grafo.createVertex(j6);
        Vertex<Jubilado> J7 = grafo.createVertex(j7);
        Vertex<Jubilado> J8 = grafo.createVertex(j8);
        Vertex<Jubilado> J9 = grafo.createVertex(j9);
        Vertex<Jubilado> J10 = grafo.createVertex(j10);
        
        grafo.connect(E, J1, 1);
        grafo.connect(J1, E, 1);

        grafo.connect(E, J2, 1);
        grafo.connect(J2, E, 1);

        grafo.connect(E, J3, 1);
        grafo.connect(J3, E, 1);

        grafo.connect(J1, J7, 1);
        grafo.connect(J7, J1, 1);

        grafo.connect(J1, J4, 1);
        grafo.connect(J4, J1, 1);

        grafo.connect(J3, J10, 1);
        grafo.connect(J10, J3, 1);

        grafo.connect(J3, J4, 1);
        grafo.connect(J4, J3, 1);

        grafo.connect(J2, J8, 1);
        grafo.connect(J8, J2, 1);

        grafo.connect(J8, J9, 1);
        grafo.connect(J9, J8, 1);

        grafo.connect(J7, J9, 1);
        grafo.connect(J9, J7, 1);

        grafo.connect(J4, J5, 1);
        grafo.connect(J5, J4, 1);

        grafo.connect(J5, J6, 1);
        grafo.connect(J6, J5, 1);
        
        System.out.println(Banco.listaJubilados(grafo, e, 1));
        
        
	}

}
