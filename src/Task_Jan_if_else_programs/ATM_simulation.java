package Task_Jan_if_else_programs;

import java.util.Scanner;
public class ATM_simulation {
    public static void main(String[] args){
        int account_balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdraw amount:");
        int amount = sc.nextInt();

        if(amount != 0 &&(amount % 100 == 0) && amount <= 10000){
            int updated_balance = account_balance - amount;
            System.out.println("Updated balance is:" + updated_balance);
        }else{
            System.out.println("Unsuccessful withdraw");
        }
    }
}
