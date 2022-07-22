package Day4.AllOpps;



class Student{
    private String StudentName;
    private  String Department;
    private  Long StudentId;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Long getStudentId() {
        return StudentId;
    }

    public void setStudentId(Long studentId) {
        StudentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentName='" + StudentName + '\'' +
                ", Department='" + Department + '\'' +
                ", StudentId=" + StudentId +
                '}';
    }



    public void display() {
        System.out.println("I am student");
    }
}
class Collage extends Student {

    @Override
    public void display() {
        System.out.println("I am Collage");
    }
    public int getAge(int age) {
        return age;
    }
    //Overload
    public double getPerc(double perc) {
        return perc;
    }
}
class Test {

    public static void main(String[] args) {
        Student student=new Student();
        student.display(); //Displays "I am student"
        student.setStudentId(630L);
        student.setStudentName("sahilamin");
        student.setDepartment("devlopment");
        System.out.println(student);
        Collage collage=new Collage();
        collage.display(); //Displays "I am "collage
        System.out.println(collage.getAge(23)); //displays age
        System.out.println(collage.getPerc(70.0));
        student= collage; //student acts as a reference to the object Student
        student.display(); //dynamic polymorphism or dynamic method dispatch, displays "I am Collage"
    }
}

