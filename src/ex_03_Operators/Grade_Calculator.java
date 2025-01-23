package ex_03_Operators;

public class Grade_Calculator {
    public static void main(String[] args) {
        String num = args[0];
        int marks = Integer.parseInt(num);

        String grade = (marks >= 90 && marks <= 100)? "A" : (marks >= 80 && marks <= 89)? "B" :(marks >= 70 && marks <= 79)? "C" : (marks <= 60 && marks >=69)? "D": "F";
        System.out.println(grade);
    }
}
