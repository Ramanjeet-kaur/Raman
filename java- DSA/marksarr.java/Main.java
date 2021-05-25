import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws Exception {
		System.out.println("print marks using array");
		int marks[];
		marks = new  int[5];
		marks[0]= 67;
		marks[1]= 26;
		marks[2]= 55;
		marks[3]= 34;
		marks[4]= 45;
		for(int i=0;i<marks.length;i++)
		{
		    System.out.println(marks[i]);
		}
	}
}
