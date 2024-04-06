package tp2e6;

import tp2.e1.BinaryTree;

public class PracticaTP2E6 {

	public static void main(String[] args) {
		BinaryTree<Integer> b = new BinaryTree<Integer>(1);
		BinaryTree<Integer> hi = new BinaryTree<Integer>(2);
		BinaryTree<Integer> hd = new BinaryTree<Integer>(3);
		BinaryTree<Integer> hid = new BinaryTree<Integer>(4);
		BinaryTree<Integer> hdi = new BinaryTree<Integer>(5);
		BinaryTree<Integer> hdd = new BinaryTree<Integer>(6);
		BinaryTree<Integer> hdii = new BinaryTree<Integer>(7);
		BinaryTree<Integer> hdid = new BinaryTree<Integer>(8);
		b.addLeftChild(hi);
		b.addRightChild(hd);
		b.getLeftChild().addRightChild(hid);
		b.getRightChild().addLeftChild(hdi);
		b.getRightChild().addRightChild(hdd);
		b.getRightChild().getLeftChild().addLeftChild(hdii);
		b.getRightChild().getLeftChild().addRightChild(hdid);
		Transformacion t = new Transformacion(b);
		t.suma().preOrden();

	}

}
