public class Cat {
// instance variables (state of the object)
    private String color;
    private String name;
    private int age;

    // constructor
    public Cat(){
        color = "black";
        name = "senior kitty";
        age = 3;
    }

    // Overloaded Constructor
    public Cat(String theColor, String theName){
        color = theColor;
        name = theName;
        age = 0;
    }

    public void printName(){
        // Prints the name instance variable
        System.out.println(name);
    }
    public void changeName(String newName){
        name = newName;
    }
}
