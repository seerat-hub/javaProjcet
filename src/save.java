import java.util.Scanner;
class MyEmployee{
   private int id;
   private String name;
   public String getName(){
        return name;
    }
  public  void setName(String n){
        name = n;
    }
   public int getId(){
        return id;
    }
   public void setId(int I){
        id = I;
    }
}

public class save {
    public static void main(String[] args)  throws Exception{
        MyEmployee obj = new MyEmployee();
        obj.setName("seerat" );
        System.out.println("seerat");
        obj.setId(36);
    }
}
