import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("subset");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = scn.nextInt();
		int[] a = new int[n];
		System.out.println("Enter  array:");
		for(int i = 0 ; i < a.length;i++)
		{
		    a[i] = scn.nextInt();
		}
		int limit = (int)Math.pow(2 , a.length);
		for(int i = 0; i < limit; i++){
			     String set = " ";
			     int temp = i;
			     for (int j = a.length-1; j >= 0;j--)
			       {
			         int r = temp % 2;
			         temp = temp / 2;
		             if(r==0){
		                      set = "-\t" + set;
		              }
			         else{
			               set = a[j]  + set;
			              }
			        
			    }
			    System.out.println(set);
			}
	}
}