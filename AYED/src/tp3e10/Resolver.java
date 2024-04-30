/*package tp3e10;
import GeneralTree.GeneralTree;
import java.util.List;
import java.util.ArrayList;
public class Resolver {
	public static List<Integer> resolver(GeneralTree<Integer> arbol){
		List<Integer> camino = new ArrayList<Integer>();
		List<Integer> aux = new ArrayList<Integer>();
		resolverRecursivo(camino,aux,arbol,0);
		return camino;
	}
	
	private static void resolverRecursivo(List<Integer> camino, List<Integer> aux, GeneralTree<Integer> arbol,int h) {
		if (!arbol.isLeaf()) {
			if (arbol.getData()!=0) {
				aux.add(0,1);
				System.out.println(aux.toString());
			}
			List<GeneralTree<Integer>> children = arbol.getChildren();
			for (GeneralTree<Integer> child : children) {
				resolverRecursivo(camino,aux,child,h+1);
				if (arbol.getData()!=0) aux.remove(0);
			}
		}
		else {
			if (aux.size()==h) {
				camino.clear();
				camino.addAll(aux);
			}
		}
	}
}
*/