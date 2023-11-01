package WEEK_3;

import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of lines: ");
        int row = sc.nextInt();
        for (int i = 0; i <= (row - 1); i++ ){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}