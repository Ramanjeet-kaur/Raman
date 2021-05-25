import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("exit point matrix ");
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
      int dir=0;
      int i=0;
      int j=0;
      while(true)
   { 
    dir =(dir+a1[i][j])%4;
     
      if(dir==0){
          i++;
      }
      else if(dir==1){
          j++;
      }
      else if(dir==2){
          j--;
      }
      else if(dir==3){
          i--;
      }
  
      if(i>0){
          i++;
          break;
      }
      else if(j<0){
          j++;
          break;
      }
      else if( i == a1.length){
          i--;
          break;
      }
      else if( j == a1[0].length){
          j--;
          break;
      }
   }
   System.out.println(a1[i][j] + " ");
  } 
}