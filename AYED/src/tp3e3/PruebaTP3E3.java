package tp3e3;
import GeneralTree.GeneralTree;
import GeneradorArboles.GeneradorGeneralTree;
public class PruebaTP3E3 {

	public static void main(String[] args) {
		GeneralTree<Integer> a = GeneradorGeneralTree.generarArbol(3, 2, 100);
		GeneradorGeneralTree.imprimirGeneralTree(a);
		System.out.println(a.ancho());
	}

}
