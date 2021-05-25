import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("pattern 15");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); 
		int sp = n/2;
		int np = 1;
		int val = 1;
			for(int i = 1; i<=n;i++)
			{
			    for(int j =1;j<=sp;j++)
			        {
			             System.out.print("\t");
			         }
			    int cval = val;
			    for(int j =1; j<= np;j++)
			    {
			        System.out.print(cval +"\t");
			        if(j <= np/2)
			    {
			        cval++;
			    }
			    else{
			        cval--;
			    }
			    }
			    if(i<=n/2)
			    {
			        sp--;
			        np+=2;
			        val++;
			    }
			    else{
			        sp++;
			        np-=2;
			        val--;
			    }
			 
			    System.out.println(" ");
			}
	}
	
}	

