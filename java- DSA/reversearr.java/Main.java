import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("reverse of array");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = scn.nextInt();
		int[] a = new int[n];
	
		System.out.println("Enter First array:");
		for(int i = 0;i < a.length;i++)
		{
		    a[i] = scn.nextInt();
		}
	
	                int i = 0;
                    int j =	a.length-1;
                    while(i<j){
			        int temp = a[i];
			        a[i] = a[j];
			        a[j] = temp;
			        i++;
			        j--;
                    }
                System.out.println("reversed array:");
			    for(int val : a)
			        {
			            System.out.println(val);
			        }
			   
	}
	    
	}	