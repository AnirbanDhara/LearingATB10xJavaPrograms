package exception_handling;

public class Lab25_Unchecked {
    public static void main(String[] args)
    {
//        int c = 0;
//        int b = 10;
//        int a = b/c;
//
//        System.out.println(a);

        // Unchecked -- ArithmeticException, NullPointerException

        // Exception in thread "main" java.lang.ArithmeticException: / by zero --> Unchecked Exception --> JVM doesn't know

        String name = null;
        name.trim();

        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.trim()"
    }
}
