package tp5.ejercicio4;

import java.util.ArrayList;
import java.util.List;

import tp5.ejercicio1.Edge;
import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;

public class VisitaOslo {
	public static List<String> paseoEnBici(Graph<String> lugares, String destino, int maxTiempo, List<String>lugaresRestringidos) {
//		TABLA DE DIJSTRKA
		int[]dist = new int[lugares.getSize()];			//Tabla de distancias;
		String[]pre = new String[lugares.getSize()];	//Tabla de predecesores;
		boolean[]marca = new boolean[lugares.getSize()];//Tabla de visitados;
		
//		DISTANCIAS INFINITAS MENOS AYUNTAMIENTO
		for (int i=0;i<lugares.getSize();i++) dist[i]=99999;
		dist[lugares.search("Ayuntamiento").getPosition()]=0;
		
// 		MARCO COMO VISITADOS LOS LUGARES RESTRINGIDOS
		for (String restringido : lugaresRestringidos) marca[lugares.search(restringido).getPosition()]=true;
		
		
//		INICIO DE ALGORITMO
		List<Vertex<String>> l = new ArrayList<Vertex<String>>();
		l.add(lugares.search("Ayuntamiento"));
		Vertex<String> actual;
		while(!l.isEmpty()) {
			actual=l.remove(0);
			if(!marca[actual.getPosition()]) {
				marca[actual.getPosition()]=true;
				for(Edge<String> edge : lugares.getEdges(actual)) {
					if (marca[edge.getTarget().getPosition()]) continue;
					dist[edge.getTarget().getPosition()]=edge.getWeight()+dist[actual.getPosition()];
					pre[edge.getTarget().getPosition()]=actual.getData();
					if (l.isEmpty())l.add(edge.getTarget());
					else {
						if (dist[l.get(0).getPosition()]>dist[edge.getTarget().getPosition()])l.add(0,edge.getTarget());
						else l.add(edge.getTarget());
					}
				}
			}
			
		}
		
//		for(int i=0;i<lugares.getSize();i++) {
//			System.out.println("["+lugares.getVertex(i).getData()+"]"+"["+pre[i]+"]"+"["+dist[i]+"]");
//		}

		List<String> result = new ArrayList<String>();
		String act = destino;
		while (act!=null) {
			result.add(0,act);
			act=pre[lugares.search(act).getPosition()];
		}
		if (!(result.get(0).equals("Ayuntamiento"))||dist[lugares.search(destino).getPosition()]>maxTiempo) result.clear();
		return result;
	}
}
