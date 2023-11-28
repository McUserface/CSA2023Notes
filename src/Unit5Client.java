public class Unit5Client {

    // What is the error in this code?
    // What value of x is printed to the console?

    public static void main(String[] args){
       Alien steve = new Alien("Steve", true, 8);
       Alien bob = new Alien("bob", "mars", 3);
       steve.setFriendly(false);
       bob.setNumEyes();
       Alien.doesStuff();
       Alien.getMaxEyes();
    }


}
