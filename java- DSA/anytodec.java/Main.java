import java.util.*;
public class Main
{   public static int anytodec(int n,int ab){
      int rev = 0 ;
      int place = 1;
      while(n>0){
          int dig = n % 10;
          n = n/10;
          rev = rev + dig * place;
          place = place * ab;
          
      }
    return rev;
    
    
    }

	public static void main(String[] args) {
		System.out.println(" Any base to decimal");
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int ab = scn.nextInt();
		int convno = anytodec(n,ab);
		System.out.println(convno);
	}
}

