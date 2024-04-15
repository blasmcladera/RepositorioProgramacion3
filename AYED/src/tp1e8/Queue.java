package tp1e8;
import java.util.List;
import java.util.ArrayList;
public class Queue<T> extends Sequence{
	protected List<T> data;
	public Queue() {
		super();
		data = new ArrayList<T>();
	}
	public void enqueue (T a) {
		data.add(0,a);
	}
	public T dequeue () {
		return data.remove(data.size()-1);
	}
	public T head(){
		return data.get(data.size()-1);
	}
	public boolean isEmpty(){
		return data.isEmpty();
	}
	public int size() {
		return data.size();
	}
	@Override
	public String toString() {
		String s ="";
		for (int i=0;i<data.size();i++) s+=data.get(i).toString();
		return s;
	}
}
