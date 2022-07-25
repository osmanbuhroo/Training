package Day6.Strings;

import java.util.Scanner;

class Is_String_Palaindrome {

        static boolean ispalindrom(String st){
            int i=0;
            while(i<st.length()/2){
                if(st.charAt(i)!=st.charAt(st.length()-1-i))
                    return false;
                i++;
            }
            return true;
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the sentence.");
            String s=sc.nextLine();
            boolean str=ispalindrom(s);
            if(str)
                System.out.println(s+" is palindrom");
            else
                System.out.println(s+ " not palindrom");
        }
    }

    //we can do this by using String buffer and builder also both


class  Is_String_Palaindrome_{
        public static void main(String[] args) {
            String str = "emme";
            StringBuffer buffer = new StringBuffer(str);
            buffer.reverse();
            String res = buffer.toString();
            if(str.equals(res)){
                System.out.println(" palindrome");
            }else{
                System.out.println(" not palindrome");
            }
        }
    }



