import java.util.Scanner;

public class Notes_4_1 {

    static Scanner scanny = new Scanner(System.in);
    public static void main(String[] args){

        int i = 8;
        while (i >7) {
            System.out.println("testing");
            i--;
        }


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

    }

}
