public class Notes_4_4 {

    public static void main(String[] args){
        example();
    }

    public static void warmup(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("/");
            }
            for(int k = 0; k < 5; k++){
                System.out.print("*");
            }
            for(int l = 0; l < 5; l++){
                System.out.print("\\");
            }
            System.out.println(i);
        }
    }

    public static void example(){
        // outer loop is going to control how tall
        for(int i = 0; i < 6; i++){

            // inner loop controls each row
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }

            // last thing in loop
            System.out.println();
        }

    }
}
