/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("gcd,Lcm");
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int N1 = n1;
		int N2 = n2;
		while(n1%n2 != 0){
		    int r = n1%n2;
		    n1= n2;
		    n2 = r;
		}
		int gcd = n2;
		int lcm = (N1*N2)/gcd;
		System.out.println("gcd:"+gcd);
		System.out.println("lcm:"+lcm);
		
		    
		}
	}

