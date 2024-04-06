package tp2e7;
import tp2.e1.BinaryTree;
import java.util.List;
import java.util.ArrayList;
public class Parcial1 {
	private BinaryTree<Integer> a;
	
	public Parcial1(BinaryTree<Integer> a) {
		this.a=a;
	}
	
	public boolean isLeftTree (int num) {
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(0);
		buscarNum(num,a,l2);
		return (l2.get(0)==1);
	}
	
	private static void buscarNum(int num, BinaryTree<Integer> a,List<Integer> l2) {
		if (a!=null) {
		if (a.getData()==num) {
			System.out.println("Se encontro el numero.");
			List<Integer> l = new ArrayList<Integer>();
			int i=0;int d=0;
			if (a.hasLeftChild()) {
				l.add(0);
				suma(a.getLeftChild(),l);
				i=l.get(0);
				l.clear();
			}
			else i=-1;
			if (a.hasRightChild()) {
				l.add(0);
				suma(a.getRightChild(),l);
				d=l.get(0);
				l.clear();
			}
			else d=-1;
			System.out.println(i);
			System.out.println(d);
			if (i>d) l2.set(0,1);
		}
		else {
			if (a.hasLeftChild()) buscarNum(num,a.getLeftChild(),l2);
			if (a.hasRightChild()) buscarNum(num,a.getRightChild(),l2);	
		}
	}
	}
	
	private static void suma(BinaryTree<Integer> a,List<Integer> l) {
		if (a.hasLeftChild()&&(!a.hasRightChild())) {
			l.set(0, l.get(0)+1);
			suma(a.getLeftChild(),l);
		}
		else {
			if (a.hasRightChild()&&(!a.hasLeftChild())) {
				l.set(0, l.get(0)+1);
				suma(a.getRightChild(),l);
			}
			else {
				if (!a.isLeaf()) {
					suma(a.getLeftChild(),l);
					suma(a.getRightChild(),l);
				}
			}
		}
		
	}
}
