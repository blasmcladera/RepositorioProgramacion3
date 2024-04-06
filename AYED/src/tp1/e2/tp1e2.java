package tp1.e2;
import java.util.Scanner;
public class tp1e2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese su numero:");
		int n = in.nextInt();
		int[] a = metodo.arregloN(n);
		for (int i =0;i<n;i++) System.out.println(a[i]);
		in.close();
	}
}