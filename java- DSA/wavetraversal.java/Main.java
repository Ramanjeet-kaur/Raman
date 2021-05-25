import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("Wave travesal");
    Scanner scn = new Scanner (System.in);
      System.out.println ("Enter rows and column of  2d array");
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
    	for (int j = 0; j < a1[0].length; j++)
	  {  if(j%2==0){
	               for(int i = 0;i<a1.length;i++){
	                System.out.print(a1[i][j] + " ");
	              
	                } 
	                 } 
	                
	      else{
	          for(int i = a1.length-1; i>=0 ;i--)
	              {
	                System.out.print(a1[i][j] + " ");
	                
	                } 
	                
	          
	      }
	      
	  } 
	  
  }
  }