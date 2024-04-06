package tp2e9;
import tp2.e1.BinaryTree;
public class Parcial3 {
	public BinaryTree<SumDif> sumAndDif(BinaryTree<Integer> a){
		if (a==null) return null;
		else {
			int sum=0,dif=0;
			BinaryTree<SumDif> b = new BinaryTree<SumDif>();
			sumAndDifRecursivo(a,b,sum,dif);
			return b;
		}
	}
	
	private static void sumAndDifRecursivo(BinaryTree<Integer> a,BinaryTree<SumDif> b,int sum,int dif) {
		if (!a.isEmpty()) {
			int sumat=sum+a.getData();
			SumDif s = new SumDif(sumat,a.getData()-dif);
			b.setData(s);
			
			if (a.hasLeftChild()) {
				b.addLeftChild(new BinaryTree<SumDif>());
				sumAndDifRecursivo(a.getLeftChild(),b.getLeftChild(),sumat,a.getData());
			}
			
			if (a.hasRightChild()) {
				b.addRightChild(new BinaryTree<SumDif>());
				sumAndDifRecursivo(a.getRightChild(),b.getRightChild(),sumat,a.getData());
			}
		}
	}
	
}





















