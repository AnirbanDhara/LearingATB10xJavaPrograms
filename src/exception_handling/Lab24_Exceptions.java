package exception_handling;

public class Lab24_Exceptions {
    public static void main(String[] args)
    {
        System.out.println("Start of the program");

        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 100/a;

        System.out.println(b);
        System.out.println("End of the program");
    }

    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    // Exception in thread "main" java.lang.NumberFormatException: For input string: "ads"
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0


}
