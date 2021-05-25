import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("saddle point");
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
    
      System.out.println(" saddle point:");
      for(int i =0;i<a.length;i++){
          int lci=0;
          for(int j =1;j< a[0].length;j++){
              if(a[i][j]< a[i][lci]){
                  lci=j;
              }
          }
          boolean flag = true;
          for(int k = 0 ; k < a.length;k++){
              if(a[k][lci]>a[i][lci]){
                  flag=false;
                  break;
              }
          }
            if(flag==true){
                System.out.println(a[i][lci]);
                return;
            }  
          
      }
  System.out.println("Invalid input");
      
  }
}