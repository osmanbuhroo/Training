package Day1;

public class Varables {
    int num;
    double dnum;
    public static void main(String[] args) {
        //Primitive DataType
        byte b=3;
        short s=20;
        long l=10L;
        int a=10;
        double d=10.20;
        float f=10.20F;
        char ch='A';
        boolean bol=false;

        System.out.println("Byte:"+b);
        System.out.println("Short:"+s);
        System.out.println("long:"+l);
        System.out.println("Integer:"+a);
        System.out.println("Double:"+d);
        System.out.println("float:"+f);
        System.out.println("Char:"+ch);
        System.out.println("Boolean:"+bol);

        //instance variable
        Varables varables=new Varables();
        varables.num=10;
        varables.dnum=10.50;
        System.out.println(varables.num);
        System.out.println(varables.dnum);
    }

}