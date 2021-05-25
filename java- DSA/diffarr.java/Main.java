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
		for(int i = 0;i < arr2.length;i++)
		{
		    
		    arr2[i] = scn.nextInt();
		}
         int[] diff = new int[n];
         int c = 0;
         
         int i = arr1.length - 1;
         int j = arr2.length - 1;
         int k = diff.length - 1;
         
         while(k>=0){
         int d = 0;
         int avi = i >= 0 ? arr1[i]:0;
         if(arr2[j]+c>=avi)
         {
             d = arr2[j]+c-avi;
             c=0 ;         
         }
         else
         {
             d = arr2[j]+c+10-avi;
             c=-1;
         }
         
         diff[k]=d;
         i--;
         j--;
         k--;
	}
	int index =0;
	while(index<diff.length)
  {
	    if(diff[index]==0)
	{
	    index++;
	}
	else
	{
	    break;
	}
  }
    System.out.println("solved:");
    while(index<diff.length){
        
	    System.out.println(diff[index]);
        index++;
        
    }
	}
	}
 
