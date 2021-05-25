import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("Matrix Multipication");
    Scanner scn = new Scanner (System.in);
      System.out.println ("Enter rows and column of first 2d array");
    int m1 = scn.nextInt ();
    int n1 = scn.nextInt ();
    int[][] a1 = new int[m1][n1];
    for (int i = 0; i < a1.length; i++)
      {
	for (int j = 0; j < a1[0].length; j++)
	  {
	    a1[i][j] = scn.nextInt ();
	  }
      }
    System.out.println ("Enter rows and column of Second 2d array");
    int m2 = scn.nextInt ();
    int n2 = scn.nextInt ();
    int[][] a2 = new int[m2][n2];
    for (int i = 0; i < a2.length; i++)
      {
	for (int j = 0; j < a2[0].length; j++)
	  {
	    a2[i][j] = scn.nextInt ();
	  }
      }
      if (n1!=m2){
          System.out.println("invalid ");
      }
      int[][] a3 = new int[m1][n2];
      for(int i =0; i<a3.length;i++){
          for(int j =0; j<a3.length;j++)
          {
              for(int k = 0;k < n1; k++)
              {
                  a3[i][j] += a1[i][k] * a2[k][j];
              }
          }
      }
      for(int i =0; i<a3.length;i++){
          for(int j =0; j<a3.length;j++)
          { System.out.print(a3[i][j] +" ");
          }
          System.out.println(" ");
      }
  }
}