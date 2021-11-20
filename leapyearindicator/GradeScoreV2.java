package leapyearindicator;

import java.util.Scanner;

/**
 *
 * @author imran
 */
public class GradeScoreV2 {
    public static void main(String[]args){
        Scanner console = new Scanner(System.in);
        
        //input
        System.out.print("Please enter your grade: ");
        int grade = console.nextInt();
        
        //partial output
        char score = toLetterScore(grade);
        printMessage(score);
    }
    public static char toLetterScore(int grade){
        char gradeI = 0; //simple if conditons to print an initial possible grade(declaring variables)
        if (grade <= 100 && grade >=90){
            gradeI = 'a';
        }
        else if (grade < 90 && grade >= 80){
            gradeI = 'b';
        }
        else if (grade < 80 && grade >= 70){
            gradeI = 'c';
        }
        else if (grade < 70 && grade >= 60){
            gradeI = 'd';
        }
        else {
            gradeI = 'f';
        }
        return gradeI;
                    
    }
    public static void printMessage(char letterScore){
        //output of the result
        if (letterScore == 'a'){
            System.out.println("Excellent");
        }
        else if (letterScore == 'b'){
            System.out.println("Well done");
        }       
        else if (letterScore == 'c'){
            System.out.println("Passed");
        }
        else{
            System.out.println("Better try ");
        }
    }
}
