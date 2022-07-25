package Day6.Enumeration;

class enumeration
{
    enum E
    {
        a, b, c, d;
    }
    public static void main(String[] args)
    {
        E e1 = E.b;
        System.out.println(e1);
        E e2 = E.d;
        System.out.println(e2);
        System.out.println(e1.ordinal());
        //ordinal() is used to get the position of that enum
        System.out.println(e2.ordinal());
        System.out.println(E.valueOf("a").ordinal());
    }
}