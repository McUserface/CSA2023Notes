
public class Notes_3_2 {
    /*Now we have else statements.  These are your default outcomes
    for an if (later if-else blocks).
     */
    public static void main(String[] args){

    }

    /* Return heads or tails, based on a random int

     */
    public static String coinToss(){
        int randy = (int)(Math.random()*2);
        if(randy == 0){
            return "heads";
        }
        else{
            return "tails";
        }
    }

}
