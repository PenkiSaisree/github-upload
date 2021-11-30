package com.ltts;

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args)
	   {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Count the values: ");
	      int count = sc.nextInt(); 
	      do
	      {
	    	 count++;
	         System.out.print(count + " ");          
	      } while (count <= 10);
	   }
}