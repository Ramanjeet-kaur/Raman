import java.util.*;
public class Main
{   public static int dectobase(int decno,int base){
      int rev = 0 ;
      int place = 1;
      while(decno>0){
          int dig = decno % base;
          decno = decno/base;
          rev = rev + dig * place;
          place = place * 10;
          
      }
    return rev;
    
    
    }

	public static void main(String[] args) {
		System.out.println("Decimal to any base");
		Scanner scn = new Scanner (System.in);
		int decno = scn.nextInt();
		int base = scn.nextInt();
		int convno = dectobase(decno,base);
		System.out.println(convno);
	}
}


