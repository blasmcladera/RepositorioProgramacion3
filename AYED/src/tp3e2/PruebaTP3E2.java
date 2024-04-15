package tp3e2;
import GeneralTree.GeneralTree;
import GeneradorArboles.GeneradorGeneralTree;
public class PruebaTP3E2 {
	public static void main(String[] args) {
		GeneralTree<Integer> a = GeneradorGeneralTree.generarArbol(4,4,100);
		GeneradorGeneralTree.imprimirGeneralTree(a);
		RecorridosAG r = new RecorridosAG();
		System.out.println(r.numerosImparesMayoresPreOrden(a, 20).toString());
		System.out.println(r.numerosImparesMayoresPostOrden(a, 20).toString());
		System.out.println(r.numerosImparesMayoresPorNiveles(a, 20).toString());
	}
}
