package WEEK_11.APP_1;

public class Main {
    public static void main(String[] args) throws CustomException{
        Calculator calculator = new Calculator();
        try {
            double result1 = calculator.divide(10,1);
            System.out.println(result1);
            double result2 = calculator.divide(10,0);
            System.out.println(result2);
        }
        catch (CustomException exception){
            System.err.println("Hata: " + exception.getMessage());
        }
    }
}
