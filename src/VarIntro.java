public class VarIntro {
    public static void main(String[] args) {
        int myInteger = 53; // int must be lowercase and is declared without quotation marks, max value 2.1
            bidouble myDouble = 10.7; // double is also lowercase and its value declared without quotes
        boolean myBool = true; // boolean is also lowercase and its value is declared without quotes
        char myChar = 'x'; // char is also lowercase and is declared with apostrophes
        String myString = "wowie\nwow again but on a new line because of \"\\n\"";
        // String is capitalized and is declared with quotes
        /**
         * this is a demonstration of lowerCamelCase, which is considered the standard
         * for variable naming schema in Java.
         * -
         * This is also a JavaDoc comment, which is important to note for later in the year ;)
         */
        Object thisVarHasALongName;
        /**
         * This is the naming schema for final variables, which are variables that are set
         * before the program is run and are never changed during runtime
         */
        final Object THIS_VAR_WILL_NEVER_CHANGE;

        // BONUS DATA TYPES
        byte myByte; // byte is like int, but can only store numbers from -128 to 127
        short myShort; // short is another variant, but it can store numbers from -32768 to 32767
        long myLong; // long is allocated double the memory of int, and can store up to 9.2 quintillion
        float myFloat; // float is a smaller variant of double that is less precise
    }
}
