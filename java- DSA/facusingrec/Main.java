import java.util.*;
public class Main
{	

    public static void factors(int n, int div)
    {
        if (div <= n) {
            while (n % div == 0) {
                n= n/div;
                System.out.println(div);
            }

            factors(n , div + 1);
        }
    }
    
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int num =  scn.nextInt();
        factors(num, 2);
    }
}
