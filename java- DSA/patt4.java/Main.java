import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("pattern 4");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sp=1;
		int st =n;
		for(int i = n;i>=1;i--){
		    for(int j=1;j<=sp;j++){
		        System.out.print("\t");
		    }
		    for(int j=1;j<=st;j++){
		        System.out.print("*\t");
		    }
		    sp++;
		    st--;
		    System.out.println(" ");
		}
		
		
	}
}
