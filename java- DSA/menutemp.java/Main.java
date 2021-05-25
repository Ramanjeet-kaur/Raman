import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("program for temperature conversion");
		System.out.println("\n Enter 1 for farenhiet to celsius"+"\n Enter 2 for Celsius to farenhiet" );
		Scanner scn = new Scanner(System.in);
		System.out.println("\n Enter your choice");
		int Ch = scn.nextInt();
		switch(Ch){
		    case 1: 
		        System.out.println("Farenheit to Celsius");
		        System.out.println("Enter temperature  in farhenheit For conversion");
		        float far = scn.nextFloat();
		        float Cel = (5*(far-32))/9;
		        System.out.println("Temperature: "+Cel+"C");
		        break;
		   case 2: 
		        System.out.println("Celsius to Farenheit");
		        System.out.println("Enter temperature  in Celsius For conversion");
		        float cel = scn.nextFloat();
		        float Far = (cel * 9 / 5) + 32;
		        System.out.println("Temperature: "+Far+"F");
		        break;
		  default:
		        System.out.println("Invalid choice");
		        break;
		}
		}
	}

