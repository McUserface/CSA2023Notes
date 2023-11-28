public class LoopChallenge {

    public static void main(String[] args){
        weirdThing();
    }

    public static void weirdThing(){
        // Controls total rows
        for(int row = 1; row < 7; row++){
            // Controls first slashes
            for(int slash1 = 2*row - 2; slash1 > 0; slash1--){
                System.out.print("\\");
            }
            // Controls !!
            for(int exc = 26 - 4*row; exc > 0; exc--){
                System.out.print("!");
            }
            //Controls slash2
            for(int slash2 = 2*row-2; slash2 > 0; slash2--){
                System.out.print("/");
            }
            // Creates a new row
            System.out.println();
        }


    }

}
