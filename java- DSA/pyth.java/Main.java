import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println(" pythgorean triplet");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int max=a;
		    if(b >= max)
		    {
		        max=b;
		    }
		    if(c >= max)
		    {
		         max=c;
		    }
		    if (max == a)
		    {
		        boolean check = ((b * b + c * c) == (a * a));
		        System.out.println(check);
		    }
		    else if (max == b)
		    {
		        
		        boolean check = ((a * a + c * c) == (b * b));
		        System.out.println(check);
		    }
		    else
		     {
		        boolean check = ((a * a + b * b) == (c * c));
		        System.out.println(check);
		    }
		
	}
}
