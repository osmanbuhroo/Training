package Day6.Wrapperclass;

public class Wrapper {
    public static void main(String[] args) {
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length());
        int a = 5;
        double b = 5.66;
        Integer abc =  Integer.valueOf(a);
        Double def  = Double.valueOf(b);
        if (abc instanceof Integer){
            System.out.println("An object of Integer is created.");
        }
        if (def instanceof Double){
            System.out.println("An object of Double is creted.");
        }
    }

}
