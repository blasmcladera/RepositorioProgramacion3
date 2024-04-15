package GeneradorArboles;
import java.util.Random;
import java.util.List;
import GeneralTree.GeneralTree;

public class GeneradorGeneralTree {
    public static GeneralTree<Integer> generarArbol(int n, int i, int max) {
        return generarArbolRecursivo(n, i, 0,max);
    }

    private static GeneralTree<Integer> generarArbolRecursivo(int n, int i, int nivel, int max) {
        if (nivel >= n) {
            return null;
        }

        Random random = new Random();
        GeneralTree<Integer> arbol = new GeneralTree<>(random.nextInt(max));

        int numHijos = random.nextInt(i + 1);
        for (int j = 0; j < numHijos; j++) {
            GeneralTree<Integer> hijo = generarArbolRecursivo(n, i, nivel + 1,max);
            if (hijo != null) {
                arbol.addChild(hijo);
            }
        }

        return arbol;
    }

    public static void imprimirGeneralTree(GeneralTree<Integer> arbol) {
        imprimirNodo(arbol, "", true);
    }

    private static void imprimirNodo(GeneralTree<Integer> nodo, String prefijo, boolean esUltimo) {
        System.out.println(prefijo + (esUltimo ? "└── " : "├── ") + nodo.getData());
        List<GeneralTree<Integer>> hijos = nodo.getChildren();
        for (int i = 0; i < hijos.size() - 1; i++) {
            imprimirNodo(hijos.get(i), prefijo + (esUltimo ? "    " : "│   "), false);
        }
        if (hijos.size() > 0) {
            imprimirNodo(hijos.get(hijos.size() - 1), prefijo + (esUltimo ?"    " : "│   "), true);
        }
    }
}
