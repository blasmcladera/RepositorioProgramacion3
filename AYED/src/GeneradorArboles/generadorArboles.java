package GeneradorArboles;
import tp2.e1.BinaryTree;
import java.lang.Math;
public class generadorArboles {
	public static BinaryTree<Integer> generarArbol(int n) {
		BinaryTree<Integer> a = new BinaryTree<Integer>();
		a.setData((int)(Math.random()*100));
		a.addLeftChild(new BinaryTree<Integer>());
		a.addRightChild(new BinaryTree<Integer>());
		for (int i=1;i<n;i++) {
			estatico(a.getLeftChild(),i,n);
			estatico(a.getRightChild(),i,n);
		}
		return a;
	}
	
	private static void estatico(BinaryTree<Integer> a,int i, int n) {
		if (a.isEmpty()) {
			a.setData((int)(Math.random()*100));
		}
		if (a.isLeaf()&&(i<n-1)) {
			a.addLeftChild(new BinaryTree<Integer>());
			a.addRightChild(new BinaryTree<Integer>());
		}
		else {
			if (a.hasLeftChild()) {
				estatico(a.getLeftChild(),i,n);
			}
			if (a.hasRightChild()) {
				estatico(a.getRightChild(),i,n);
			}
		}
	}
}
