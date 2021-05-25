import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("subarray");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = scn.nextInt();
		int[] a = new int[n];
		System.out.println("Enter  array:");
		for(int i = 0;i < a.length;i++)
		{
		    a[i] = scn.nextInt();
		}
	        System.out.println("subarray of array:");	
			for(int i = 0;i < a.length;i++){
			    for(int j = 0;j < a.length;j++){
			        for(int k = i;k <= j;k++){
			            System.out.print(a[k] + "\t");
			        }
			    
			        System.out.println(" ");
			    }
			    
			}
		
	}
}
