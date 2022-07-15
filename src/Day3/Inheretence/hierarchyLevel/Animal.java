package Day3.Inheretence.hierarchyLevel;

class Animal
{
    void walk()
    {
        System.out.println("Walk");
    }
    void eat()
    {
        System.out.println("eat food");
    }
}
class Cow extends Animal //Cow is-a Animal
{
    void giveMilk() {
        System.out.println("cow give milk");
    }

    void sound() {
        System.out.println("ambaa...ambaaa");
    }
}
class Dog extends Animal //Dog is-a Animal
{
    void sound()
    {
        System.out.println("bow...bow");
    }
}
 class Test {
    public static void main(String[] args) {
        Animal a = new Cow();
        a.walk();
        a.eat();
       // a.giveMilk(); //not possible Parent reference cant accesses child member
       // a.sound(); //not possible Parent reference cant accesses child member
       // Dog d = new Animal(); //not possible because child reference cannot be give to Parent object
        Cow c = new Cow();
        c.walk();
        c.eat();
        c.sound();
        c.giveMilk();
    }
}