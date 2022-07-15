package Day1;

import java.util.Scanner;

public class Operators {
    public void arithmetic(int a,int b) {
        System.out.println("Add :"+(a+b));
        System.out.println("Sub :"+(a-b));
        System.out.println("Div :"+(a/b));
        System.out.println("Mod :"+(a%b));
    }
    public void comparison(int a,int b) {
        if(a>b)System.out.println("a is greater than b");
        else if(b>a) System.out.println("b is greater than a");
        else System.out.println("both are equals");
    }
    public void logical(int a) {
        if(a%400==0 || a%4==0 && a%100!=0) {
            System.out.println("Its a leap year");
        }
        else System.out.println("not a leap year");
    }
    public int ternary(int a , int b){

        int max = (a > b) ? a : b;

        return max;
    }

    public static void main(String[] args) {
        Operators op=new Operators();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to for Arithmetic operator");
        int a=sc.nextInt();
        int b=sc.nextInt();
        op.arithmetic(a,b);
        op.comparison(a, b);
        System.out.println(op.ternary(a,b));

        System.out.println("enter the year to check leap year or not");
        int year=sc.nextInt();
        op.logical(year);
        sc.close();



    }
}
