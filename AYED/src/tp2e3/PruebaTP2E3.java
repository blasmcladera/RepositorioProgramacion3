package tp2e3;

import tp2.e1.BinaryTree;

public class PruebaTP2E3 {

	public static void main(String[] args) {
		BinaryTree<Integer> b = new BinaryTree<Integer>(1);
		BinaryTree<Integer> hi = new BinaryTree<Integer>(2);
		BinaryTree<Integer> hd = new BinaryTree<Integer>(3);
		BinaryTree<Integer> hii = new BinaryTree<Integer>(4);
		BinaryTree<Integer> hid = new BinaryTree<Integer>(5);
		BinaryTree<Integer> hdi = new BinaryTree<Integer>(6);
		BinaryTree<Integer> hdd = new BinaryTree<Integer>(7);
		b.addLeftChild(hi);
		b.addRightChild(hd);
		b.getLeftChild().addLeftChild(hii);
		b.getLeftChild().addRightChild(hid);
		b.getRightChild().addLeftChild(hdi);
		b.getRightChild().addRightChild(hdd);
		System.out.println(ContadorArbol.numerosParesPre(b).toString());
		System.out.println(ContadorArbol.numerosParesPost(b).toString());
		System.out.println(ContadorArbol.numerosParesIn(b).toString());

	}

}
