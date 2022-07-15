package Day2.ControlStmt;

import java.util.Scanner;

public class Do_While {
    static String dectobin(int n){
        String bin="";
        while(n>0){
            int r=n%2;
            bin=r+bin;
            n=n/2;
        }
        return bin;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=sc.nextInt();
        String bin=dectobin(n);
        System.out.println("the binary of "+n+" is "+bin);
    }

}
