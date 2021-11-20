/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthyearcalculator;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author imran
 */
public class AverageScoreCalculator {
    public static void main(String[]args){
    Scanner console = new Scanner(System.in);
    
    //input
    System.out.printf("Please enter the amount of random scores: ");
    int num = console.nextInt();
    
    //output
    
    }
    public void calcAverageScore(int num){
 
    
    Random rand = new Random();
    int totalNums;
    double total = 0;
 
    for (totalNums=1; totalNums<=num; totalNums++){
        int random = rand.nextInt(101);
        total += random;
        
    
    }
    
    double average = total/num;
    
     }
}