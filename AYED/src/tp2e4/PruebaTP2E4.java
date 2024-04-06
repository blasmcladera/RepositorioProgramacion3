package tp2e4;

import tp2.e1.BinaryTree;

public class PruebaTP2E4 {

	public static void main(String[] args) {
		BinaryTree<Integer> b = new BinaryTree<Integer>(10);
		cargar(b);
		System.out.println(RedBinariaLlena.retardoReenvio(b));
		b.preOrden();
	}

	private static void cargar(BinaryTree<Integer> b) {
	BinaryTree<Integer> hi = new BinaryTree<Integer>(2);
	BinaryTree<Integer> hd = new BinaryTree<Integer>(3);
	BinaryTree<Integer> hii = new BinaryTree<Integer>(5);
	BinaryTree<Integer> hid = new BinaryTree<Integer>(4);
	BinaryTree<Integer> hdi = new BinaryTree<Integer>(9);
	BinaryTree<Integer> hdd = new BinaryTree<Integer>(8);
	BinaryTree<Integer> hiii = new BinaryTree<Integer>(7);
	BinaryTree<Integer> hiid = new BinaryTree<Integer>(8);
	BinaryTree<Integer> hidi = new BinaryTree<Integer>(5);
	BinaryTree<Integer> hidd = new BinaryTree<Integer>(6);
	BinaryTree<Integer> hdii = new BinaryTree<Integer>(12);
	BinaryTree<Integer> hdid = new BinaryTree<Integer>(8);
	BinaryTree<Integer> hddi = new BinaryTree<Integer>(2);
	BinaryTree<Integer> hddd = new BinaryTree<Integer>(1);
	b.addLeftChild(hi);
	b.addRightChild(hd);
	b.getLeftChild().addLeftChild(hii);
	b.getLeftChild().addRightChild(hid);
	b.getRightChild().addLeftChild(hdi);
	b.getRightChild().addRightChild(hdd);
	b.getLeftChild().getLeftChild().addLeftChild(hiii);
	b.getLeftChild().getLeftChild().addRightChild(hiid);
	b.getLeftChild().getRightChild().addLeftChild(hidi);
	b.getLeftChild().getRightChild().addRightChild(hidd);
	b.getRightChild().getLeftChild().addLeftChild(hdii);
	b.getRightChild().getLeftChild().addRightChild(hdid);
	b.getRightChild().getRightChild().addLeftChild(hddi);
	b.getRightChild().getRightChild().addRightChild(hddd);
	}		
}
