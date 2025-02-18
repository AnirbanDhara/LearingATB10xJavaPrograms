package Task_Jan_if_else_programs;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year:");
        int year = sc.nextInt();

        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.printf("%d is Leap Year\n",year);
        }else{
            System.out.printf("%d is not Leap Year\n",year);
        }
    }
}
