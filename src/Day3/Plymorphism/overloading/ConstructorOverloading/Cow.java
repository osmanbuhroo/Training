package Day3.Plymorphism.overloading.ConstructorOverloading;

class Cow
{
    public Cow()
    {
        System.out.println("I am in Cow() constructor.....!");
    }
    public Cow(int leg)
    {
        System.out.println("I am in Cow(int leg) constructor.....!");
    }
    public Cow(double height)
    {
        System.out.println("I am in Cow(double hight) constructor.....!");
    }
    public Cow(int ears , int mouth)
    {
        System.out.println("I am in Cow(int ears , int mouth) constructor.....!");
    }
}
