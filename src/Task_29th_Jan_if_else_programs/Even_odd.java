package Task_29th_Jan_if_else_programs;


import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:\n");
        int i = sc.nextInt();

        if(i % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
