package Student;
 public class Student{
    private int rollNo;
    private String name;
     void setter(int a, String n){
    rollNo= a;
    name= n;
    System.out.println("setter called");
    }

    public void  getter()
    {
        System.err.println("Getter is called");
        System.out.println("RollNo of student is:" + rollNo);
        System.out.println("Name of student is:" + name);
    } 
}
