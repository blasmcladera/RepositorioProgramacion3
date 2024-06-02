package tp5e3;

import java.util.ArrayList;
import java.util.List;

import tp5.ejercicio1.Edge;
import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;

public class Mapa {
	private Graph<String> grafo;
	
	public Mapa (Graph<String> grafo) {
		this.grafo=grafo;
	}
	
	public void printGraph() {
        for (Vertex<String> vertex : grafo.getVertices()) {
            System.out.print("Vertex " + vertex.getData() + " is connected to: ");
            for (Edge<String> edge : grafo.getEdges(vertex)) {
                System.out.print(edge.getTarget().getData() + "(weight " + edge.getWeight() + ") ");
            }
            System.out.println();
        }
    }
	
//	a)
	public List<String> devolverCamino(String ciudad1,String ciudad2){
		boolean[]marcas=new boolean[grafo.getSize()];
		List<String> l = new ArrayList<String>();
		Vertex<String> v = grafo.search(ciudad1);
		if (v==null) return l;
		if (devolverCamino(v,l,marcas,grafo,ciudad2)) return l;
		else {
			l.clear();
			return l;
		}
	}
	
	private boolean devolverCamino(Vertex<String>v ,List<String> l, boolean[]marcas,Graph<String> grafo,String ciudad2) {
		if (!(marcas[v.getPosition()])){
			l.add(v.getData());
			marcas[v.getPosition()]=true;
			if (v.getData()==ciudad2) return true;
			List<Edge<String>> adyacentes = grafo.getEdges(v);
			for (Edge<String> edge : adyacentes) {
				if(devolverCamino(edge.getTarget(),l,marcas,grafo,ciudad2))return true;
			}
		}
		if (l.size()!=1) l.remove(l.size()-1);
		return false;
	}
	
//	b)
	
	public List<String> devolverCaminoExceptuando(String ciudad1,String ciudad2,List<Vertex<String>> exc){
		boolean[]marcas=new boolean[grafo.getSize()];
		for (Vertex<String> vert : exc) marcas[vert.getPosition()]=true;
		List<String> l = new ArrayList<String>();
		Vertex<String> v = grafo.search(ciudad1);
		if (v==null) return l;
		if (devolverCaminoExceptuando(v,l,marcas,grafo,ciudad2)) return l;
		else {
			l.clear();
			return l;
		}
	}
	
