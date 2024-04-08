package tp2e5;
import GeneradorArboles.generadorArboles;
import tp2.e1.BinaryTree;
public class PruebaTP2E5 {

	public static void main(String[] args) {
		BinaryTree<Integer> b = generadorArboles.generarArbol(4);
		ProfundidadDeArbolBinario p = new ProfundidadDeArbolBinario(b);
		b.printNiveles();
		System.out.println("\n"+p.sumaElementosProfundidad(2));
	}

}
