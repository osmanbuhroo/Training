package Day3.Constructor;

public class Constructor {
  public Constructor (){
      int a=10;
      int b=5;
      int c;
      c=a+b;
      System.out.println("*****Default Constructor*****");
      System.out.println("Total of 10 + 5 = "+c);
  }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
    }
}