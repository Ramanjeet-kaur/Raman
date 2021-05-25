/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


	 public class Main {
	    
     public static void main (String args[]) {
        
      int rev=0;
        int r=0;
        int x=34;
    while(x>=1)
    {
        r = x%10;
        rev = rev * 10 + r;
        x= x/10;
        
        
    }
    System.out.println(rev);
	}
}
