package tp1e7;
import java.util.ArrayList;
import java.util.List;
public class TestArrayList {

	public static void proceso (int v[]) 
	{
		List<Integer> l=new ArrayList<Integer>();
		int n=v.length;
		for (int i=0;i<n;i++) l.add(v[i]);
		while(!l.isEmpty())
		{
			System.out.println(l.get(0));
			l.remove(0);
		}	
	}
	
	public static void procesoEstudiantes ()
	{
		List<Estudiante> l1 = new ArrayList<Estudiante>();
		Estudiante e1 = new Estudiante("pepe","papa",1,"pepegmail","22 64");
		Estudiante e2 = new Estudiante("meme","mama",2,"memegmail","23 65");
		Estudiante e3 = new Estudiante("gege","gaga",3,"gegegmail","24 66");
		l1.add(e1);l1.add(e2);l1.add(e3);
		List<Estudiante> l2 = new ArrayList<Estudiante>(l1);
		for (int i=0;i<3;i++) System.out.println(l1.get(i).toString());
		for (int i=0;i<3;i++) System.out.println(l2.get(i).toString());
		e1.setApellido("Cladera");
		e2.setEmail("GMAILLLLL");
		e3.setComision(88);
		for (int i=0;i<l1.size();i++) System.out.println(l1.get(i).toString());
		for (int i=0;i<l2.size();i++) System.out.println(l2.get(i).toString());
		Estudiante e4 = new Estudiante("gege","gaga",3,"holaaa","24 66");
		if (l1.contains(e4)) System.out.println("Ya se encuentra en la lista");
		else
		{
			System.out.println("No se encuentra en la lista");
			l1.add(e4);
		}
		for (int i=0;i<l1.size();i++) System.out.println(l1.get(i).toString());
		for (int i=0;i<l2.size();i++) System.out.println(l2.get(i).toString());
	}
	public static boolean procesoCapicua(ArrayList<Integer> l) {
		int n = l.size();
		int i;
		for (i=0;i<n;i++,n--)
		{
			if (l.get(i)!=l.get(n-1)) break;
		}
		return (i<n)? false:true;
	}
}

