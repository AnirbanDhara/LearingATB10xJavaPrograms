package ex_17_OOPs.polymorphism.compiletimepolymorphism;

public class AddFunction {

    //double result = 0;

    double add(double a, int b){
        //result = (int)(a+b);
        Double res = a+b;
        //result = d;
        return res;
    }

    double add(int a, int b){
        Double res = Double.valueOf(a+b);
        return res;
    }
}
