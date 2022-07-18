package DAY4.Encapsulation;

 class Employee {

    private Long empId;
    private String empName;
    private double age;
    private String department;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee() {
    }

    public Employee(Long empId, String empName, double age, String department) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

}
class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpName("sahilamin");
        employee.setEmpId(123L);
        employee.setAge(22);
        employee.setDepartment("development");

        System.out.println(employee);
    }
}

