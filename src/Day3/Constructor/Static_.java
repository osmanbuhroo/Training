package Day3.Constructor;

public class Static_ {
    static String CollageName= "saint Joseph";
     String StudentName;

    public static void main(String args[]){
        Static_ static_ = new Static_();

        static_.StudentName="sahil amin";

        System.out.println(static_.StudentName + " from "+ CollageName);
    }


}