	private boolean devolverCaminoExceptuando(Vertex<String>v ,List<String> l, boolean[]marcas,Graph<String> grafo,String ciudad2) {
		if (!(marcas[v.getPosition()])){
			l.add(v.getData());
			marcas[v.getPosition()]=true;
			if (v.getData()==ciudad2) return true;
			List<Edge<String>> adyacentes = grafo.getEdges(v);
			for (Edge<String> edge : adyacentes) {
				if(devolverCaminoExceptuando(edge.getTarget(),l,marcas,grafo,ciudad2))return true;
			}
		}
		if (l.size()!=1) {
			if (l.get(l.size()-1)==v.getData()) l.remove(l.size()-1);
		}
		return false;
	}
	
//	c)
	public List<String> caminoMasCorto(String n1,String n2){
		List<Vertex<String>> l = new ArrayList<Vertex<String>>();
		
		int []distancias = new int[grafo.getSize()];
		for (int i=0;i<grafo.getSize();i++) {
			if (i==grafo.search(n1).getPosition()) distancias[i]= 0;
			else distancias[i]= 999999;
		}
		boolean []visitados = new boolean[grafo.getSize()];
		String []predecesores = new String[grafo.getSize()];
		
		Vertex<String> actual;
		l.add(grafo.search(n1));
		while(!l.isEmpty()) {
			actual = l.remove(0);
			for (Edge<String> edge : grafo.getEdges(actual)) {
				if (!visitados[edge.getTarget().getPosition()]) {
					distancias[edge.getTarget().getPosition()]=distancias[actual.getPosition()]+edge.getWeight();
					predecesores[edge.getTarget().getPosition()]=actual.getData();
					if (l.isEmpty()) l.add(0,actual);
					else {
						if (distancias[edge.getTarget().getPosition()]<distancias[l.get(0).getPosition()])l.add(0,edge.getTarget());
						else l.add(edge.getTarget()      );
					}
				}
			}
			visitados[actual.getPosition()]=true;
		}
		List<String> result = new ArrayList<String>();
		actual=grafo.search(n2);
		System.out.println(distancias[actual.getPosition()]);
		while (actual!=null) {
			result.add(0,actual.getData());
			actual= grafo.search(predecesores[actual.getPosition()]);
		}
		return result;
	}
	
//	d)
	public List<String> caminoSinCargarCombustible(String n1,String n2,int c){
		List<Vertex<String>> l = new ArrayList<Vertex<String>>();
		
		int []distancias = new int[grafo.getSize()];
		for (int i=0;i<grafo.getSize();i++) {
			if (i==grafo.search(n1).getPosition()) distancias[i]= 0;
			else distancias[i]= 999999;
		}
		boolean []visitados = new boolean[grafo.getSize()];
		String []predecesores = new String[grafo.getSize()];
		
		Vertex<String> actual;
		l.add(grafo.search(n1));
		while(!l.isEmpty()) {
			actual = l.remove(0);
			for (Edge<String> edge : grafo.getEdges(actual)) {
				if (!visitados[edge.getTarget().getPosition()]) {
					distancias[edge.getTarget().getPosition()]=distancias[actual.getPosition()]+edge.getWeight();
					predecesores[edge.getTarget().getPosition()]=actual.getData();
					if (l.isEmpty()) l.add(0,actual);
					else {
						if (distancias[edge.getTarget().getPosition()]<distancias[l.get(0).getPosition()])l.add(0,edge.getTarget());
						else l.add(edge.getTarget());
					}
				}
			}
			visitados[actual.getPosition()]=true;
		}
		List<String> result = new ArrayList<String>();
		actual=grafo.search(n2);
		
		if (distancias[actual.getPosition()]<=c) {
			while (actual!=null) {
				result.add(0,actual.getData());
				actual= grafo.search(predecesores[actual.getPosition()]);
			}
		}
		
//		for(int i=0;i<grafo.getSize();i++) {
//			System.out.println("["+grafo.getVertex(i).getData()+"]"+"["+predecesores[i]+"]"+"["+distancias[i]+"]");
//		}
		return result;
	}
	
//	e)
	public List<String> caminoConMenorCargaDeCombustible(String n1,String n2,int c){
		List<Vertex<String>> l = new ArrayList<Vertex<String>>();
		int []distancias = new int[grafo.getSize()];
		for (int i=0;i<grafo.getSize();i++) {
			if (i==grafo.search(n1).getPosition()) distancias[i]= 0;
			else distancias[i]= 999999;
		}
		boolean []visitados = new boolean[grafo.getSize()];
		String []predecesores = new String[grafo.getSize()];
		
		Vertex<String> actual;
		l.add(grafo.search(n1));
		while(!l.isEmpty()) {
			actual = l.remove(0);
			for (Edge<String> edge : grafo.getEdges(actual)) {
				if (!visitados[edge.getTarget().getPosition()]) {
					if (edge.getWeight()<=c) {
						distancias[edge.getTarget().getPosition()]=distancias[actual.getPosition()]+edge.getWeight();
						predecesores[edge.getTarget().getPosition()]=actual.getData();
					}
					if (l.isEmpty()) l.add(0,actual);
					else {
						if (distancias[edge.getTarget().getPosition()]<distancias[l.get(0).getPosition()])l.add(0,edge.getTarget());
						else l.add(edge.getTarget());
					}
				}
			}
			visitados[actual.getPosition()]=true;
		}
		List<String> result = new ArrayList<String>();
		actual=grafo.search(n2);
		if (predecesores[actual.getPosition()]!=null) {
			while (actual!=null) {
				result.add(0,actual.getData());
				actual= grafo.search(predecesores[actual.getPosition()]);
			}
		}
		if(result.get(0)!=n1) result.clear();
		return result;
	}
	
}

