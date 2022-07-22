package Day4.AcessModifiers.Private_Modifier;

public class PrivateCls {
    private void A() { // Private methods can access within the class only
        System.out.println("Private Method A");
    }

    void defaultMet() {
        System.out.println("Default Method in different package.");
    }

    /*public static void main(String[] args) {
        PrivateCls priv = new PrivateCls();
        priv.A();
    }*/
}

class PrivateMain {
    public static void main(String[] args) {
        PrivateCls priv = new PrivateCls();

        //priv.A();//Compile-Time error
        //priv.defaultMet();
    }
}
