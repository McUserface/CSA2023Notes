
public class SrtringLab {

    public static void main(String[] args) {
        helloName("Bob Q");
        System.out.println(makeAbba("Bob", "Q"));
        makeOutWord("^^^^", "--");
    } // closes the main

    public static void makeOutWord(String tag, String text){
        String answer = tag.substring(0,2) + text + tag.substring(2);
        System.out.println(answer);
    } // end of makeOut

    public static void helloName(String name){
        String answer = "Hello " + name + "!";
        System.out.println(answer);
    } // closes helloName

    public static String makeAbba(String a, String b){
        String answer = a+b+b+a;
        return answer;
    } // closes makeAbba

}// closes the class
