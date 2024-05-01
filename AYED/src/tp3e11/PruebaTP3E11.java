package tp3e11;
import GeneradorArboles.GeneradorGeneralTree;
import GeneralTree.GeneralTree;
public class PruebaTP3E11 {

	public static void main(String[] args) {
		GeneralTree<Integer> a = GeneradorGeneralTree.generarArbol(3, 3, 100);
		GeneradorGeneralTree.imprimirGeneralTree(a);
		System.out.println(Resolver.resolver(a));
	}

}
