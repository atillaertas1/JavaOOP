package WEEK_4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Select the option");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication ");
            System.out.println("4. Division");

            int userOption = sc.nextInt();

            if (userOption == 0){
                System.out.println("Program ended.");
                break;
            }

            double result = 0;

            switch (userOption){
                case 1:
                    while (true){
                        System.out.println("Enter a number");
                        double userInput = sc.nextDouble();
                        //System.out.println("*****************USERINPUT"+userInput);
                        if (userInput == 0){
                            //System.out.println("*****************0 GIRILDI");
                            break;
                        }
                        else if(userInput < 0){
                            //System.out.println("*****************NEGATIF GIRILDI");
                            System.out.println("You entered a negative number.Are u sure?");
                            System.out.println("Yes: 1, No: Any number");
                            int negativeControl = sc.nextInt();
                            //System.out.println("*****************CEVAP"+negativeControl);
                            if (negativeControl != 1){
                                userInput = userInput * -1;
                                //System.out.println("*****************NEGATIFTEN-POZITIFE"+userInput);
                            }
                            result += userInput;
                            //System.out.println("*****************RESULT-NEGATIFTEN SONRA"+result);
                        }
                        else{
                            result += userInput;
                            //System.out.println("*****************RESULT"+result);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter a number");
                    result = sc.nextDouble();
                    while (true){
                        System.out.println("Enter a number");
                        double userInput = sc.nextDouble();
                        if (userInput == 0){
                            break;
                        }
                        else if(userInput < 0){
                            System.out.println("You entered a negative number.Are u sure?");
                            System.out.println("Yes: 1, No: Any number");
                            int negativeControl = sc.nextInt();
                            if (negativeControl != 1){
                                userInput = userInput * -1;
                            }
                            result -= userInput;
                        }
                        else{
                            result -= userInput;
                        }
                    }
                    break;
                case 3:
                    result = 1;
                    while (true){
                        System.out.println("Enter a number");
                        double userInput = sc.nextDouble();
                        if (userInput == 0){
                            break;
                        }
                        else if(userInput < 0){
                            System.out.println("You entered a negative number.Are u sure?");
                            System.out.println("Yes: 1, No: Any number");
                            int negativeControl = sc.nextInt();
                            if (negativeControl != 1){
                                System.out.println(userInput);
                                userInput = userInput * -1;
                            }
                            result *= userInput;
                        }
                        else{
                            result *= userInput;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter a number");
                    result = sc.nextDouble();
                    while (true){
                        System.out.println("Enter a number");
                        double userInput = sc.nextDouble();
                        if (userInput == 0){
                            break;
                        }
                        else if(userInput < 0){
                            System.out.println("You entered a negative number.Are u sure?");
                            System.out.println("Yes: 1, No: Any number");
                            int negativeControl = sc.nextInt();
                            if (negativeControl != 1){
                                System.out.println(userInput);
                                userInput = userInput * -1;
                            }
                            result /= userInput;
                        }
                        else{
                            result /= userInput;
                        }
                    }
                default:
                    System.out.println("ok");
            }
            System.out.println("result:"+result);
        }
    }
}