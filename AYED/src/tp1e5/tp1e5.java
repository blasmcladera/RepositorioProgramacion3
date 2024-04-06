package tp1e5;
import java.util.Random;
import java.util.Scanner;
public class tp1e5 {

	public static void main(String[] args) {
		Random aleatorio = new Random(System.currentTimeMillis());
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) a[i]=aleatorio.nextInt(101);
		for(int i=0;i<n;i++) System.out.print(a[i]+" ");
		int[] b = Calculo.returnA(a, n);
		System.out.println("");
		for(int i=0;i<3;i++) System.out.print(b[i]+" ");
		in.close();
	}

}
