package tp2e7;

import tp2.e1.BinaryTree;

public class PruebaTP2E7 {

	public static void main(String[] args) {
		BinaryTree<Integer> b = new BinaryTree<Integer>(2);
		cargar(b);
		Parcial1 p = new Parcial1(b);
		System.out.println(p.isLeftTree(-5));
	}
	private static void cargar(BinaryTree<Integer> b) {
		BinaryTree<Integer> hi = new BinaryTree<Integer>(7);
		BinaryTree<Integer> hd = new BinaryTree<Integer>(-5);
		BinaryTree<Integer> hii = new BinaryTree<Integer>(23);
		BinaryTree<Integer> hid = new BinaryTree<Integer>(6);
		BinaryTree<Integer> hdi = new BinaryTree<Integer>(19);
		BinaryTree<Integer> hiii = new BinaryTree<Integer>(-3);
		BinaryTree<Integer> hidi = new BinaryTree<Integer>(55);
		BinaryTree<Integer> hidd = new BinaryTree<Integer>(11);
		BinaryTree<Integer> hdid = new BinaryTree<Integer>(4);
		BinaryTree<Integer> hdidi = new BinaryTree<Integer>(18);
		b.addLeftChild(hi);
		b.addRightChild(hd);
		b.getLeftChild().addLeftChild(hii);
		b.getLeftChild().addRightChild(hid);
		b.getRightChild().addLeftChild(hdi);
		b.getLeftChild().getLeftChild().addLeftChild(hiii);
		b.getLeftChild().getRightChild().addLeftChild(hidi);
		b.getLeftChild().getRightChild().addRightChild(hidd);
		b.getRightChild().getLeftChild().addRightChild(hdid);
		b.getRightChild().getLeftChild().getRightChild().addLeftChild(hdidi);;
	}
}
