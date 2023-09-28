public class Bigfoot {
    // 2-3 instance variables
    private boolean hasBeenFound;
    private int population;
    // Constructor
    public Bigfoot(){
        population = 1;
        hasBeenFound = false;
    }
    // 1-2 void methods

    // 1-2 return methods
    public int increasePop(int increase){
        population += increase;
        return population;
    }

}
