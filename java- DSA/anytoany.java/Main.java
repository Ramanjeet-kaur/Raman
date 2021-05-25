import java.util.*;
public class Main
{
  public static int anytoany (int n, int ab , int da ){
      int atd = anytodec( n, ab);
      int dtb = dectobase( atd , da);
      return dtb;
  }
  public static int anytodec (int n, int ab)
  {
    int rev = 0;
    int place = 1;
    while (n > 0)
      {
	int dig = n % 10;
	  n = n / 10;
	  rev = rev + dig * place;
	  place = place * ab;
        }
    return rev;
    
      }
 public static int dectobase(int n,int da){
      int rev = 0 ;
      int place = 1;
      while(n>0){
          int dig = n % da;
          n = n/da;
          rev = rev + dig * place;
          place = place * 10;
      }
    return rev;
  }


  public static void main (String[]args)
  {
    System.out.println ("Decimal to any base");
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt ();
    int ab = scn.nextInt ();
    int da = scn.nextInt ();
    int convno = anytoany (n, ab, da);
    System.out.println (convno);
  }
}
