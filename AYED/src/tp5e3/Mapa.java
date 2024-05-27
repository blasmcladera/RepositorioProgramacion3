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
	
	public List<String> devolverCamino(String ciudad1,String ciudad2){
		boolean[]marcas=new boolean[grafo.getSize()];
		List<String> l = new ArrayList<String>();
		Vertex<String> v = grafo.search(ciudad1);
		if (v==null) return l;
		devolverCamino(v,l,marcas,grafo,ciudad2);
		if (l.get(l.size()-1)==ciudad2) return l;
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
}
