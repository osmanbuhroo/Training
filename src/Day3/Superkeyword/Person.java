package Day3.Superkeyword;



    /* superclass Person */
    class Person
    {
        Person()
        {
            System.out.println("Person class Constructor");
        }
    }

    /* subclass Student extending the Person class */
    class Student extends Person
    {
        Student()
        {
            // invoke or call parent class constructor
            super();

            System.out.println("Student class Constructor");
        }
    }


    class Test
    {
        public static void main(String[] args)
        {
            Student s = new Student();
        }
    }

