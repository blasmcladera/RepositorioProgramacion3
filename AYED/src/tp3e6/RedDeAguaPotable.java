package tp3e6;
import GeneralTree.GeneralTree;
import java.util.Random;
import java.util.List;
public class RedDeAguaPotable {
    private GeneralTree<Integer> redDeAgua;

    public RedDeAguaPotable() {
        redDeAgua = null;
    }
    
    public GeneralTree<Integer> getArbol(){
    	return redDeAgua;
    }
    // Método para asignar un valor a un padre y generar hijos con datos proporcionales
    private void asignarValorYGenerarHijos(int valorX) {
        if (redDeAgua == null) {
            redDeAgua = new GeneralTree<>(valorX); // Crear el árbol con el valorX como raíz
        } else {
            redDeAgua.getData(); // Se asume que el primer nodo es el padre
            redDeAgua.setData(valorX);
        }

        Random rand = new Random();
        int altura = rand.nextInt(4) + 1; // Altura aleatoria entre 1 y 4

        generarHijosRecursivos(redDeAgua, valorX, altura);
    }

    // Método auxiliar recursivo para generar hijos con datos proporcionales
    private void generarHijosRecursivos(GeneralTree<Integer> nodo, int valorPadre, int alturaRestante) {
        if (alturaRestante == 0) {
            return; // Caso base: no se generan más hijos
        }

        Random rand = new Random();
        int cantidadHijos = rand.nextInt(5); // Número aleatorio entre 0 y 5 para la cantidad de hijos

        // Generar hijos con datos proporcionales
        if (cantidadHijos > 0) {
            int dataHijo = valorPadre / cantidadHijos; // Datos proporcionales para cada hijo
            for (int i = 0; i < cantidadHijos; i++) {
                GeneralTree<Integer> hijo = new GeneralTree<>(dataHijo);
                nodo.addChild(hijo);
                generarHijosRecursivos(hijo, dataHijo, alturaRestante - 1); // Llamada recursiva con altura decreciente
            }
        }
    }

    public int minimoCaudal(int caudal) {
    	this.asignarValorYGenerarHijos(caudal);
    	GeneralTree<Integer> aux = new GeneralTree<Integer>(caudal+1);
    	calcularRecursivo(this.redDeAgua,aux);
    	return aux.getData();
    }
    
    private static void calcularRecursivo(GeneralTree<Integer> a,GeneralTree<Integer> aux) {
    		if (a.getData()<aux.getData()) aux.setData(a.getData());
    		List<GeneralTree<Integer>> child = a.getChildren();
    		for (GeneralTree<Integer> c : child) {
    			calcularRecursivo(c,aux);
    		}
    	}
    }

