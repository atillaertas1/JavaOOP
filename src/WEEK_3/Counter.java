package WEEK_3;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        boolean control = true; // checking the status of entering 0
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //System.out.println(input);

        while (control) {
            if (input > 0) {
                while (input != 0) {
                    System.out.println(input);
                    input--;
                }
                System.out.println(input); // printing 0
                control = false;
            } else if (input < 0) {
                while (input != 0) {
                    System.out.println(input);
                    input++;
                }
                System.out.println(input); // printing 0
                control = false;
            } else {
                System.out.println("Please enter a value different from 0!");
                input = sc.nextInt();
            }
        }
    }
}