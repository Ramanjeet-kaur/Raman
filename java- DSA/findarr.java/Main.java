import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("find element in array");
		Scanner scn = new Scanner(System.in);
		//int v = scn.nextInt();
		int[] arr = new int[] {67,87,45,34,12};
		int n = scn.nextInt();
		//for(int i=0;i<arr.length;i++)
	//	{
		   // arr[i] = scn.nextInt();
	//	}
	int indx=-1;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]==n)
		    {
		        indx = i;
		        break;
		    }
		} 
		    
	   System.out.println(n + " available at "+ indx); 
}
}