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
        final String QUESTION_1 = "B";
        final String QUESTION_2 = "C";
        final String QUESTION_3 = "A";
        final String QUESTION_4 = "D";
        final String QUESTION_5 = "A";
        final String QUESTION_6 = "B";
        final String QUESTION_7 = "B";
        final String QUESTION_8 = "A";
        final String QUESTION_9 = "C";
        final String QUESTION_10 = "D";
        final String QUESTION_11 = "A";
        final String QUESTION_12 = "C";
        final String QUESTION_13 = "D";
        final String QUESTION_14 = "A";
        final String QUESTION_15 = "B";
        final String QUESTION_16 = "C";
        final String QUESTION_17 = "D";
        final String QUESTION_18 = "A";
        final String QUESTION_19 = "B";
        final String QUESTION_20 = "D";
        
        //Variables
        String yesNo;
        int play = 1;//Variable controling the program continuing or no
        int wantsToPlay = 0;//Variable controling the program starting
        int question; //The random question
        
        String test;
        //Arrays
        int[] questionsDone = new int[10];
        
        //Program exicution
        System.out.println("Welcome to Peter's random question generator.\n"
                + "************************************************************* \n"
                + "You will answer ten questions and get the results at the end. \n"
                + "You will enter either A,B,C, or D to represent your answer.");
        
        System.out.println("\n\nWould you like to start?");
        yesNo = userInput.nextLine();
        
        if (play == 1){
            switch(yesNo){
                case "Yes": case "yes": case "YES":
                    wantsToPlay = 1;
                break;
                case "No": case "no": case "NO":
                    wantsToPlay = 0;    
                break;
            }
            if (wantsToPlay == 1){
            for (int i = 0; i < 10; i++){
                
                System.out.println("First Question : " );
                //create random number
                question = 1;//Place holder
                if (question == 1 && questionsDone[0] == 0){
                    questionsDone[0] = 1;
                    System.out.println("How many logs would you have if you start with 5 and take away 2\n"
                            + "A... 5\n"
                            + "B... 2\n"
                            + "C... 3\n"
                            + "D... 7\n");
                    test = userInput.nextLine();
                }
                else if (question == 2 && questionsDone[1] == 0){
                    questionsDone[1] = 1;
                    System.out.println("How many letters is the longest word in english?\n"
                            + "A... 20\n"
                            + "B... 16\n"
                            + "C... 28\n"
                            + "D... 7\n");
                }
                else if (question == 3 && questionsDone[2] == 0){
                    questionsDone[2] = 1;
                    System.out.println("What is the most common first phrase a coder uses when starting to code?\n"
                            + "A... Hello World\n"
                            + "B... Hello Code\n"
                            + "C... Welcome To Coding\n"
                            + "D... My First Try\n");
                }
                else{
                    //Create random number again
                }
                
            }

        }
            else {
                System.out.println("\n**************************\n"
                + "Bye");
            }
    }
        
        
    
    }
    
}
