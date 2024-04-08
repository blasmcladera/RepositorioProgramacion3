package GeneralTree;
import java.util.LinkedList;
import java.util.List;

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
		this.children=children;
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
		//esto es para "vaciar" la lista si llega null
	}
	
	public void addChild(GeneralTree<T> a) {
		this.children.add(a);
	}
	
	public boolean isLeaf() {
		return (children.isEmpty());
	}
	
	public boolean isEmpty() {
		return (data==null);
	}
}
