package tp3e11;
import java.util.List;
import GeneralTree.GeneralTree;
import tp1e8.Queue;
public class Resolver {
	public static boolean resolver(GeneralTree<Integer> arbol) {
		int nivel=1;
		int cant=0;
        Queue<GeneralTree<Integer>> queue = new Queue<GeneralTree<Integer>>();
        queue.enqueue(arbol);
        queue.enqueue(null);

        while (!queue.isEmpty()) {
            GeneralTree<Integer> tree_aux = queue.dequeue();
            if (tree_aux == null) {
                if (!queue.isEmpty()) {
                	if (cant!= nivel)return false;
                    queue.enqueue(null);
                    cant=0;
                    nivel++;
                }
            } else {
                cant++;
                List<GeneralTree<Integer>> children = tree_aux.getChildren();
                for (GeneralTree<Integer> child : children) {
                    queue.enqueue(child);
                }
            }
        }
        return(cant== nivel);
	}
}
