package Day2.ControlStmt;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the country code");
        int i = sc.nextInt();

        switch(i){
            case 1:
                System.out.println("U.S.A");
                break;

            case 91:
                System.out.println("India");
                break;

            case 92:
                System.out.println("Pakistan");
                break;

            case 54:
                System.out.println("Argentaina");
                break;

            case 93:
                System.out.println("Afganistan");
                break;

            default:
                System.out.println("Record Not present");
                break;
        }
    }
}
