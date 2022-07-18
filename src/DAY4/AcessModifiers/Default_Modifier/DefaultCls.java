package DAY4.AcessModifiers.Default_Modifier;

public class DefaultCls {
    void A() { // Default method can access within package, not outside.
        System.out.println("Default Method A()");
    }

    protected void protectA() { // Default method can access within package, not outside.
        System.out.println("Protect Method within default class.");
    }
}

class DefaultMain {
    public static void main(String[] args) {
        DefaultCls dc = new DefaultCls();

        dc.A();
        dc.protectA();
    }
}
