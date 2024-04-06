package tp1e9;

public class pruebaBalanceo {
	public static void main(String[] args) {
		String s = "{[()]([])}";
		if (testBalanceo.balanceado(s)) System.out.println("Esta balanceado.");
		else System.out.println("No esta balanceado.");

}
}
