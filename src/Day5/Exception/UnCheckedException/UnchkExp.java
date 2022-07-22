package Day5.Exception.UnCheckedException;
public class UnchkExp {
    public static void main(String[] args) {
        String s = "Sahil";
        try {
            int i = Integer.parseInt(s);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Sorry "+s+" cannot be converted to int");
        }
        String name=null;
        try {
            int len = name.length();
        }
        catch (NullPointerException e)
        {
            System.out.println("Sorry you are trying to get something from null");
        }
        int a[] = new int[5];
        try {
            a[6] = 95;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Sorry you are crossing the size limit of array");
        }
    }
}