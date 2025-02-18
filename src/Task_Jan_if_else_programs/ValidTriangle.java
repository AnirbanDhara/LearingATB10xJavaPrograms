package Task_Jan_if_else_programs;

import java.util.Scanner;
public class ValidTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Specify 3 sides:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a+b) > c && (b+c) > a && (c+a) > b){
            System.out.println("Triangle is valid");
        }else{
            System.out.println("Triangle is not valid");
        }
    }
}
