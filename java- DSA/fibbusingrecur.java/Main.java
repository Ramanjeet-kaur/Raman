import java.util.*;
public class Main
{
    
    
    public static int fib(int count)
    {
        if( count <= 1){
            return count;
        }
       
       return fib(count - 1) + fib( count -2);
    }
    
	public static void main(String[] args) {
		System.out.println("fibbonaci using recursion");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = n-1; i>= 0;i--){
		System.out.println(fib(i));
		}
	}
}

