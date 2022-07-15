package Day3.VariableShowdowing;

public class Shadowing {
    String name ="akshay";
      void test (){
          String name= "sahil";
          System.out.println(this.name);
      }

    public static void main(String[] args) {
        Shadowing shadowing = new Shadowing();
        shadowing.test();
    }

}
