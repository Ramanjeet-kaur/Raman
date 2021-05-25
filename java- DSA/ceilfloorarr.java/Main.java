import java.io.*;
import java.util.*;
public class Main
{
   public static void main(String [] args){
        System.out.println("binary search ");
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
        int ceil = 0;
        int floor = 0;
       
        while( l <= h){
             int m = (l+h)/2;
             if(d>a[m])
             {
                 l = m + 1;
                 ceil = a[m];
             }
             else if(d<a[m]){
                 h = m - 1;
                 floor = a[m];
             }            
             else{
                 ceil = a[m];
                 floor = a[m];
                 }            
        
            
        }
        System.out.println("ceil :"+ ceil);
        System.out.println("floor: " + floor);
 }       
}
