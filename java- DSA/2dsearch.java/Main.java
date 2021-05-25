import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("search in 2d array:");
 Scanner scn = new Scanner (System.in);
      System.out.println ("Enter rows and column of  2d array");
    //int  = scn.nextInt ();
    int n = scn.nextInt ();
    int[][] a = new int[n][n];
    for (int i = 0; i < a.length; i++)
      {
	for (int j = 0; j < a[0].length; j++)
	  {
	    a[i][j] = scn.nextInt ();
	  }
      }
   System.out.println("enter element to be searched:");
   int num = scn.nextInt();
   	int i =0;
   	int j = a[0].length-1;
   	while(i < a.length && j >= 0)
   	{
   	    if(num==a[i][j]){
   	        System.out.println(i);
   	        System.out.println(j);
   	        return;
   	    }
   	    else if(num<a[i][j]){
   	        j--;
   	    }
   	    else{
   	        i++;
   	    }
   	}
	   //System.out.println(num +"doesn't exist in the array"); 
  }
}