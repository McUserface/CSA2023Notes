public class Notes_2_1 {
    /*
    This section shows us how we can use classes to represent objects
    in our programming, and how we use objects
     */
}

/*
This is NOT great style.  I really should be creating a separate Java file
for each class
 */
class Student{
    /*
    Object class to represent a student at Shorecrest.  This class is a
    template I can use to make instances of Student objects later.
     */
    private String name;
}

class Client {
    /*
    The client class is where the code/ objects from our other classes
    are used.  So larger programs can have lots of object classes that all get
    used in one client class.
     */
    public static void main(String[] args){
        Student person = new Student();
    }
}
