import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("sum of array");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of array1:");
		int v = scn.nextInt();
		int[] arr1 = new int[v];
		System.out.println("Enter size of array2:");
		int n = scn.nextInt();
		int[] arr2 = new int[n];
		
		System.out.println("Enter First array:");
		for(int i = 0;i < arr1.length;i++)
		{
		    arr1[i] = scn.nextInt();
		}
		System.out.println("Enter Second array:");
		for(int j = 0;j < arr2.length;j++)
		{
		    
		    arr2[j] = scn.nextInt();
		}
         int[] sum = new int[v > n ? v : n];
         int c = 0;
         
         int i = arr1.length - 1;
         int j = arr2.length - 1;
         int k = sum.length - 1;
         
         while(k>=0){
         int d = c; 
         if(i>=0 )
         {
             d=c;
             d+=arr1[i];         
         }
         if(j>=0)
         {
             d+=arr2[j];
         }
         
         c = d/10;
         d = d%10;
         
         sum[k]=d;
         i--;
         j--;
         k--;
	}
	
	if(c !=0 ){
	    System.out.println(c);
	}
	for(int val:sum)
	{
	    System.out.print(val);
	}
	}
 }

