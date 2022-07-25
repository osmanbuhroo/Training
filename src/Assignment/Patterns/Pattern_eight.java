package Assignment.Patterns;

import java.util.Scanner;

public class Pattern_eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n number : ");
        int input=sc.nextInt();
        for(int i=0;i<input-1;i++)
        {

            for(int j=0;j<input;j++)
            {

                if(i%2==0) {
                    System.out.print("#"+" ");
                }
                else
                    System.out.print(" "+"#");
            }

            System.out.println();
        }
    }

}

//
//
//          # # # # # # # #
//         # # # # # # # #
//          # # # # # # # #
//         # # # # # # # #
//          # # # # # # # #
//         # # # # # # # #

