import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("spiral traversal");
    Scanner scn = new Scanner (System.in);
      System.out.println ("Enter rows and column of  2d array");
    int m = scn.nextInt ();
    int n = scn.nextInt ();
    int[][] a = new int[m][n];
    for (int i = 0; i < a.length; i++)
      {
	for (int j = 0; j < a[0].length; j++)
	  {
	    a[i][j] = scn.nextInt ();
	  }
      }
      int minr=0;
      int minc=0;
      int maxr= a.length-1;
      int maxc= a[0].length-1;
      int ten = m*n;
      int count=0;
       
       while(count<ten)
       {
           System.out.println("spiral view:");
           //left wall
           for(int i= minr, j=minc; i<=maxr&&count<ten;i++){
               System.out.println(a[i][j]);
               count++;
           }
           minc++;
            //Bottom wall
           for(int i= maxr, j=minc; j<=maxc && count<ten;j++){
               System.out.println(a[i][j]);
                    count++;
               
           }
           maxr--;
            
            //Right wall
           for(int i= maxr, j=minc; i>=minr && count<ten;i--){
               System.out.println(a[i][j]);
                    count++;
               
           }
           maxc--;
           
           //Top wall
           for(int i= minr, j=maxc; j>=minc && count<ten;j--){
               System.out.println(a[i][j]);
                    count++;
               
           }
           minr++;
       }
      
}
}
