import java.util.Scanner;

/**
 * RPS is a rock-paper-scissors simulator
 * Author: Eric Allen
 * Version 1.0
 */
public class RPS {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        gameChoice();
    }
    public static void game(){
        System.out.println("Do you want to play?");
        String choice = input.nextLine(); // Uses the scanner and stores in a variable
        if(choice.equals("yes")){
            // call the next method
            playerChoice();
        } else{
            System.out.println("Bye!");
            // program has nothing else to do
        }
    }
    /*
    gameChoice askes user if they want to play. Plays if "yes", quits if "no"
     */
    public static void gameChoice(){
        System.out.println("Want to play a game of rock, paper, scissors?:");
        String choice = input.next();
        input.nextLine();
        if(choice.toLowerCase().equals("yes")){
            checkScore(playerChoice(), computerChoice());
        }else{
            System.out.println("Maybe next time!");
        }
    }

    /*
    playerChoice method will ask the user for a rock, paper,scissors choice.
    returns an int that represents rock, paper, or scissors
     */
    public static int playerChoice(){
        System.out.println("Do you want to plan rock, paper, or scissors?:");
        String choice = input.next();
        input.nextLine();
        if(choice.toLowerCase().equals("rock")){
            return 0;
        } if(choice.toLowerCase().equals("paper")){
            return 1;
        } if(choice.toLowerCase().equals("scissors")){
            return 2;
        } else{
            System.out.println("Sorry, I don't recognize that option");
            return playerChoice();
        }
    }

    /*
    computerChoice randomly generates a 0, 1, or 2 representing
    rock, paper, or scissors
     */
    public static int computerChoice(){

        return (int)(Math.random()*3);
    }

    /*
    checkScore compares the player and computer choices and reports the results.
    @ param int player is a number representing the player choice
    @ param int computer is a number representing the computer choice
     */
    public static void checkScore(int player, int computer){
        if(player == 0){
            if(computer == 0){
                System.out.println("Computer chose rock, you chose rock.  Tie game");
            } else if(computer == 1){
                System.out.println("Computer chose paper, you chose rock.  You lose");
            } else {
                System.out.println("Computer chose scissors, you chose rock.  You win");
            }
        }
        if(player == 1){
            if(computer == 0){
                System.out.println("Computer chose rock, you chose paper.  You win");
            } else if(computer == 1){
                System.out.println("Computer chose paper, you chose paper.  You tie");
            } else {
                System.out.println("Computer chose scissors, you chose paper.  You lose");
            }
        }
        if(player == 2){
            if(computer == 0){
                System.out.println("Computer chose rock, you chose scissors.  You lose");
            } else if(computer == 1){
                System.out.println("Computer chose paper, you chose scissors.  You win");
            } else {
                System.out.println("Computer chose scissors, you chose scissors.  You tie");
            }
        }
    }
}
