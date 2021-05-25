import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Print largest of three number");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to Check:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if((x>y)&&(x>z))
		System.out.println(" x is largest");
		else if((y>x)&&(y>z))
		System.out.println(" y is largest");
		else 
		System.out.println(" z is largest");
		
	}
}
