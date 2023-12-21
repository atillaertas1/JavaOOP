package WEEK_11.APP_1;

public class Calculator {
    protected double divide(double numberOne, double numberTwo) throws CustomException{
        if (numberTwo == 0){
            throw new CustomException("Sıfıra bölünemez");
        }
        else{
            return numberOne / numberTwo;
        }
    }
}
