import java.util.Scanner;

public class Notes_3_1 {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int size;
        System.out.println("You are going to play guess a number.\n" +
                "What is the largest number I can use?: ");
        size = input.nextInt();
        // good idea to clear the Scanner
        input.nextLine();

        int randomNum = (int)(Math.random()*size+1);
        System.out.println("What is your guess?: ");
        int guess = input.nextInt();
        // good idea to clear the Scanner
        input.nextLine();
        if(guess == randomNum) {
            System.out.println("Congrats, you guessed it!");
        }
            //System.out.println("Does this print too?");

        if(guess != randomNum){
            System.out.println("No dummy");
        }
        if(true){
            System.out.println("This is pointless");
        }

    }

}
