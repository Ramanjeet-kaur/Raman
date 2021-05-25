import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int T = scn.nextInt();
    for(int i=0;i<=T;i++){
      int n = scn.nextInt();
      double temp = 0;
      double sr = n/2;
      do{
        temp = sr;
        sr= (temp+(n/temp))/2;
      }while((temp-sr!=0));
        System.out.println(sr);
    }
  }
}