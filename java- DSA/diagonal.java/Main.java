import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("spiral traversal");
    Scanner scn = new Scanner (System.in);
      System.out.println ("Enter rows and column of  2d array");
    //int m = scn.nextInt ();
    int n = scn.nextInt ();
    int[][] a = new int[n][n];
    for (int i = 0; i < a.length; i++)
      {
	for (int j = 0; j < a[0].length; j++)
	  {
	    a[i][j] = scn.nextInt ();
	  }
      }
    System.out.println("matrix:");
   for(int g=0;g<a.length;g++){
       for(int i=0,j=g;j<a.length;i++,j++){
        System.out.println(a[i][j]+ " ");   
       }
   }
  
  } 
  }