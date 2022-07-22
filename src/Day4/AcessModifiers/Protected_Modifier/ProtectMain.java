package Day4.AcessModifiers.Protected_Modifier;

import Day4.AcessModifiers.Default_Modifier.DefaultCls;
import Day4.AcessModifiers.Public_Modifier.PublicCls;

class ProtectMain extends DefaultCls {
    public static void main(String[] args) {
        ProtectMain dc = new ProtectMain();
        PublicCls pc = new PublicCls();

        dc.protectA();
        pc.A();
    }


}