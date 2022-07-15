package Day2.ControlStmt;

public class If_Else {
    public static void main(String[] args) {

            int x = 25;

            if (x > 10)
            {
                if (x%2==0)
                    System.out.println("i is greater than 10 and even number");
                else
                    System.out.println("i is greater than 10 and odd number");
            }
            else
            {
                System.out.println("i is less than 10");
            }
            System.out.println("After nested if statement");
        }
    }

