package tp3e9;
import GeneralTree.GeneralTree;
import java.util.List;
import java.util.ArrayList;
public class Seleccion {
	public static boolean esDeSeleccion (GeneralTree<Integer> arbol) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		seleccionRecursivo(arbol,l);
		return (l.remove(0)==1);
	}
	
	private static void seleccionRecursivo(GeneralTree<Integer> a, List<Integer> l) {
		if (l.get(0)!=0) {
			if (!a.isLeaf()) {
				l.set(0, 1);
				List<GeneralTree<Integer>> children = a.getChildren();
				for (GeneralTree<Integer> c : children) {
					if (c.getData()<a.getData()) l.set(0, 0);
				}
				for (GeneralTree<Integer> c : children) {
					seleccionRecursivo(c,l);
				}
			}
		}
	}
}
