package com.ltts;
import java.util.Scanner;
public class Nestedif {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the student marks");
	int marks= sc.nextInt();
	if(marks> 80)
	{
		System.out.println("good");
	    if(marks>90)
	    {
	    System.out.println("and Excellent");
	    
	    }
	}
	else
	{
		System.out.println("Average");
	}
	
}
}