package tp2e9;
import GeneradorArboles.generadorArboles;
import tp2.e1.BinaryTree;

public class PruebaTP2E9 {

	public static void main(String[] args) {
		BinaryTree<Integer> b = generadorArboles.generarArbol(4);
		Parcial3 p = new Parcial3();
		p.sumAndDif(b).printNiveles();
	}
}
