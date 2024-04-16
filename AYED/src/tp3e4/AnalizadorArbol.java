package tp3e4;
import GeneralTree.GeneralTree;
import java.util.List;
import java.util.LinkedList;
import tp1e8.Queue;
public class AnalizadorArbol {
	public int devolverMaximoPromedio (GeneralTree<AreaEmpresa> arbol) {
		//creo una lista con los valores de tardanza separados por niveles
		List<Integer> result = new LinkedList<Integer>();
		Queue<GeneralTree<AreaEmpresa>> queue = new Queue<GeneralTree<AreaEmpresa>>();
		queue.enqueue(arbol);
		queue.enqueue(null);
		
		while (!queue.isEmpty()) {
			GeneralTree<AreaEmpresa> tree_aux = queue.dequeue();
			if (tree_aux==null) {
				if (!queue.isEmpty()) {
					queue.enqueue(null);
					result.add(null);
				}
			}
			else {
				result.add(tree_aux.getData().getTardanza());
				List<GeneralTree<AreaEmpresa>> children = tree_aux.getChildren();
				for (GeneralTree<AreaEmpresa> child : children) {
					queue.enqueue(child);
				}
			}
		}
		result.add(null);
		//en la lista result tengo todas las tardanzas de los niveles separadas por null
		int cont=0;
		int cantelem=0;
		int promax=-1;
		for (int i=0;i<result.size();i++) {
			if (result.get(i)!=null) {
				cont+=result.get(i);
				cantelem++;
			}
			else {
				if ((cont/cantelem)>promax) {
					promax=(cont/cantelem);
				}
				cont=0;
				cantelem=0;
			}
		}
		result.clear();
		return promax;
	}
}
