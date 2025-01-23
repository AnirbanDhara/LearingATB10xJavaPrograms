package ex_03_Operators;

public class Lab005_Ternary_Operators {
    public static void main(String[] args){
        String Name = args[0];
        String Age = args[1];
        int age = Integer.parseInt(Age);
        String Salary = args[2];
        int salary = Integer.parseInt(Salary);

        System.out.printf("Name is: %s\n",Name);
        System.out.printf("Age is: %d\n",age);
        System.out.printf("Salary is: %d\n",salary);


    }
}
