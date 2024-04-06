package tp2e8;
import tp2.e1.BinaryTree;
public class Parcial2 {
	
	public boolean esPrefijo(BinaryTree<Integer> a1,BinaryTree<Integer> a2) {
		if ((a1==null || a1.isEmpty())) return true;
		else {
			if (a2==null || a2.isEmpty()) return false;
			else {
			if (a1.getData()==a2.getData()) {
				return (esPrefijo (a1.getLeftChild(),a2.getLeftChild())&&esPrefijo(a1.getRightChild(),a2.getRightChild()));
				}
		}
		}
		return false;
	}

}
