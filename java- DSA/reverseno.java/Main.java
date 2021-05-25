/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main

{
	public static void main(String[] args) 
	{
		System.out.println("reverse number");
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		while(n!=0)
		{
		    int d = n%10;
		    n = n/10;
		    System.out.println(d);
		
	     }
	    
	}
}