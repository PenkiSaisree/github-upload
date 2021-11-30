package com.ltts;
import java.lang.*;
import java.util.Scanner;
public class ElifLadder
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks= sc.nextInt();
		if(marks> 80)
		{
			System.out.println("Excellent");
		}
		else if(marks > 50)
		   {
		    	System.out.println("Good");
		    }
		else
		{
			System.out.println("fail");
		}
		
	}

}