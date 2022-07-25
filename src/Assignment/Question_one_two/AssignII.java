package Assignment;

import java.util.Scanner;

public class AssignII {
    static int power(int N, int P)
    {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number for q :");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        System.out.println("Enter Multiplication Number :");
        int mnum = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println("a :");
            int a = sc.nextInt();
            System.out.println("b :");
            int b = sc.nextInt();
            System.out.println("n :");
            int n = sc.nextInt();
            int num = a;
            for (int j = 0; j < n; j++) {
                int rec =1;
                for(int k=0; k<=j; k++) {
                    if(k == 0) {
                        rec = 1;
                    } else {
                        rec = rec*mnum;
                    }

                }
                num += b*rec;

                //num += (((int) power(2, j)) * b);
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}
