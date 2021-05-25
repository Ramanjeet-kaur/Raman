import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("2d array demo");
    Scanner scn = new Scanner (System.in);
      System.out.println ("Enter rows and column of 2d array");
    int m = scn.nextInt ();
    int n = scn.nextInt ();
    int[][] arr = new int[m][n];
    for (int i = 0; i < m; i++)
      {
	for (int j = 0; j < n; j++)
	  {
	    arr[i][j] = scn.nextInt ();
	  }
      }
    for (int i = 0; i < arr.length; i++)
      {
	for (int j = 0; j < arr[i].length; j++)
	  {
	    System.out.print (arr[i][j] + " ");
	  }
	System.out.println (" ");
      }
  }
}
