/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rps;
import java.util.Scanner;
/**
 *
 * @author Brians PC
 */
public class RPS {
    static int cpuChoice;
    static int userInput;
    public static void Rock(){
         System.out.println("You Chose Rock");
            if(cpuChoice == 1){
                System.out.println("CPU chose Rock as well. It's a tie!");
            }else if(cpuChoice == 2){
                System.out.println("CPU chose Scissors. You win!");
            }else if(cpuChoice == 3){
                System.out.println("CPU chose Paper. You lose!");
            }
    }
    
    public static void Paper(){
        System.out.println("You chose Scissors");
            if(cpuChoice == 1){
                System.out.println("CPU chose Rock. You lose!");
            }else if(cpuChoice == 2){
                System.out.println("CPU chose Scissors as well. It's a tie!");
            }else if(cpuChoice == 3){
                System.out.println("CPU chose Paper. You win!");
            }
    }
    
    public static void Scissors(){
         System.out.println("You chose Paper");
            if(cpuChoice == 1){
                System.out.println("CPU chose Rock. You win!");
            }else if(cpuChoice == 2){
                System.out.println("CPU chose Scissors. You lose!");
            }else if(cpuChoice == 3){
                System.out.println("CPU chose Paper as well. It's a tie!");
            }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cpuChoice = 1 + (int)(3*Math.random());
        System.out.println("Enter your choice - 1 For Rock, 2 For Scissor, 3 For Paper.");
        Scanner u = new Scanner(System.in);
        userInput = u.nextInt();
        if(userInput == 1){
           Rock();
        }else if(userInput == 2){
            Scissors();
        }else if(userInput == 3){
           Paper();
        }else{
            System.out.println("Invalid Input");
        }
    
}
}