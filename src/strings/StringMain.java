package strings;

public class StringMain {
    public static void main(String[] args){
        StringBuffer str1 = new StringBuffer("Hello");
        str1.append("World!");
        System.out.println(str1); // Modifies str1 to "HelloWorld!"

        StringBuilder str2 = new StringBuilder("My");
        str2.append("Country");
        System.out.println(str2); // modifies str2 to "My Country"

        int str1_length = str1.length();
        System.out.println(str1_length);

        int str2_length = str2.length();
        System.out.println(str2_length);

    }
}
