import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("factorial");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fact = 1;
		for(int  i= 1; i<=n ; i++)
		 {
		  fact = fact * i;
		  }
		  		System.out.println(  "factorial of " + n + "=" + fact );
	}
}
