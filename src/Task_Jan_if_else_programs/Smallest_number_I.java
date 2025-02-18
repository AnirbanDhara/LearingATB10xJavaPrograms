package Task_Jan_if_else_programs;

import java.util.Scanner;
public class Smallest_number_I {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int smallest = (n1 < n2)? n1 : n2;
        System.out.println("Smallest number is :" + smallest);
    }
}
