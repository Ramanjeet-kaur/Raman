import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("pattern 6");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int st=n/2+1;
		int sp = 1;
			for(int i =1; i<=n;i++)
		{
		    //System.out.print(st+"," +sp+"," +st);
		   for(int j=1;j<=st;j++){
		        System.out.print("* \t");
		   }
		    for(int j=1;j<=sp;j++){
		        System.out.print(" \t");
		    }
		     for(int j=1;j<=st;j++){
		        System.out.print(" *\t");
		    }
		    if(i<=n/2)
		    {
		        st--;
		        sp+=2;
		    }
		    else
		    {
		        st++;
		        sp-=2;
		    }
		    System.out.println(" ");
		}
		
	}
}



