package Day4.AcessModifiers.Public_Modifier;
public class PublicCls {

    public void A() {
        final int a = 10;
        System.out.println("a = "+a);
        /*a =a+10; // Complie-time error
        System.out.println("a = "+a);*/
        System.out.println("Calling Public Method A");
    }
}
