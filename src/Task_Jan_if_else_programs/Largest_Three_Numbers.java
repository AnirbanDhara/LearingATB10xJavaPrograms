package Task_Jan_if_else_programs;

import java.util.Scanner;
public class Largest_Three_Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me 3 numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int max_num = (n1 > n2)?((n1 > n3)? n1 : n3) :(( n2 > n3)? n2 : n3);
        System.out.println("Maximum number is:"+ max_num);
    }
}
