import java.util.Scanner;
public class Notes_3_4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Type in a number");
        int x = input.nextInt();
        input.nextLine();
        if(x >= 10  && x <= 1000){
            System.out.println("that's a big number");
        }
        else if(x == 2 || x == 9){
            System.out.println("that's a small number");
        }
        else if(x == 6){
            System.out.println("You're a monster");
        }else{
            System.out.println("that's a number");
        }

    }
}
