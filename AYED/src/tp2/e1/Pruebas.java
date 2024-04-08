package tp2.e1;
import java.util.Scanner;
public class Pruebas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
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
		b.printNiveles();
		System.out.println("\n------------");
		b.entreNiveles(0, 3);
		in.close();
	}
}
