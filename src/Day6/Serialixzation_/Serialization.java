package Day6.Serialixzation_;

import java.io.*;

class Serialization implements Serializable {
    public  Long Id;
    public  String Name;
    public  String  Department;
    public  String  Address;



    public Serialization() {
    }

    public Serialization(Long id, String name, String department, String address) {
        Id = id;
        Name = name;
        Department = department;
        Address = address;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
class  Serialize {
    public static void main(String[] args) throws IOException {
        Serialization serialization = new Serialization(630L, "Sahil Amin", "Devlopment", "Kashmir");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/Day6/Serialixzation_/employee.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(serialization);

        } catch (FileNotFoundException e) {
            System.out.println("file not found :" + e);

        }
        System.out.println("Serialzation Done!!");
    }
}
