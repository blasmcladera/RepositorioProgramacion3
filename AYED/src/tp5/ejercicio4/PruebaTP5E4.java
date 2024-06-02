package tp5.ejercicio4;

import java.util.ArrayList;
import java.util.List;

import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.listaAdy.AdjListGraph;

public class PruebaTP5E4 {

	public static void main(String[] args) {
		Graph<String> vertices = new AdjListGraph<>();

		Vertex<String> Ayuntamiento = vertices.createVertex("Ayuntamiento");
		Vertex<String> PalacioReal = vertices.createVertex("Palacio Real");
		Vertex<String> AkkerBrigge = vertices.createVertex("Akker Brigge");
		Vertex<String> ElTigre = vertices.createVertex("El Tigre");
		Vertex<String> ParqueBotanico = vertices.createVertex("Parque Botánico");
		Vertex<String> FolkMuseum = vertices.createVertex("FolkMuseum");
		Vertex<String> MuseoVikingo = vertices.createVertex("Museo Vikingo");
		Vertex<String> LaOpera = vertices.createVertex("La Opera");
		Vertex<String> MuseoMunch = vertices.createVertex("Museo Munch");
		Vertex<String> GaleriaNacional = vertices.createVertex("Galería Nacional");
		Vertex<String> ParqueVigeland = vertices.createVertex("Parque Vigeland");
		Vertex<String> Holmenkollen = vertices.createVertex("Holmenkollen");
		Vertex<String> MuseoFram = vertices.createVertex("Museo Fram");
		Vertex<String> MuseoBarcoPolar = vertices.createVertex("Museo del Barco Polar");
		Vertex<String> FortalezaAkershus = vertices.createVertex("Fortaleza Akershus");

		// Conexiones entre los vértices con sus respectivos tiempos de viaje
		vertices.connect(Ayuntamiento, PalacioReal, 5);
		vertices.connect(PalacioReal, Ayuntamiento, 5);

		vertices.connect(Ayuntamiento, AkkerBrigge, 20);
		vertices.connect(AkkerBrigge, Ayuntamiento, 20);

		vertices.connect(Ayuntamiento, ElTigre, 15);
		vertices.connect(ElTigre, Ayuntamiento, 15);

		vertices.connect(Ayuntamiento, ParqueBotanico, 10);
		vertices.connect(ParqueBotanico, Ayuntamiento, 10);

		vertices.connect(PalacioReal, FolkMuseum, 5);
		vertices.connect(FolkMuseum, PalacioReal, 5);

		vertices.connect(AkkerBrigge, FolkMuseum, 30);
		vertices.connect(FolkMuseum, AkkerBrigge, 30);

		vertices.connect(AkkerBrigge, MuseoVikingo, 30);
		vertices.connect(MuseoVikingo, AkkerBrigge, 30);

		vertices.connect(ElTigre, LaOpera, 5);
		vertices.connect(LaOpera, ElTigre, 5);

		vertices.connect(ElTigre, MuseoMunch, 15);
		vertices.connect(MuseoMunch, ElTigre, 15);

		vertices.connect(ParqueBotanico, GaleriaNacional, 15);
		vertices.connect(GaleriaNacional, ParqueBotanico, 15);

		vertices.connect(MuseoMunch, ParqueBotanico, 1);
		vertices.connect(ParqueBotanico, MuseoMunch, 1);

		vertices.connect(LaOpera, FortalezaAkershus, 10);
		vertices.connect(FortalezaAkershus, LaOpera, 10);

		vertices.connect(GaleriaNacional, ParqueVigeland, 10);
		vertices.connect(ParqueVigeland, GaleriaNacional, 10);

		vertices.connect(ParqueVigeland, Holmenkollen, 30);
		vertices.connect(Holmenkollen, ParqueVigeland, 30);

		vertices.connect(ParqueVigeland, FolkMuseum, 20);
		vertices.connect(FolkMuseum, ParqueVigeland, 20);

		vertices.connect(FolkMuseum, MuseoFram, 5);
		vertices.connect(MuseoFram, FolkMuseum, 5);

		vertices.connect(MuseoFram, MuseoBarcoPolar, 5);
		vertices.connect(MuseoBarcoPolar, MuseoFram, 5);

		vertices.connect(MuseoVikingo, MuseoBarcoPolar, 5);
		vertices.connect(MuseoBarcoPolar, MuseoVikingo, 5);
		
		List<String> restringidos = new ArrayList<String>();
		restringidos.add("Museo Vikingo");
		restringidos.add("Akker Brigge");
		
		System.out.println(VisitaOslo.paseoEnBici(vertices, "Museo del Barco Polar", 20, restringidos));
//		Mapa mapa = new Mapa(vertices);
//		mapa.printGraph();
	}

}
