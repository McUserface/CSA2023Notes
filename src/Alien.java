/**
 * Models an Alien from outer space
 * @author Eric Allen
 * @version 1.0 1/11/24
 */

public class Alien {

    private static int maxEyes = 25;
    private static int currentID = 1;

    // VARIABLES
    // Instance Variables (Fields)
    private String name;
    private boolean friendly;
    private int numEyes;
    private int IDNum;

    /**
     * Standard constructor for an Alien object
     * @param nameP String representing the name of the Alien
     * @param friendlyP boolean tracking if friendly
     * @param numEyesP int for the number of eyes
     */
    public Alien(String name, boolean friendly, int numEyes){
        this.name = name;
        this.friendly = friendly;
        this.numEyes = numEyes;
        if(numEyes > maxEyes){
            numEyes = 25;
        }
        this.IDNum = currentID;
        currentID++;
    }


    /**
     * Constructor that determines intentions based on planet
     * @param nameP String representing the name of the Alien
     * @param planetP String for planet of origin
     * @param numEyesP int for the number of eyes
     */
    public Alien(String name, String planet, int numEyes){
        this.name = name;
        this.numEyes = numEyes;
        if(planet.equalsIgnoreCase("mars")){
            friendly = false;
        } else {
            friendly = true;
        }
        this.IDNum = currentID;
        currentID++;
    }

    /**
     * Accessor method for the name field
     * @return String that is the current value for name
     */
    public String getName(){
        return name;
    }

    /**
     * Accessor method for if the alien is friendly
     * @return true if friendly, false if not
     */
    public boolean getFriendly(){
        return friendly;
    }

    /**
     * Accessor method for the number of eyes
     * @return int representing the number of eyes
     */
    public int getNumEyes(){
        return numEyes;
    }

    /**
     * Mutator method for the name field
     * @param newName String that will be the new name of Alien
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Mutator for the friendly field
     * @param newFriendly boolean representing friendly or not
     */
    public void setFriendly(boolean newFriendly){
        friendly = newFriendly;
    }

    /**
     * Mutator method for number of eyes
     * Randomly generates a number between 1 and 8
     */
    public void setNumEyes(){
        numEyes = (int)(Math.random()*8+1);
    }

    /**
     *
     * @return
     */
    public String toString(){
        return "I am an alien called " + name + " with " + numEyes + " eyes.";
    }

    /**
     * Tests to see if two aliens get along
     * @param other is Alien to compare to
     * @return true or false (if they get along or not)
     */
    public boolean getAlong(Alien other){
        return this.friendly == other.friendly;
    }

    /**
     * Could not think of a good static method for this class
     */
    public static void doesStuff(){
        System.out.println("This does something else");
    }

    public static int getMaxEyes(){
        return maxEyes;
    }

}
