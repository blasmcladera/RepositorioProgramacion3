package tp2e9;

public class SumDif {
	private int sum;
	private int dif;
	
	public int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public int getDif() {
		return dif;
	}
	
	public void setDif(int dif) {
		this.dif = dif;
	}

	public SumDif(int sum, int dif) {
		this.sum = sum;
		this.dif = dif;
	}
	
	public String toString() {
		String s = ("["+sum+"|"+dif+"]");
		return s;
	}
}
