package GeneralTree;
import java.util.LinkedList;
import java.util.List;
import tp1e8.Queue;
public class GeneralTree<T> {
	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>();
	
	public GeneralTree() {
		
	}
	
	public GeneralTree(T data){
		this.data=data;
	}
	
	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this.data=data;
		if (children != null)this.children=children;
	}
	
	public T getData(){
		return data;
	}
	
	public void setData(T data) {
		this.data=data;
	}
	
	public List<GeneralTree<T>> getChildren(){
		return children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)this.children=children;
		//esto es para no "vaciar" la lista si llega null
	}
	
	public void addChild(GeneralTree<T> a) {
		this.children.add(a);
	}
	
	public void removeChild(GeneralTree<T> a) {
		children.remove(a);//si no lo contiene no pasa nada
	}
	
	public boolean hasChildren() {
		return (!children.isEmpty());
	}
	
	public boolean isLeaf() {
		return (children.isEmpty());
	}
	
	public boolean isEmpty() {
		return (data==null && !this.hasChildren());
	}
	
	public List<T> traversalLevel() {
		List<T> result = new LinkedList<T>();
		GeneralTree<T> tree_aux;
		Queue<GeneralTree<T>> queue = new Queue<GeneralTree<T>>();
		queue.enqueue(this);
		while (!queue.isEmpty()) {
			tree_aux = queue.dequeue();
			result.add(tree_aux.getData());
			List<GeneralTree<T>> children = tree_aux.getChildren();
			for (GeneralTree<T> child: children) {
					queue.enqueue(child);
			}
		}
		return result;
	}
	
	public int altura() {
		List<Integer> l = new LinkedList<Integer>();
		l.add(0);
		alturaRecursivo(this,l,0);
		return l.remove(0);
	}
	
	private void alturaRecursivo(GeneralTree<T> a,List<Integer> l,int n) {
		if (n>l.get(0)) l.set(0, n);
		if (a.hasChildren()){
			List<GeneralTree<T>> children = a.getChildren();
			for (GeneralTree<T> child : children) {
				alturaRecursivo(child,l,n+1);
			}
		}
	}
	
	public int nivel (T n) {
		List<Integer> l = new LinkedList<Integer>() ;
		l.add(0);
		nivelRecursivo(this,0,n,l);
		return l.remove(0);
	}
	
	private void nivelRecursivo (GeneralTree<T> a, int b, T n,List<Integer> l) {
		if (a.getData()==n) l.set(0,b);
		else {
		if (a.hasChildren()){
			List<GeneralTree<T>> children = a.getChildren();
			for (GeneralTree<T> child : children) {
				nivelRecursivo(child,b+1,n,l);
			}
		}
		}
	}
	
	public int ancho() {
        List<T> result = new LinkedList<T>();
        Queue<GeneralTree<T>> queue = new Queue<GeneralTree<T>>();
        queue.enqueue(this);
        queue.enqueue(null);

        while (!queue.isEmpty()) {
            GeneralTree<T> tree_aux = queue.dequeue();
            if (tree_aux == null) {
                if (!queue.isEmpty()) {
                    queue.enqueue(null);
                    result.add(null);
                }
            } else {
                result.add(tree_aux.getData());
                List<GeneralTree<T>> children = tree_aux.getChildren();
                for (GeneralTree<T> child : children) {
                    queue.enqueue(child);
                }
            }
        }
        result.add(null);
        int cant=0;
        int cantmax=-1;
        for (int i=0;i<result.size();i++) {
        	if (result.get(i)!=null){
        		cant++;
        	}
        	else {
        		if (cant>cantmax)cantmax=cant;
        		cant=0;
        	}
        }
        result.clear();
        return cantmax;
    }
	public boolean esAncestro(T a,T b) {
		List<GeneralTree<T>> l = new LinkedList<GeneralTree<T>>();
		l.add(null);
		buscar(a,l);
		if (l.get(0)==null) return false;
		else {
			GeneralTree<T> aux = l.get(0);
			l.set(0, null);
			aux.buscar(b, l);
			return (l.remove(0)!=null);
		}
	}
	
	private void buscar(T a, List<GeneralTree<T>> l) {
		if (data==a) l.set(0,this);
		else {
			List<GeneralTree<T>> child1 = children;
            for (GeneralTree<T> c1 : child1) {
                c1.buscar(a,l);
		}
	}
	}
}
