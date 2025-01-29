package Task_29th_Jan_if_else_programs;

import java.util.Scanner;
public class Voting_Eligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Ineligible to vote");
        }
    }
}
