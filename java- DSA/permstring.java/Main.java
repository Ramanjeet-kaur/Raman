import java.util.*;
public class Main
{
    public static void permutstring(String str)
    {   int n = str.length();
        int f = fact(n);
        for(int i =0;i<f;i++){
        StringBuilder sb = new StringBuilder(str);
        for(int div = n; div >= 1;div--)
        {
            int temp=i;
            int q = temp/div;
            int r = temp%div;
            System.out.print(sb.charAt(r));
            sb.deleteCharAt(r);
            temp = q;
        }
            System.out.println(" ");
        }
        
    }
    public static int fact(int n)
    {
        int val=1;
        for(int i = 2;i<=n;i++){
            val*=i;
        }
        return val;
    }
	public static void main(String[] args) {
		System.out.println("permutation of string");
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		permutstring(str);
	}
}

