import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scn=new Scanner(System.in);
	    System.out.println("Program to Calculate BMI");
	    System.out.println("Enter Mass in kg:");
	    float m = scn.nextFloat();
	    System.out.println("Enter Height in m:");
	    float h = scn.nextFloat();
	    float BMI = m/(h*h);
		System.out.println("Calculated BMI:" + BMI);
	}
}
