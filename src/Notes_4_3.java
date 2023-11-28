public class Notes_4_3 {

    public static void main(String[] args){
        reverseString("Example");
        replaceChars("example", 'e');
        countDoubles("aaaaaaaaaa");
    }


    /**
     * Method reverses any string
     * @param String to be reversed
     * @return the reversed String
     */
    public static String reverseString(String text){
        String reversed = "";
        for(int i = text.length()-1; i > -1 ; i--) {
            if (i == text.length() - 1) {
                reversed += text.charAt(i);
                reversed = reversed.toUpperCase();
            } else if (i == 0) {
                reversed += text.substring(0,1).toLowerCase();
            } else {
                reversed += text.charAt(i);
            }
        }

        System.out.println(reversed);
        return reversed;
    }

    public static String replaceChars(String text, char e){
        String result = text;
        if(text.indexOf(e) == -1){
            return result;
        }
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == e) {
                result = result.substring(0, i) + "*" + result.substring(i + 1);
            }
        }
        System.out.println(result);
        return result;
    }

    public static int countDoubles(String text){
        String lowered = text.toLowerCase();
        int total = 0;
        for(int i = 0; i < lowered.length()-1; i++){
            if(lowered.charAt(i) == lowered.charAt(i+1)){
                total++;
            }
        }
        System.out.println(text + " has " + total + " doubles");
        return total;
    }
}
