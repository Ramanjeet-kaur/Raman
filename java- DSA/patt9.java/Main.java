import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("pattern 9");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
			for(int i = 1; i<=n;i++){
			    for(int j=1 ;j<=n;j++)
			    
			    {
			        if((j==i) || (i+j==n+1))
			        {
			            System.out.print("* \t");
			        }
			        else{
			            System.out.print("\t");
			        }
			    }
			        System.out.println(" ");
			   }
			}
}
