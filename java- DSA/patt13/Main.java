import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("pattern 13");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	    int a=0;
		int b=1;
		int c;
			for(int i = 0; i<n ; i++)
			 { 
			     int iCj = 1;
			     for(int j = 0; j <= i;j++)
			{    System.out.print(iCj+"\t");
			    int iCjp1=iCj*(i-j)/(j+1);
			    iCj= iCjp1;
			}
			System.out.println(" ");
			 }
			
	}
}	