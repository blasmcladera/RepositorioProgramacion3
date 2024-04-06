package tp2e8;

import tp2.e1.BinaryTree;

public class PruebaTP2E8 {

	public static void main(String[] args) {
		BinaryTree<Integer> b1 = new BinaryTree<Integer>(65);
		BinaryTree<Integer> b2 = new BinaryTree<Integer>(65);
		Parcial2 p = new Parcial2();
		System.out.println(p.esPrefijo(b1, b2)); 

	}
}

