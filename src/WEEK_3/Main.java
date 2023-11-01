package WEEK_3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_1 = sc.nextInt();
        int number_2 = sc.nextInt();

        if (number_1 > number_2){
            System.out.println(number_1);
        }
        else if(number_2 > number_1){
            System.out.println(number_2);
        }
        else{
            System.out.println("Hello world!");
        }
    }
}