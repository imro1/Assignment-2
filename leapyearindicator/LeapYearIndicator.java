/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyearindicator;

import java.util.Scanner;

/**
 *
 * @author imran
 */
public class LeapYearIndicator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
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
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 10 || month == 12)
            return 31;
        else if (month == 4 || month == 6 || month == 9 || month ==11)
            return 30;
        else    
            if (isLeapYear(year))
                return 29;
            else
                return 28;
        
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
