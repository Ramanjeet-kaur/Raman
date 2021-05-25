 import java.util.*;
 class Main{
     
public static int sum_of_digit(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return (n % 10 + sum_of_digit(n / 10));
    }
 

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=1; i<=t;i++)
        {
        int num = s.nextInt();
        int result = sum_of_digit(num);
        System.out.println(result);
        }
    }
}