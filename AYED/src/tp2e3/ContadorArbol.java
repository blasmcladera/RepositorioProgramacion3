package tp2e3;
import java.util.List;
import java.util.ArrayList;
import tp2.e1.BinaryTree;
public class ContadorArbol {
	public static List<Integer> numerosParesPre(BinaryTree<Integer> b){
		List<Integer> l= new ArrayList<Integer>();
		numerosParesRecursivoPre(b,(ArrayList<Integer>)l);
		return l;
	}
	
	public static void numerosParesRecursivoPre(BinaryTree<Integer> b, ArrayList<Integer> l) {
		if ((b.getData()%2)==0) l.add(b.getData());
		if (b.hasLeftChild()) numerosParesRecursivoPre(b.getLeftChild(),l);
		if (b.hasRightChild()) numerosParesRecursivoPre (b.getRightChild(),l);
	}
	
	public static List<Integer> numerosParesPost(BinaryTree<Integer> b){
		List<Integer> l= new ArrayList<Integer>();
		numerosParesRecursivoPost(b,(ArrayList<Integer>)l);
		return l;
	}
	
	public static void numerosParesRecursivoPost(BinaryTree<Integer> b, ArrayList<Integer> l) {
		if (b.hasLeftChild()) numerosParesRecursivoPost(b.getLeftChild(),l);
		if (b.hasRightChild()) numerosParesRecursivoPost (b.getRightChild(),l);
		if ((b.getData()%2)==0) l.add(b.getData());
	}
	
	public static List<Integer> numerosParesIn(BinaryTree<Integer> b){
		List<Integer> l= new ArrayList<Integer>();
		numerosParesRecursivoIn(b,(ArrayList<Integer>)l);
		return l;
	}
	
	public static void numerosParesRecursivoIn(BinaryTree<Integer> b, ArrayList<Integer> l) {
		if (b.hasLeftChild()) numerosParesRecursivoIn(b.getLeftChild(),l);
		if ((b.getData()%2)==0) l.add(b.getData());
		if (b.hasRightChild()) numerosParesRecursivoIn(b.getRightChild(),l);
	}
}
