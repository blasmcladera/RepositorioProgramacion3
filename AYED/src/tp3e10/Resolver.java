package tp3e10;
import GeneralTree.GeneralTree;
import java.util.List;
import java.util.ArrayList;
public class Resolver {
	public static List<Integer> resolver(GeneralTree<Integer> arbol){
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> aux = new ArrayList<Integer>();
		result.add(0);
		aux.add(0);//en la pos 0 guardo la suma
		resolverRecursivo(arbol,0,aux,result);
		return result;
	}
	
	private static void resolverRecursivo(GeneralTree<Integer> arbol,int h,List<Integer> aux,List<Integer> result) {
		if (arbol.getData()!=0) {
			aux.set(0, aux.get(0)+(arbol.getData()*h));
			aux.add(1);
		}
		if (!arbol.isLeaf()) {
			List<GeneralTree<Integer>> children = arbol.getChildren();
			for (GeneralTree<Integer> child : children) {
				resolverRecursivo(child,h+1,aux,result);
			}
		}
		if (result.get(0)<aux.get(0)) {
			result.clear();
			result.addAll(aux);
		}
		if (arbol.getData()==1) {
			aux.set(0, aux.get(0)-(arbol.getData()*h));
			aux.remove(aux.size()-1);
		}
	}
}
