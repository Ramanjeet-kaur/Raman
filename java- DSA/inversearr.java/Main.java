import java.io.*;
import java.util.*;
public class Main
{
    public static int[] inverse(int[]a){
	    int[] inv = new int[a.length];
	    for(int i=0;i<a.length;i++){
	       int v = a[i];
	       inv[v] = i;
	    }
	  
	    return inv;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Inverse an array");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = scn.nextInt();
		int[] a = new int[n];
		System.out.println("Enter  array:");
		for(int i = 0;i < a.length;i++)
		{
		    a[i] = scn.nextInt();
		}
		
	            System.out.println("inversed array:");
	            int[] inv = inverse(a);
			    for(int val : inv)
			        {
			            System.out.println(val);
			        }
			   
	}
}