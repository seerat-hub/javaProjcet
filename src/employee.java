import java.util.Scanner;
class MyEmployee{
  private  int id;
   private String name;
    String getName(){
        return name;
    }
    void setName(String n){
        name = n;
    }
    int getId(){
        return id;
    }
    void setId(int I){
        id = I;
    }
}
public class employee {
    public static void main(String[] args)  throws Exception{
        MyEmployee obj = new MyEmployee();
        obj.setName("seerat" );
        System.out.println("seerat");
        obj.setId(36);
        System.out.println("36");
    }
}
