import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int array[] = new int[n];
    for(int i=0;i<array.length;i++)
    {
        array[i]= scn.nextInt();
    }
    int max = getMax(array);
    int min = getMin(array);
    int span = max-min;
    System.out.println("span:"+max+"-"+min+"="+span);
    }
    public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
  // Method for getting the minimum value
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}



