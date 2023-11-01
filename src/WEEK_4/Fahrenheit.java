package WEEK_4;

public class Fahrenheit {
    public static void main(String[] args) {
        double degree = 20.0;
        for (int i = 20; i <= 35; i++){
            double degreeToFahrenheit = ((degree * (9.0 / 5.0)) + 32);
            degree = degree + 1.0;
            System.out.printf("%.2f\n", degreeToFahrenheit);
        }
    }
}