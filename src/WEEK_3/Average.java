package WEEK_3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        final int COUNT = 10; //count of user input
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        for (int i = 1; i <= COUNT; i++){
            System.out.print("Please enter number " + i + ":");
            double input = sc.nextDouble();
            sum += input;
        }
        System.out.println("AVERAGE:" + (sum / COUNT));
    }
}