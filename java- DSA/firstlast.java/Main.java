import java.io.*;
import java.util.*;
public class Main
{
   public static void main(String [] args){
        System.out.println("first and last index");
        Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = scn.nextInt();
		int[] a = new int[n];
		System.out.println("Enter  array:");
		for(int i = 0;i < a.length;i++)
		{
		    a[i] = scn.nextInt();
		}
		System.out.println("enter data to search in array");
        int d = scn.nextInt(); 
        int l = 0;
        int h = a.length-1;
        int fi = -1;       
        while( l <= h){
             int m = (l+h)/2;
             if(d>a[m])
             {
                 l = m + 1;
             }
             else if(d<a[m]){
                 h = m - 1;
             }            
             else{
                 fi = m;
                 h = m - 1;
                 }           
        }
        System.out.println("fi:"+fi);
        l=0;
        h=a.length-1;
        int li = -1;      
        while( l <= h){
             int m = (l+h)/2;
             if(d>a[m])
             {
                 l = m + 1;
             }
             else if(d<a[m]){
                 h = m - 1;
             }            
             else{
                 li = m ;
                 l = m + 1;
                 }            
        
            
        }
        System.out.println("li:"+li);
}
}