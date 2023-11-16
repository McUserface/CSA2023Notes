import java.util.Scanner;

public class Notes_4_1 {

    private static Scanner scanny = new Scanner(System.in);
    public static void main(String[] args){

        oneATime("Bob Q");


    }

    public static void badJoke(){
        System.out.println("Pete and Repete went to the store.  \n" +
                "Pete came back, who was left?: ");
        String reply = scanny.nextLine();

        while(reply.equalsIgnoreCase("repete") || reply.equalsIgnoreCase("repeat") ){
            System.out.println("Pete and Repete went to the store.  \n" +
                    "Pete came back, who was left?: ");
            reply = scanny.nextLine();
        }

        System.out.println("That was fun");
    }

    public static void printPyramid(){

        // prime the loop.  Part 1
        int counter = 6;

        while(counter > 0){ // part 2
            int i = counter;
            while(i > 0){
                System.out.print(counter);
                i--;
            }
            System.out.println();
            counter--; // update counter.  part 3.
        }

    }

    public static void addNums(int num){

        // part 1 - num is my counter
        int total = 0;
        while(num > 0){ // part 2 is the test
            total+= num;
            num--; // part 3 - updating num
        }
        System.out.println(total);
    }

    public static void oneATime(String text){
        int size = text.length();
        int i = 0;
        while (i < size){
            char letter = text.charAt(i);
            System.out.println(letter);
            i++;
        }
    }

    public static int pinCheck(int pin, int score){
        int total = 0;
        while(pin > 0){
            int digit = pin % 10;
            if(digit % 2 == 1){
                total += 2* digit;
            } else {
                total += digit;
            }
            pin /= 10;
        }
        return total;
    }

}
