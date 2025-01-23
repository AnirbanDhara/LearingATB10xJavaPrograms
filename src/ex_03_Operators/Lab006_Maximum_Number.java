package ex_03_Operators;

public class Lab006_Maximum_Number {
    public static void main(String[] args) {
        String first_number = args[0];
        int First_number = Integer.parseInt(first_number);
        String second_number = args[1];
        int Second_number = Integer.parseInt(second_number);

        int max_number = (First_number > Second_number) ? First_number : Second_number;

        System.out.println(max_number);
    }
}
