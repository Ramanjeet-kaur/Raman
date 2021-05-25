import java.io.*;
import java.util.*;
public class Main
{
	public static void reverse( int[] a,int i,int j){
	    int li = i;
	    int ri = j;
	    while(li<ri){
	    int temp=a[li];
		a[li] = a[ri];
		a[ri] = temp;
		li++;
	    ri--;
        }
	    
	}
	public static void rotate(int[]a,int r){
	    r = r % a.length;
	    while(r<0){
	       r = r + a.length;
	    }
	    reverse( a, 0 , a.length-r-1);
	    reverse( a , a.length-r , a.length-1);
	    reverse(a, 0, a.length-1);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("rotate an array");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = scn.nextInt();
		int[] a = new int[n];
		System.out.println("Enter  array:");
		for(int i = 0;i < a.length;i++)
		{
		    a[i] = scn.nextInt();
		}
		System.out.println("Enter rotation");
	    int r = scn.nextInt();
	    rotate(a,r);
	      System.out.println("rotated array:");
			    for(int val : a)
			        {
			            System.out.println(val);
			        }
			   
	}
}