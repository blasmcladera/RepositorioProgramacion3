package tp1e7;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class ejercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Random aleatorio = new Random(System.currentTimeMillis());
		int[] v=new int[2];
		for (int i=0;i<2;i++) v[i]=aleatorio.nextInt(101);
		TestArrayList.proceso(v);
		TestArrayList.procesoEstudiantes();
		List<Integer> l = new ArrayList<Integer>();
		System.out.println("Ingrese enteros, finalice con -1: ");
		int n = in.nextInt();
		while (n!=-1)
		{
			l.add(n);
			n=in.nextInt();
		}
		System.out.println("Es capicua:"+TestArrayList.procesoCapicua((ArrayList<Integer>)l));
		in.close();
	}
}
