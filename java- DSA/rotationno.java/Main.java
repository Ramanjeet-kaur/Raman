/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Rotate number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("enter no of rotation");
		int rot = scn.nextInt();
		
		int temp = n;
		int digno = 0;
		while( temp > 0){
		    temp = temp/10;
		    digno++;
		    
		}
		
		rot = rot % digno;
		if(rot < 0){
		    rot = rot + digno;
		 
		}
		int div = 1;
		int multi = 1;
		for (int i = 1 ;i<=digno;i++ ){
		    if(i<=rot)
		    {
		        div = div*10;
		    }
		    else 
		    {
		        multi = multi*10;
		    }
		    }
		    int q = n/div;
		    int r = n%div;
		    
		    int rotno = r * multi + q;
		     System.out.println("rotated number :"+ rotno);
		}
	}

