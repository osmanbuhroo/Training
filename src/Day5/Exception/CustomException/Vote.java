package Day5.Exception.CustomException;

public class Vote extends Exception
{
    public String toString()
    {
        return "Sorry you are too young to Vote";
    }
    public String getMessage()
    {
        return "Sorry you are still a kid to Vote";
    }
}
 class Verify
{
    void check(double age) throws Vote
    {
        if(age<18)
        {
            throw new Vote();
        }
        else
        {
            System.out.println("Welcome to pub enjoy have masthi");
        }
    }}
