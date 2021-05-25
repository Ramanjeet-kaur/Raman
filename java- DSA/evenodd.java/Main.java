import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("program to check given no is odd or even");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = scn.nextInt();
		// check even odd 
		if (n%2==0)
		System.out.println("Number "+ n +" "+ "is even");
		else
		System.out.println("Number "+ n + " "+"is odd");
		
	}
}
