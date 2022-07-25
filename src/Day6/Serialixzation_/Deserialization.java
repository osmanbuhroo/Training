package Day6.Serialixzation_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {


    public static void main(String[] args)  {

    }

        Serialization serialization =null;

        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;

    {
        try {
            fileInputStream = new FileInputStream("src/Day6/Serialixzation_/employee.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            serialization= (Serialization)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();



        } catch (FileNotFoundException e) {
            System.out.println("file not found :" + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(serialization.getId());
        System.out.println(serialization.getName());
        System.out.println(serialization.getDepartment());
        System.out.println(serialization.Address);

    }




}
