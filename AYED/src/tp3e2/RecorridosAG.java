package tp3e2;
import java.util.List;
import java.util.LinkedList;
import GeneralTree.GeneralTree;
import tp1e8.Queue;

public class RecorridosAG {
	
	public  List<Integer> numerosImparesMayoresPreOrden(GeneralTree<Integer> a,Integer n){
		List<Integer> l = new LinkedList<Integer>();
		numerosImparesMayoresPreOrdenRecursivo(a,n,l);
		return l;
	}
	
	private static void numerosImparesMayoresPreOrdenRecursivo(GeneralTree<Integer> a,Integer n,List<Integer> l) {
		if (a.getData()>n && a.getData()%2==1) l.add(a.getData());
		List<GeneralTree<Integer>> aux = a.getChildren();
		for (GeneralTree<Integer> b: aux) numerosImparesMayoresPreOrdenRecursivo(b,n,l);
	}
	
	public List<Integer> numerosImparesMayoresPostOrden(GeneralTree<Integer> a,Integer n){
		List<Integer> l = new LinkedList<Integer>();
		numerosImparesMayoresPostOrdenRecursivo(a,n,l);
		return l;
	}

	private static void numerosImparesMayoresPostOrdenRecursivo(GeneralTree<Integer> a,Integer n,List<Integer> l) {
		List<GeneralTree<Integer>> aux = a.getChildren();
		for (GeneralTree<Integer> b: aux) numerosImparesMayoresPostOrdenRecursivo(b,n,l);
		if (a.getData()>n && a.getData()%2==1) l.add(a.getData());
	}
	
	public List<Integer> numerosImparesMayoresPorNiveles(GeneralTree<Integer> a,Integer n) {
        List<Integer> result = new LinkedList<Integer>();
        Queue<GeneralTree<Integer>> queue = new Queue<GeneralTree<Integer>>();
        queue.enqueue(a);
        queue.enqueue(null);

        while (!queue.isEmpty()) {
            GeneralTree<Integer> tree_aux = queue.dequeue();
            if (tree_aux == null) {
                if (!queue.isEmpty()) {
                    queue.enqueue(null);
                    result.add(null);
                }
            } else {
                result.add(tree_aux.getData());
                List<GeneralTree<Integer>> children = tree_aux.getChildren();
                for (GeneralTree<Integer> child : children) {
                    queue.enqueue(child);
                }
            }
        }
        for (int i=0;i<result.size();i++) {
        	if (result.get(i)==null) {
        		result.remove(i);
        		i--;
        	}
        	else {
        		if (!(result.get(i)>n && result.get(i)%2==1)) {
        			result.remove(i);
        			i--;
        		}
        	}
        }
        return result;
    }
}
