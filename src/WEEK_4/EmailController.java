package WEEK_4;

import java.util.Scanner;
public class EmailController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String emailInput = sc.next();
        System.out.println(emailInput);
        if (emailInput.contains("@") && (emailInput.endsWith(".com"))){
            System.out.println("ok");
        }
        else{
            System.out.println("error");
        }
    }
}