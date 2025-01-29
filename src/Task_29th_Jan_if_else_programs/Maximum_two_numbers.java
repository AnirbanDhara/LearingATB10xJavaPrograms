package Task_29th_Jan_if_else_programs;

import java.util.Scanner;

public class Maximum_two_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("Maximum Number is :" + num1);
        }
        else{
            System.out.println("Maximum Number is :" + num2);
        }
    }
}
