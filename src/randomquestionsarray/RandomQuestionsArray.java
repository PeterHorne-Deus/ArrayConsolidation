/*
 * Peter Horne-Deus
 * This program has 20 random questions. You will answer 10. These questions have corresponding answers.
 * RandomQuestionsArray.java
 * October 29, 2018
 */

package randomquestionsarray;

import java.util.Scanner;
import java.util.ArrayList;

public class RandomQuestionsArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating Scanner
        Scanner userInput = new Scanner(System.in);
        
        //Constents
        //Answers
        final int QUESTION_1 = 2;
        
        //Variables
        String yesNo;
        int play = 1;//Variable controling the program continuing or no
        int wantsToPlay = 0;//Variable controling the program starting
        
        //Program exicution
        System.out.println("Welcome to Peter's random question generator.\n"
                + "************************************************************* \n"
                + "You will answer ten questions and get the results at the end. \n"
                + "You will enter either A,B,C, or D to represent your answer.");
        
        System.out.println("\n\nWould you like to start?");
        yesNo = userInput.nextLine();
        
        while (play == 1){
            switch(yesNo){
                case "Yes": case "yes": case "YES":
                    wantsToPlay = 1;
                break;
                case "No": case "no": case "NO":
                    wantsToPlay = 0;    
                break;
            }
            if (wantsToPlay == 1){
                System.out.println("First Question : " );
            }
            else {
                play = 0;
            }
            
        }
        System.out.println("\n**************************\n"
                + "Bye");
        
    
    }
    
}
