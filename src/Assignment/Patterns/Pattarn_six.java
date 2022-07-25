package Assignment.Patterns;

public class Pattarn_six {
    public static void main(String args[]) {
        int n = 8;

        //upper part
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//                   *
//                  ***
//                 *****
//                *******
//               *********
//              ***********
//              *************
//             ***************