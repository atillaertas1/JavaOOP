package WEEK_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        System.out.println("***************************************");
        System.out.println("1:");
        int number1 = sc.nextInt();
        System.out.println("2:");
        int number2 = sc.nextInt();
        System.out.println("3:");
        int number3 = sc.nextInt();

        int theBiggest = main.biggestInt(number1,number2,number3);

        System.out.println("Biggest:" + theBiggest);

        System.out.println("***************************************");

        System.out.println("1:");
        number1 = sc.nextInt();
        System.out.println("2:");
        number2 = sc.nextInt();
        System.out.println("3:");
        number3 = sc.nextInt();

        main.average(number1,number2,number3);

        System.out.println("***************************************");

        System.out.println("String:");
        String st= sc.next();

        char middleChar = main.stringControl(st);

        System.out.println(middleChar);

        System.out.println("***************************************");

        System.out.println("String:");
        st = sc.next();

        int length = main.stringLength(st);

        System.out.println(length);

        System.out.println("***************************************");

        System.out.println("3 digit number:");

        number1 = sc.nextInt();

        main.threeDigitSum(number1);

        System.out.println("***************************************");

        System.out.println("1:");
        number1 = sc.nextInt();

        System.out.println("2:");
        number2 = sc.nextInt();

        System.out.println("3:");
        number3 = sc.nextInt();

        System.out.println(main.averageControl(number1,number2,number3));

    }

    public int biggestInt(int number1,int number2,int number3){
        if(number1 > number2 && number1 > number3){
            return number1;
        }
        else if(number2 > number1 && number2 > number3){
            return number2;
        }
        else if(number3 > number1 && number3 > number2){
            return number3;
        }

        return 0;
    }

    public void average(int number1,int number2,int number3){
        System.out.println( "Average: " + (double) (number1 + number2 + number3) / 3);
    }

    public char stringControl(String st) {
        int length = st.length();

        if (length % 2 == 0) {
            return st.charAt(length / 2 - 1);
        } else {
            return st.charAt(length / 2);
        }
    }

    public int stringLength(String st){
        return st.length();
    }

    public void threeDigitSum(int number){
        int onesDigit = number % 10;
        int tensDigit = (number / 10) % 10;
        int hundredsDigit = number / 100;

        System.out.println(onesDigit + tensDigit + hundredsDigit);
    }


    public boolean averageControl(int number1,int number2,int number3){
        double average = (double) (number1 + number2 + number3) / 3;
        return average == (double) number2;
    }
}