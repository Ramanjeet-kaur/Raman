import java.util.*;
class Main{
    
static int removeDuplicates(int arr[], int size)
{
        if (size==0 || size==1)
            return size;
       
        int[] temp = new int[size];
         
        int j = 0;
        for (int i=0; i<size-1; i++)
    
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
          
     
        temp[j++] = arr[size-1];   
          
      
        for (int i=0; i<j; i++)
            arr[i] = temp[i];
       
        return j;
    }
      
    public static void main (String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        	for(int i = 0;i < arr.length;i++)
		{
		    arr[i]=scn.nextInt();
		}
		     n = removeDuplicates(arr, n);
		    for(int i = 0;i < n;i++)
		    {
             System.out.println(arr[i]+" ");
		    }
             
		
		
}
}