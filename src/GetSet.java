import java.util.Scanner;
class Student{
    private int rollNo;
    private String name;
     void setter(int a, String n){
    rollNo= a;
    name= n;
    System.out.println("setter called");
    }

 void  getter()
{
    System.err.println("Getter is called");
    System.out.println("RollNo of student is:" + rollNo);
    System.out.println("Name of student is:" + name);
} 
}


public class GetSet{
    public static void main(String[] args) throws Exception {
        Class obj = new Class();
        obj.setter(2, "seerat");
        obj.getter();
    }
}