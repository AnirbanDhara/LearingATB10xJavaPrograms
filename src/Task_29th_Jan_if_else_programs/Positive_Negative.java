package Task_29th_Jan_if_else_programs;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:\n");
        int i = sc.nextInt();

        if( i < 0){
            System.out.println("Negative Number");
        }
        if( i > 0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Number is Zero");
        }

    }
}
