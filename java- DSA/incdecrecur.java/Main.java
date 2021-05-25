import java.util.*;
public class Main
{
    
    
    public static void printincdec(int n)
    {
        if(n==0){
            return;
        }
        System.out.println(n);
        printincdec(n-1);
        System.out.println(""); 
        System.out.println(n);
         
    }
    
	public static void main(String[] args) {
		System.out.println("print increasing using recursion");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printincdec(n);
	}
}
