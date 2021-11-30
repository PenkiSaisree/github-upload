package com.ltts;
import java.util.Scanner;
public class While
{
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Count the values: ");
      int count = sc.nextInt();   
      while (count <= 10)   
      {
         System.out.print(count + " ");
         count++;          
      }
   }
}