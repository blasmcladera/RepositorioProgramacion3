package tp3e7;
import GeneradorArboles.GeneradorGeneralTree;
public class PruebaTP3E7 {

	public static void main(String[] args) {
		Caminos a = new Caminos(GeneradorGeneralTree.generarArbol(7,2,100));
		GeneradorGeneralTree.imprimirGeneralTree(a.getArbol());
		System.out.println(a.caminoAHojaMasLejana().toString());
	}

}
