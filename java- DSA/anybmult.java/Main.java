import java.util.*;
public class Main
{   public static int anybmult(int b,int n1,int n2){
      int rev = 0 ;
      int place = 1;
      while(n2 > 0){
          int d2 = n2 % 10;
          n2 = n2 / 10;
          
          int sprd = singlemult(b,n1,d2);
          rev = baseadd(b,rev,sprd * place);
          place = place * 10;
          
      }
    return rev;
    
    
    }
    public static int singlemult(int b,int n1,int d2){
        int rv = 0;
        int c =0;
        int place=1;
        while(n1 > 0 || c > 0){
             int d1 = n1 % 10;
             n1 = n1 / 10;
             
             int d = d1 * d2 + c;
             
             c = d / b;
             d = d % b;
             
             rv = rv + d * place;
             place = place * 10;
        }
        return rv;
    }
    public static int baseadd (int b, int n1, int n2)
  {
    int rv = 0;
    
    int c = 0;
    int place = 1;
    while (n1 > 0 || n2 > 0 || c > 0)
      {
	   int d1 = n1 % 10;
	   int d2 = n2 % 10;
	   n1 = n1 / 10;
	   n2 = n2 / 10;
	
	    int d = d1 + d2 + c;

	     c = d / b;
	     d = d % b;
	     
	   rv += d * place;
	   place = place * 10;

      }
    return rv;
  }

	public static void main(String[] args) {
		System.out.println("Any Base Multipication");
		Scanner scn = new Scanner (System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2= scn.nextInt();
		int abmult= anybmult(b,n1,n2);
		System.out.println(abmult);
	}
}



