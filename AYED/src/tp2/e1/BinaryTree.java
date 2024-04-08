package tp2.e1;
import tp1e8.Queue;
//Ejercicio 1
public class BinaryTree<T> {
	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;

	public BinaryTree() {
	}
	
	public BinaryTree(T data) {
		this.data=data;
		leftChild=null;
		rightChild=null;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data=data;
	}
	
	public BinaryTree<T> getLeftChild(){
		return leftChild;
	}
	
	public BinaryTree<T> getRightChild(){
		return rightChild;
	}
	
	public void addLeftChild(BinaryTree<T> child) {
		leftChild=child;
	}
	
	public void addRightChild(BinaryTree<T> child) {
		rightChild=child;
	}
	
	public void removeLeftChild() {
		leftChild=null;
	}
	
	public void removeRightChild() {
		rightChild=null;
	}
	
	public boolean isEmpty() {
		return (data==null);
	}
	
	public boolean isLeaf() {
		return ((rightChild==null)&&(leftChild==null));
	}
	
	public boolean hasLeftChild() {
		return (!(leftChild==null));
	}
	
	public boolean hasRightChild() {
		return (!(rightChild==null));
	}
//Ejercicio 2
	
	public int contarHojas() {
		int c=0;
		if (this.isLeaf()) return 1;
		else 
		{
			if (this.hasLeftChild()) c+=this.leftChild.contarHojas();
			if (this.hasRightChild()) c+=this.rightChild.contarHojas();
		}
		return c;
	}
	
	public BinaryTree<T> espejo(){
		BinaryTree<T> aux = new BinaryTree<T>(this.getData());
		if (this.hasLeftChild()&&this.hasRightChild())
		{
			aux.addLeftChild(this.getRightChild().espejo());
			aux.addRightChild(this.getLeftChild().espejo());
		}
		else
		{
			if (this.hasLeftChild()) 
			{
				this.addRightChild(this.leftChild);
				this.removeLeftChild();
				this.getRightChild().espejo();
			}
			if (this.hasRightChild()) 
			{
				this.addLeftChild(this.rightChild);
				this.removeRightChild();
				this.getLeftChild().espejo();
			}
		
		}
		return aux;
	}
	
	public void preOrden () {
		System.out.println(this.getData());
		if (this.hasLeftChild()) this.getLeftChild().preOrden();
		if (this.hasRightChild()) this.getRightChild().preOrden();
	}
	
	public void printNiveles() {
	   	 BinaryTree<T> ab = null;
	   	 Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
	   	 cola.enqueue(this);
	      cola.enqueue(null);
	   	 while (!cola.isEmpty()) {
	   		 ab = cola.dequeue();
	   		 if (ab != null) {
	   			 System.out.print(ab.getData()+" ");
	   			 if (ab.hasLeftChild()) {
	   				 cola.enqueue(ab.getLeftChild());
	   			 }
	   			 if (ab.hasRightChild()) {
	   				 cola.enqueue(ab.getRightChild());
	   			 }
	   		 } else if (!cola.isEmpty()) {
	   			 System.out.println();
	   			 cola.enqueue(null);
	   		 }
	   	 }
	    }
	
	public void entreNiveles(int n,int m) {
	   	 BinaryTree<T> ab = null;
	   	 int i=0;
	   	 Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
	   	 cola.enqueue(this);
	      cola.enqueue(null);
	   	 while (!cola.isEmpty()) {
	   		 ab = cola.dequeue();
	   		 if (ab != null) {
	   			 if ((i>=n) && (i<=m))System.out.print(ab.getData()+" ");
	   			 if (ab.hasLeftChild()) {
	   				 cola.enqueue(ab.getLeftChild());
	   			 }
	   			 if (ab.hasRightChild()) {
	   				 cola.enqueue(ab.getRightChild());
	   			 }
	   		 } else if (!cola.isEmpty()) {
	   			 i++;
	   			 System.out.println();
	   			 cola.enqueue(null);
	   		 }
	   	 }
	    }
}



















