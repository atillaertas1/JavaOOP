package WEEK_4;

import java.util.Scanner;
public class Divider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int sum = 0;
        int counter = 0;
        System.out.println("USER-INPUT" + userInput);

        for (int i = 1; i <= userInput; i++){
            if ((userInput % i) == 0 ){
                sum += i;
                counter++;
                System.out.println(counter + ". = " + i);
            }
        }
        System.out.println("COUNTER:"+ counter);
        System.out.println(sum / counter);
    }
}