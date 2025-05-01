package exception_handling;

public class Lab27_Handling {
    public static void main(String[] args){

        System.out.println("Start of the program");

        int b = 0;
        int a = 100;

        try{
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            //System.out.println(e.getMessage());
            
            e.printStackTrace(); // This means full problem detail with line number

            //System.out.println("/ by zero is not allowed!");
        }

        System.out.println("End of the program");
    }
}
