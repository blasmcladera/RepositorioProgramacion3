package tp1e9;
import java.util.ArrayList;
import java.util.List;
public class testBalanceo {
	public static boolean balanceado (String s) {
		if (s.isEmpty()) return false;
		List<Character> l = new ArrayList<Character>();
		int n = s.length();
		for (int i=0;i<n;i++) {
			if ((s.charAt(i)=='{')||(s.charAt(i)=='[')||(s.charAt(i)=='('))
			{
				l.add(s.charAt(i));
			}
			else
			{
				switch(s.charAt(i))
				{
				case '}':
					if ((l.isEmpty())||(l.remove(l.size()-1)!='{')) return false;
					break;
				case ']':
					if ((l.isEmpty())||(l.remove(l.size()-1)!='[')) return false;
					break;
				case ')':
					if ((l.isEmpty())||(l.remove(l.size()-1)!='(')) return false;
					break;
				}
			}
		}
		return l.isEmpty();
		
}
}