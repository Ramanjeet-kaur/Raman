
import java.util.*;
public class Main

{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int inv=0;
		int opos =1;
		while(n!=0)
		{
		    int odig=n%10;
		    int invdig = opos;
		    int invpos = odig;
		    
		    inv = inv + invdig*(int)Math.pow(10,invpos-1);
		    n=n/10;
		    opos++;
		}
			System.out.println(inv);
	}
}


