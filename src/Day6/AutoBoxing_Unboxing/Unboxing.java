package Day6.AutoBoxing_Unboxing;


import java.util.ArrayList;

class Unboxing {


    public static void Unboxing(int number) {
        System.out.println(number);
    }

    public static void main(String[] args) {

        Integer number = new Integer(100);
        Unboxing(number);

        //Autoboxing - int primitive to Integer
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(11);
        arrayList.add(22);

    }
}