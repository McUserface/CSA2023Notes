public class Notes_4_2 {

    public static void main(String[] args) {

        for (char letter = 'a'; letter <= 'z'; letter++){
            System.out.println(letter);
    }System.out.println("every time?");

    }

    public static int factorial(int num){
        int solution = 1;
        for(int i = 2; i <= num; i++){
            // take solution and multiply by i
            solution *= i;
            System.out.println("looped again");
        }
        System.out.println(solution);
        return solution;
    }
}
