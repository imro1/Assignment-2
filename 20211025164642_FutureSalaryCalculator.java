/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class FutureSalaryCalculator {
    public static void main(String[]args){
        Scanner console = new Scanner(System.in);
        
        //input
        System.out.print("Please enter your current salary: ");
        double currentSalary = console.nextInt();
        System.out.print("For how many years you wanna work? ");
        int year = console.nextInt();
        
       //output
        System.out.printf("the salary will be: " + calcFutureSalary(currentSalary, year));
    }
    public static double calcFutureSalary(double currentSalary, int year){
        double salary = currentSalary; //recall
        int yearC = 1;// intial year
        
        while(yearC <= year){ //loop
            if (yearC < 3){                          //conditons
                salary = salary + (salary * 0.03);
                yearC++;
            }
            else if ((yearC >= 3) && (yearC <10)){
                salary = salary + (salary * 0.05);
                yearC++;
        }
            else if (yearC >=10){
                salary = salary + (salary * 0.08);
                yearC++;
            }
        }
        return salary;
    }
}
