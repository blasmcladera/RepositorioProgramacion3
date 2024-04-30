package tp3e7;
import GeneralTree.GeneralTree;
import java.util.List;
import java.util.ArrayList;
public class Caminos {
	private GeneralTree<Integer> a;
	
	public Caminos(GeneralTree<Integer> a) {
		this.a=a;
	}
	
	public GeneralTree<Integer> getArbol(){
		return a;
	}
	
	public List<Integer> caminoAHojaMasLejana (){
		List<Integer> camino = new ArrayList<Integer>();
		List<Integer> aux = new ArrayList<Integer>();
		caminoRecursivo(camino,aux,a);
		return camino;
	}
	 
	 private static void caminoRecursivo(List<Integer> camino,List<Integer> aux,GeneralTree<Integer> a) {
		 aux.add(a.getData());
		 if (!a.isLeaf()) {
			 List<GeneralTree<Integer>> children = a.getChildren();
			 for (GeneralTree<Integer> c : children) {
				 caminoRecursivo(camino,aux,c);
				 aux.remove(c.getData());
			 }
		 }
		 else {
			 if (aux.size()>camino.size()) {
				 camino.clear();
				 camino.addAll(aux);
			 }
			 aux.remove(a.getData());
		 }
		 
	 }
}
