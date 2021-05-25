import java.util.*;
public class Main
{
 public static int digfreq(int n, int d)
      {
            int dc = 0;
            while(n>0)
		     {
		        int r = n % 10;
		        n = n/10;
		        if(r==d)
		        
		            {
		                dc++;
		             }
		     }
		    return dc;
        }
 public static void main(String[] args) {
		System.out.println("function:digit frequency");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();
        int df = digfreq(n,d);
		System.out.println(df);
	}
}
