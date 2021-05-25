import java.util.*;
public class Main
{
    
    
    public static int factorial(int n)
    {
        if(n==1){
            return 1;
        }
        int fnm1= factorial(n-1);
        int fc = n*fnm1;
         
         return fc;
    }
    
	public static void main(String[] args) {
		System.out.println("factorial using recursion");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fact = factorial(n);
		System.out.println(fact);
		
	}
}
