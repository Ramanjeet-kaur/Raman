import java.util.*;
import java.io.*;
public class Main
{
    
    
    public static void solution(ArrayList<Integer> a1)
    {
        for(int i = a1.size()-1; i>=0;i--){
            int val = a1.get(i);
            if(isprime(val)==true){
                a1.remove(i);
            }
        }
    }
    public static boolean isprime(int val){
        for(int div=2;div*div<= val;div++){
            if(val%div==0)
            {
            return false;
            }
        }
        return  true;
    }
    
	public static void main(String[] args) {
		System.out.println("remove prime no from array list");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> a1 = new ArrayList<>();
		for(int i = 0;i<n;i++){
		    a1.add(scn.nextInt());
		    
		}
		solution(a1);
		     System.out.println(a1);
	}
}
