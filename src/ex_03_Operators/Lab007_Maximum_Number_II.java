package ex_03_Operators;

public class Lab007_Maximum_Number_II {
    public static void main(String[] args){

        int num1 = 65 , num2 = 40, num3 = 85;

        int max_num = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println(max_num);
    }
}
