import java.util.*;
public class Main
{
 static int n1 = 0, n2 = 1, n3;
 static void printFibonacci(int m){  
       
       if(m>0){  
         
         n3 = n1 + n2;  
         n1 = n2;  
         n2 = n3; 
         System.out.println(n3); 
         printFibonacci(m-2);  
     }  
 }  
 public static void main(String args[]){  
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
 
   System.out.println(n1); 
   System.out.println(n2);
    printFibonacci(n-1);
  
 }
}
