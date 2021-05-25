import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Principle :");
        int p = scn.nextInt();
        System.out.println("Enter Rate:");
        int r = scn.nextInt();
        System.out.println("Enter Time:");
        int t = scn.nextInt();
        int SI;
        SI=(p*r*t)/100;
        System.out.println("Simple Interest:"+SI);
        
        
    }
    
}