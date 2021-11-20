/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthyearcalculator;

import java.util.Scanner;

/**
 *
 * @author imran
 */
public class LeapYearIndicator {
    public static void main(String[]args){
        Scanner console =  new Scanner(System.in);
          //input
        System.out.printf("Please enter a year: ");
        int year = console.nextInt();
        System.out.printf("Please enter a month: ");
        int month = console.nextInt();
        
        //output
        if (isLeapYear(year) == true){
            System.out.println("The year " + year +" is a leap year");
        }
        else{
            System.out.println("The year "+ year + " is not a leap year" );
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 10 || month == 12)
            System.out.printf("This month has 31 days in it");
        if (month == 4 || month == 6 || month == 9 || month ==11)
            System.out.printf("This month has 30 days in it");
        else
            if (isLeapYear(year) == true){
                System.out.println("This month of this year has 29 days in it");
            }
            else{
                System.out.println("This month of this year has 28 days in it");
    
            }
    }
    public static int calcDays(int month, int year){
        int days = 0;
      switch (month) {
        // Case rule for when month is 1, 3, 5, 7, 8, 10, 12
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
        // Case rule for when month is 2
            case 2:
            // if method isLeapyear is true then days = 29 else days = 28
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        // Case rule for when month is 4, 6, 9, 11
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
        }
        return days;
        
    }
    public static boolean isLeapYear(int year){
        if(year % 4 !=0)
            return false;
        else if(year % 100 !=0)
            return true;
        else if(year % 400 !=0)
            return false;
        else
            return true;
    }
    
    
}
