import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("rotate by 90 ");
    Scanner scn = new Scanner (System.in);
      System.out.println ("Enter rows and column of  2d array");
    //int m1 = scn.nextInt ();
    int n1 = scn.nextInt ();
    int[][] a1 = new int[n1][n1];
    for (int i = 0; i < a1.length; i++)
      {
	for (int j = 0; j < a1[0].length; j++)
	  {
	    a1[i][j] = scn.nextInt ();
	  }
      }
      //transpose
      for(int i=0;i<a1.length;i++){
          for(int j=i;j<a1[0].length;j++)
          {
              int temp = a1[i][j];
              a1[i][j]=a1[j][i];
              a1[j][i]=temp;
          }
      }
      // reversecolumn
      for(int i =0;i<a1.length;i++){
          int li = 0;
          int ri = a1[i].length-1;
          while(li<ri){
              int temp = a1[i][li];
              a1[i][li] = a1[i][ri];
              a1[i][ri] = temp;
              li++;
              ri--;
          }
      }
      System.out.println("matrix:");
      for(int i= 0;i<a1.length;i++){
          for(int j=0;j<a1[0].length;j++){
      System.out.print( a1[i][j] + " ");
          }
          System.out.println(" ");
      }
      }
      }