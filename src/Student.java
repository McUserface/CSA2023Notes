public class Student{
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
