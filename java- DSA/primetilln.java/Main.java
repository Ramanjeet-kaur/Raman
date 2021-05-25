import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Prime till N");
		Scanner cn = new Scanner(System.in);
		System.out.println("enter the range till you want to display prime");
		System.out.println("low range:");
		int lowrange=cn.nextInt();
		System.out.println("high range:");
		int highrange = cn.nextInt();
		for(int n = lowrange;n<=highrange;n++){
		    int count=0;
		    for(int div = 2; div*div <= n;div++){
		        if(n % div==0){
		        count++;
		        break;
		        }
		    }
		    if(count==0)
		    {
		        System.out.println( n +" is Prime");
		    }
		    //else{
		      //  System.out.println( n +" is Not Prime ");
		        
		    //}
		    
		}
		
		
	}
}
