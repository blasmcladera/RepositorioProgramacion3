package tp2e4;
import tp2.e1.BinaryTree;
public class RedBinariaLlena {
	public static int retardoReenvio(BinaryTree<Integer> a) {
		if (a==null||a.isEmpty()) return 0;
		else {
			if ((a.hasLeftChild())&&(a.hasRightChild())){
				if (retardoReenvio(a.getLeftChild())>retardoReenvio(a.getRightChild())) return a.getData()+retardoReenvio(a.getLeftChild());
				else return a.getData()+retardoReenvio(a.getRightChild());
			}
			else {
				if (a.hasLeftChild()) return a.getData()+retardoReenvio(a.getLeftChild());
				else return a.getData()+retardoReenvio(a.getRightChild());
			}
		}
	}
}
