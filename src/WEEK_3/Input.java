package WEEK_3;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double userInput = sc.nextDouble();
        double sum = 0;

        for (int i = 0; i <= userInput; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}