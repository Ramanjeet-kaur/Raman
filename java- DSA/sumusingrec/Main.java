import java.util.*;
public class Main
{
    
    
    public static int addno(int n)
    {
        while(n==0){
            int sum = addno(n)+add(n-1);
        }
       
       return sum;
    }
    
	public static void main(String[] args) {
		System.out.println("fibbonaci using recursion");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(addno(n));
		
	}
}