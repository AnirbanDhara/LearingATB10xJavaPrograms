package Task_Jan_if_else_programs;

import java.util.Scanner;
public class Character_Alphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().toLowerCase().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Character is an Alphabet");
        }else{
            System.out.println("Character is not an Alphabet");
        }
    }
}
