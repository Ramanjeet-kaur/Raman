import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("find element in array");
		Scanner scn = new Scanner(System.in);
		int v = scn.nextInt();
		int[] arr = new int[v];
		for(int i = 0;i < arr.length;i++)
		{
		    arr[i] = scn.nextInt();
		}
		int  max = arr[0];
		for(int i = 1; i < arr.length;i++)
		{
		    if(arr[i] > max){
		        max = arr[i];
		    }
		}
		for(int floor = max; floor >= 1;floor--){
		    for(int i = 0; i < arr.length;i++){
		        if(arr[i] >= floor)
		        {
		            System.out.print("*\t");
		        }
		        
		        else{
		            System.out.print("\t");
		        }
		    }
		
		    System.out.println(" ");
		}
	 }
}
