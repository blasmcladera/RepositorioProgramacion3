package tp3e5;
import GeneralTree.GeneralTree;
import GeneradorArboles.GeneradorGeneralTree;
import java.util.Scanner;
public class Pruebatp3e5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		GeneralTree<Integer> a = GeneradorGeneralTree.generarArbol(5, 3, 100);
		GeneradorGeneralTree.imprimirGeneralTree(a);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println(a.esAncestro(x,y));
		in.close();
	}

}
