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
    private int IDNum;
    private int grade;
    private boolean kelloggStudent;
    private double GPA;

    // Student Constructor
    public Student(String name, int grade, boolean kelloggStudent){
        this.name = name;
        this.grade = grade;
        this.kelloggStudent = kelloggStudent;
        this.IDNum = 9000233;
        this.GPA = 4.0;

    }

    // Instance method
    public void setGPA(double newGPA){
        this.GPA = newGPA;
        System.out.print (name + " now has a GPA of " + GPA);
    }

}

class Client {
    /*
    The client class is where the code/ objects from our other classes
    are used.  So larger programs can have lots of object classes that all get
    used in one client class.
     */
    public static void main(String[] args){
        Student Steve = new Student("Steve", 11, false);
        Student Bob = new Student("Bob Q", 42, false);
        Bob.setGPA(1.0);
    }
}
