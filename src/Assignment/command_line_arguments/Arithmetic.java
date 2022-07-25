package Assignment.command_line_arguments;

public class Arithmetic {

    private final String[] operators = {"`+`", "`-`", "`*`", "`/`"};

    public static void main(String[] args) {
        Arithmetic aArithmetic = new Arithmetic();

        if ( ! aArithmetic.isInputValid(args)) {
            System.out.println("Arguments are invalid.");
            return;
        }
        aArithmetic.run(args);
    }

    private boolean isInputValid(String[] args)
    {
        if (args.length != 3) {
            return false;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
        }
        catch(NumberFormatException e){
            return false;
        }

        boolean result = false;
        for(String operator : operators)
        {
            if (args[2].equals(operator)) {
                result = true;
                break;
            }
        }
        return result;
    }

    private void run(String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int result = -1;
        switch(args[2]) {
            case "`+`": result = num1 + num2; break;
            case "`-`": result = num1 - num2; break;
            case "`*`": result = num1 * num2; break;
            case "`/`": result = num1 / num2; break;
        }
        System.out.println(num1 + args[2].replace("`", "") + num2 + "=" + result);
    }
}