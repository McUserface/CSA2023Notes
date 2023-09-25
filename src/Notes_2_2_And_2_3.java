public class Notes_2_2_And_2_3 {
    /*
    Again, my style is not the preferred way to use multiple classes but what is
    necessary to keep all the notes in a single file
     */
}

/*
A client class is the class that uses the code we write in the other classes
 */
class Client2_2{
    public static void main(String[] args){
        /*
        This is what you will be expected to do for the end of this unit on
        the exam.  If you have the classes written for you, can you create
        instances of the objects and call the methods?
         */
        Cat kitty = new Cat();
        Cat gato = new Cat("orange", "thomas o'malley");
        // Now I want to call mehods on object
        kitty.printName();
        System.out.println(gato);
        // name.method();
    }
}

/*
This class will be the basis for our notes, where we will learn about Constructors
and void methods
 */
class Cat{
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
