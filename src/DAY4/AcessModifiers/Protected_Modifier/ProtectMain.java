package DAY4.AcessModifiers.Protected_Modifier;

import DAY4.AcessModifiers.Default_Modifier.DefaultCls;
import DAY4.AcessModifiers.Public_Modifier.PublicCls;

class ProtectMain extends DefaultCls {
    public static void main(String[] args) {
        ProtectMain dc = new ProtectMain();
        PublicCls pc = new PublicCls();

        dc.protectA();
        pc.A();
    }


}