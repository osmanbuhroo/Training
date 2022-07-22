package Day5.Exception.FinallyBlock;

import java.util.Scanner;

public class Finally {

    public static int myMethod()
    {
        Scanner scanner = new Scanner(System.in);
        try {


            return 0;
        }
        finally {
            //finally is used to close all the expensive resource eg:- database connection
            //finally executed always at the end
            System.out.println("Inside Finally block");
            scanner.close();
        }
    }
    public static void main(String args[])
    {
        System.out.println(Finally.myMethod());
    }
}

