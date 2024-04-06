package tp2e6;
import tp2.e1.BinaryTree;
import java.util.List;
import java.util.ArrayList;
public class Transformacion {
	private BinaryTree<Integer> b;
	
	public Transformacion(BinaryTree<Integer> b) {
		this.b=b;
	}
	
	public BinaryTree<Integer> suma(){
		List<Integer> l = new ArrayList<Integer>();
		sumaRecursiva(l,b);
		return b;
	}
	
	public static void sumaRecursiva(List<Integer> l,BinaryTree<Integer> a) {
		l.add(0);
		suma1(l,a);
		a.setData(l.get(0)-a.getData());
		l.clear();
		if (a.hasLeftChild()) sumaRecursiva(l,a.getLeftChild());
		if (a.hasRightChild()) sumaRecursiva(l,a.getRightChild());
	}
	
	public static void suma1(List<Integer> l,BinaryTree<Integer> b) {
		l.set(0,l.get(0)+b.getData());
		if (b.hasLeftChild()) suma1(l,b.getLeftChild());
		if (b.hasRightChild()) suma1(l,b.getRightChild());
	}
}
