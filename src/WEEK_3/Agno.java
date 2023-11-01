package WEEK_3;

import java.util.Scanner;
public class Agno {
    public static void main(String[] args) {
        int courseCredit = 0;
        int courseCount = 1;
        int totalCredit = 0;
        double gradeValue;
        double courseAGNO = 0;
        boolean letterGradeControl = false;
        boolean control = true;
        String letterGrade;
        String continueControl;

        Scanner sc = new Scanner(System.in);

        while (control){
            // checking courseCredit is it int
            if(!letterGradeControl) {
                System.out.print("Enter the course credit: ");
                if (sc.hasNextInt()) {
                    courseCredit = sc.nextInt();
                } else {
                    System.out.println("Please enter a valid course credit!");
                    sc.nextLine();
                    continue;
                }
                sc.nextLine(); // clear the 'enter'
                if (courseCredit <= 0) {
                    System.out.println("Please enter a valid course credit!");
                    continue;
                }
            }
            System.out.print("Enter the letter grade: ");
            letterGrade = sc.nextLine();

            switch (letterGrade){
                case "AA": gradeValue = 4.00; break;
                case "BA": gradeValue = 3.50; break;
                case "BB": gradeValue = 3.00; break;
                case "CB": gradeValue = 2.50; break;
                case "CC": gradeValue = 2.00; break;
                case "DC": gradeValue = 1.50; break;
                case "DD": gradeValue = 1.00; break;
                case "FD": gradeValue = 0.50; break;
                case "FF": gradeValue = 0.00; break;
                default:
                    System.out.println("Invalid letter grade!");
                    letterGradeControl = true;
                    continue;
            }

            letterGradeControl = false;
            totalCredit += courseCredit;
            courseAGNO += (gradeValue * courseCredit);
            System.out.println(courseCount + " course information entered.Do you want to continue? " + courseCredit + letterGrade);
            System.out.println("Press 'h' or 'H' if you do not want to continue. Press any key if you want to continue.");
            continueControl = sc.nextLine();

            if (continueControl.equalsIgnoreCase("h")){
                double AGNO = (courseAGNO) / totalCredit;
                System.out.println("You've taken a total of " + courseCount + " courses");
                System.out.println("Your AGNO: " + String.format("%.2f",AGNO));
                if (AGNO >= 3.00 && AGNO <= 3.49){
                    System.out.println("You graduated with \" ONUR BELGESI \"");
                }
                if (AGNO >= 3.50 && AGNO <= 4.00){
                    System.out.println("You graduated with \" YUKSEK ONUR BELGESI \"");
                }
                control = false;
            }
            else{
                courseCount++;
            }
        }
    }
}