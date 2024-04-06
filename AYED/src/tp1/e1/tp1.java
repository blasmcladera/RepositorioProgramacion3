package tp1.e1;
import java.util.Scanner;
public class tp1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		Cuenta.contarFor(a,b);
		in.close();
}
}
