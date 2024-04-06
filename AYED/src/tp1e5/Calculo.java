package tp1e5;
public class Calculo {
	public static int[] returnA (int[] A, int n)
	{
		int min=999;
		int max=-1;
		int t=0;
		for(int i=0;i<n;i++)
		{
			t+=A[i];
			if (A[i]<min) min=A[i];
			if (A[i]>max) max=A[i];
		}
		int[] b = new int[3];
		b[0]=min;
		b[1]=max;
		b[2]=(t/n);
		return b;
	}
}
