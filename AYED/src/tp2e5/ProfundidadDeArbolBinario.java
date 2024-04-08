package tp2e5;
import tp1e8.Queue;
import tp2.e1.BinaryTree;
public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> a;
	
	public ProfundidadDeArbolBinario(BinaryTree<Integer> a) {
		this.a=a;
	}
	
	public int sumaElementosProfundidad (int p) {
		 int aux=0;
	   	 BinaryTree<Integer> ab = null;
	   	 int i=0;
	   	 Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
	   	 cola.enqueue(a);
	      cola.enqueue(null);
	   	 while (!cola.isEmpty()) {
	   		 ab = cola.dequeue();
	   		 if (ab != null) {
	   			 if (i<=p)aux+=ab.getData();
	   			 if (ab.hasLeftChild()) {
	   				 cola.enqueue(ab.getLeftChild());
	   			 }
	   			 if (ab.hasRightChild()) {
	   				 cola.enqueue(ab.getRightChild());
	   			 }
	   		 } else if (!cola.isEmpty()) {
	   			 i++;
	   			 cola.enqueue(null);
	   		 }
	   	 }
	   	 return aux;
	    }
}
