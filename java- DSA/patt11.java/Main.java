import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("pattern 11");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	    int val=1;
			for(int i = 1; i<=n;i++)
	        {
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print( val +"\t");
	                val++;
	            }
	            System.out.println(" ");
	        }
	}
}	