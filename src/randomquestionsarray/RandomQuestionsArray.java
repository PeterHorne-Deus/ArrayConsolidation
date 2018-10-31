/*
 * Peter Horne-Deus
 * This program has 20 random questions. You will answer 10. These questions have corresponding answers.
 * RandomQuestionsArray.java
 * October 29, 2018
 */

package randomquestionsarray;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


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
        
        //Variables
        String yesNo;
        int play = 1;//Variable controling the program continuing or no
        int wantsToPlay = 0;//Variable controling the program starting
        int question; //The random question
        int correct,incorrect;
        correct = 0;
        incorrect = 0;
        double questionsAsked = 0;
        double average =0;
        int amountQuestions = 0;
        
        //Strings
        String userGuess;
        
        //Arrays
        int[] questionsDone = new int[10];
                
        
        //Program exicution
        System.out.println("Welcome to Peter's random question generator.\n"
                + "************************************************************* \n"
                + "You will answer a random number of questions and get the results at the end. \n"
                + "You will enter either A,B,C, or D to represent your answer.");
        
        System.out.println("\n\nWould you like to start? (yes or no)");
        yesNo = userInput.nextLine();
        
        if (play == 1){
            switch(yesNo){
                case "Yes": case "yes": case "YES":
                    wantsToPlay = 1;
                    
                break;
                case "No": case "no": case "NO":
                    wantsToPlay = 0;    
                break;
                default:
                    wantsToPlay = 0;
                break;
            }
            while (wantsToPlay == 1){
                
                amountQuestions = (int)Math.round(Math.random()* 4+1);
                
                System.out.println(amountQuestions);
                for (int i = 0; i <= amountQuestions; i++){

                    question = (int)Math.round(Math.random()*9+1);

                    if (question == 1 && questionsDone[0] != 1){
                        questionsDone[0] = 1;
                        System.out.println("How many logs would you have if you start with 5 and take away 2\n"
                                + "A... 5\n"
                                + "B... 2\n"
                                + "C... 3\n"
                                + "D... 7\n");
                        userGuess = userInput.nextLine();
                        questionsAsked++;
                        if (userGuess.equalsIgnoreCase(QUESTION_1)){
                            correct = correct + 1;
                        }
                        else {
                            incorrect++;

                        }
                    }
                    else if (question == 2 && questionsDone[1] != 1){
                        questionsDone[1] = 1;
                        System.out.println("How many letters is the longest word in english?\n"
                                + "A... 20\n"
                                + "B... 16\n"
                                + "C... 28\n"
                                + "D... 7\n");
                        userGuess = userInput.nextLine();
                        questionsAsked++;
                        if (userGuess.equalsIgnoreCase(QUESTION_2)){
                            correct = correct + 1;
                        }
                        else {
                            incorrect++;
                        }
                    }
                    else if (question == 3 && questionsDone[2] != 1){
                        questionsDone[2] = 1;
                        System.out.println("What is the most common first phrase a coder uses when starting to code?\n"
                                + "A... Hello World\n"
                                + "B... Hello Code\n"
                                + "C... Welcome To Coding\n"
                                + "D... My First Try\n");
                        userGuess = userInput.nextLine();
                        questionsAsked++;
                        if (userGuess.equalsIgnoreCase(QUESTION_3)){
                            correct = correct + 1;
                        }
                        else {
                            incorrect++;
                        }
                    }
                    else if (question == 4 && questionsDone[3] != 1){
                        questionsDone[3] = 1;
                        System.out.println("How many days can you survive without food?\n"
                                + "A... 3 months\n"
                                + "B... 3 hours\n"
                                + "C... 3 days\n"
                                + "D... 3 weeks\n");
                        userGuess = userInput.nextLine();
                        questionsAsked++;
                        if (userGuess.equalsIgnoreCase(QUESTION_4)){
                            correct = correct + 1;
                        }
                        else {
                            incorrect++;
                        }
                    }
                    else if (question == 5 && questionsDone[4] != 1){
                        questionsDone[4] = 1;
                        System.out.println("What is an example of a flightless bird?\n"
                                + "A... Penguin\n"
                                + "B... Blue Jay\n"
                                + "C... Cardinal\n"
                                + "D... Parrot\n");
                        userGuess = userInput.nextLine();
                        questionsAsked++;
                        if (userGuess.equalsIgnoreCase(QUESTION_5)){
                            correct = correct + 1;
                        }
                        else {
                            incorrect++;
                        }
                    }
                    else if (question == 6 && questionsDone[5] != 1){
                        questionsDone[5] = 1;
                        System.out.println("What fallout game will be relseased in November of 2018?\n"
                                + "A... Fallout 5\n"
                                + "B... Fallout 76\n"
                                + "C... Fallout 4\n"
                                + "D... fallout 82\n");
                        userGuess = userInput.nextLine();
                        questionsAsked++;
                        if (userGuess.equalsIgnoreCase(QUESTION_6)){
                            correct = correct + 1;
                        }
                        else {
                            incorrect++;
                        }
                    }
                    else if (question == 7 && questionsDone[6] != 1){
                        questionsDone[6] = 1;
                        System.out.println("What platform is Stardewvallys nest platform?\n"
                                + "A... X Box\n"
                                + "B... Moible\n"
                                + "C... PS4\n"
                                + "D... PC\n");
                        userGuess = userInput.nextLine();
                        questionsAsked++;
                        if (userGuess.equalsIgnoreCase(QUESTION_7)){
                            correct = correct + 1;
                        }
                        else {
                            incorrect++;
                        }
                    }
                    else if (question == 8 && questionsDone[7] != 1){
                        questionsDone[7] = 1;
                        System.out.println("What is the most common bloodtype in the USA?\n"
                                + "A... O positive\n"
                                + "B... A positive\n"
                                + "C... A negitive\n"
                                + "D... AB negitive\n");
                        userGuess = userInput.nextLine();
                        questionsAsked++;
                        if (userGuess.equalsIgnoreCase(QUESTION_8)){
                            correct = correct + 1;
                        }
                        else {
                            incorrect++;
                        }
                    }
                    else if (question == 9 && questionsDone[8] != 1){
                        questionsDone[8] = 1;
                        System.out.println("What year was canada founded?\n"
                                + "A... 1967\n"
                                + "B... 1857\n"
                                + "C... 1867\n"
                                + "D... 1967\n");
                        userGuess = userInput.nextLine();
                        questionsAsked++;
                        if (userGuess.equalsIgnoreCase(QUESTION_9)){
                            correct = correct + 1;
                        }
                        else {
                            incorrect++;
                        }
                    }
                    else if (question == 10 && questionsDone[9] != 1){
                        questionsDone[9] = 1;
                        System.out.println("What was the first pokemon game relsesed?\n"
                                + "A... Blue and Ruby\n"
                                + "B... Orange and Brown\n"
                                + "C... Pink and Blue\n"
                                + "D... Red and Green\n");
                        userGuess = userInput.nextLine();
                        questionsAsked++;
                        if (userGuess.equalsIgnoreCase(QUESTION_10)){
                            correct = correct + 1;
                        }
                        else {
                            incorrect++;
                        }
                    }
                    else{
                        question = (int)Math.round(Math.random()*9+1);
                    }

                }
                    System.out.println("Well done you got " + correct + " correct");
                    System.out.println("Sadly you got " + incorrect + " incorrect");
                    average = correct/questionsAsked;

                    average= average*100;
                    Math.round(average);


                    System.out.println("Your is " + average + "%");

                    System.out.println("Would you like to restart? enter (yes or no)");
                    userGuess = userInput.nextLine();
                    if (userGuess.equalsIgnoreCase("yes")){
                        wantsToPlay = 1;
                        correct = 0;
                        incorrect = 0;
                    }
                    else {
                        wantsToPlay = 0;
                    }
        };
            
        System.out.println("\n**************************\n"
            + "Bye");
            
    }
        
        
    
    }
    
}
