import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("print numbers till N");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number till you want print:");
		int n = sc.nextInt();
		int i = 1;
		while(i<=n)
		{
		    System.out.println(i);
		    i++;
		}
		
	}
}
