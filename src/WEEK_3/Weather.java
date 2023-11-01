package WEEK_3;

import java.util.Scanner;

public class Weather {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        double sum = 0;
        int i = 0;
        boolean control = true;

        do {
            System.out.print("Please enter the temperature " + (i + 1) + " : ");
            temp = sc.nextInt();
            if (temp == -1){
                System.out.println((i) + " temperature values entered");
                System.out.println("AVERAGE TEMP:" + (sum / i));
                control = false;
            }else{
                System.out.println("INPUTED TEMP:"+temp);
                sum += temp;
                i++;
            }
            //System.out.println("TOTAL TEMP:" + sum);
        }
        while (control);
    }

}