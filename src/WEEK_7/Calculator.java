package WEEK_7;

public class Calculator {
    int sum(int number1,int number2){
        return number1 + number2;
    }
    double sum(double number1,double number2){
        return number1 + number2;
    }
    int multiplication(int number1,int number2){
        return number1 * number2;
    }
    double multiplication(double number1, double number2){
        return number1 * number2;
    }
    double multiplication(double number1,double number2,double number3){
        return  number1 * number2 * number3;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("result: "+calculator.sum(10,20));
        System.out.println("result: "+calculator.sum(10.0,20.0));
        System.out.println("result: "+calculator.multiplication(10,20));
        System.out.println("result: "+calculator.multiplication(10.0,20.0));
        System.out.println("result: "+calculator.multiplication(10.0,20.0,30.0));
    }
}