package Assignment.Patterns;

public class Pattern_four {
    public static void main(String[] args)
    {
        int n=5;

        for (int i= n; i>= 1; i--)
        {
            for (int j=n; j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
//
//        *****
//         ****
//          ***
//           **
//            *

