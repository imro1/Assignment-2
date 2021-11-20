
package leapyearindicator;

import java.util.Scanner;

/**
 *
 * @author imran
 */
public class GradeScore {
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
        switch (letterScore){
            case 'a':
                System.out.println("Excellent");
                break;
        
            case 'b':
                System.out.println("Well done");
                break;
            case 'c':
            case 'd':
                System.out.println("Passed");
                break;
            case 'f':
                System.out.println("Better try again");
                break;
            default:
                break;
        }        
    }
}
