package GeneradorArboles;
import tp2.e1.BinaryTree;
import java.lang.Math;
public class generadorArboles {
	public static BinaryTree<Integer> generarArbolBinario(int n) {
		BinaryTree<Integer> a = new BinaryTree<Integer>();
		a.setData((int)(Math.random()*100));
		a.addLeftChild(new BinaryTree<Integer>());
		a.addRightChild(new BinaryTree<Integer>());
		for (int i=1;i<n;i++) {
			estaticoBinario(a.getLeftChild(),i,n);
			estaticoBinario(a.getRightChild(),i,n);
		}
		return a;
	}
	
	private static void estaticoBinario(BinaryTree<Integer> a,int i, int n) {
		if (a.isEmpty()) {
			a.setData((int)(Math.random()*100));
		}
		if (a.isLeaf()&&(i<n-1)) {
			a.addLeftChild(new BinaryTree<Integer>());
			a.addRightChild(new BinaryTree<Integer>());
		}
		else {
			if (a.hasLeftChild()) {
				estaticoBinario(a.getLeftChild(),i,n);
			}
			if (a.hasRightChild()) {
				estaticoBinario(a.getRightChild(),i,n);
			}
		}
	}
}
