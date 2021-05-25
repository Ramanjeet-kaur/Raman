import java.util.*;
//port java.io.*;
public class Main
{
    
    
    public static void printdecreasing(int n)
    {
        if(n==0){
            return;
        }
        System.out.println(n);
        printdecreasing(n-1);
    }
    
	public static void main(String[] args) {
		System.out.println("print decreasing using recursion");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printdecreasing(n);
	}
}