package com.ltts;
import java.util.Scanner;
public class Switch {
 public static void main(String[] args)
 {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a week: ");
        int week = sc.nextInt();
        String weekString;
        switch (week) {
            case 1:  weekString = "Sunday";
                     break;
            case 2:  weekString = "Monday";
                     break;
            case 3:  weekString = "Tuesday";
                     break;
            case 4:  weekString = "Wednesday";
                     break;
            case 5:  weekString = "Thursday";
                     break;
            case 6:  weekString = "Friday";
                     break;
            case 7:  weekString = "Saturday";
                     break;
            default: weekString = "Invalid week";
                     break;
        }
        System.out.println(weekString);
    }
}