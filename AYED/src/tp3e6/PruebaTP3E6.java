package tp3e6;
import GeneradorArboles.GeneradorGeneralTree;
public class PruebaTP3E6 {

	public static void main(String[] args) {
		RedDeAguaPotable p = new RedDeAguaPotable();
		System.out.println(p.minimoCaudal(3000));
		GeneradorGeneralTree.imprimirGeneralTree(p.getArbol());
	}

}
