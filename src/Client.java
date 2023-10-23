import java.util.Scanner;
public class Client {

    public static void main(String[] args) {

        Scanner scanny = new Scanner(System.in);
        System.out.println("Guess what I will roll?: ");
        int input = scanny.nextInt();
        String correct = scanny.nextLine();
        int randy = (int)(Math.random()*6)+1;
        System.out.println("I rolled a " + randy + " and you guessed " + input);
        System.out.println("Were you correct?: ");
        correct = scanny.next();
        System.out.println("end of program");



    } // end main

} // end class

// see class structure with alt + 7