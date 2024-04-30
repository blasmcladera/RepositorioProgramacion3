package tp3e9;
import GeneradorArboles.GeneradorGeneralTree;
import GeneralTree.GeneralTree;
public class PruebaTP3E9 {
	public static void main (String[] args) {
	GeneralTree<Integer> a = GeneradorGeneralTree.generarArbol(3, 3, 3);
	GeneradorGeneralTree.imprimirGeneralTree(a);
	System.out.println(Seleccion.esDeSeleccion(a));
	}
}
