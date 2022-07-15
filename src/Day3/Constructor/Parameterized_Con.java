package Day3.Constructor;

public class Parameterized_Con {

    String name;
    int age, salry;
    double hight;

    Parameterized_Con(String name, double hight, int age, int salry) {
        this.name = name;
        this.hight = hight;
        this.age = age;
        this.salry = salry;
    }

    void detailsOfAge() {
        System.out.println("My sweetHeart name is " + name + " and the age is " + age);
    }

    void fullDetails() {
        System.out.println("My sweetHeart name is " + name + " and the age is " + age + " hight is " + hight + " and get a salry rs " + salry);
    }

    public static void main(String[] args) {
        Parameterized_Con ref1 = new Parameterized_Con("Geetha", 4.9, 20, 15000);
        ref1.fullDetails();
        Parameterized_Con ref2 = new Parameterized_Con("Ramesh", 5.5, 18, 20000);
        ref2.fullDetails();
//To print only name and age call detailsOfAge()
        ref1.detailsOfAge();
        ref2.detailsOfAge();
    }
}



