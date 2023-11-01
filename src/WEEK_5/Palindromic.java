package WEEK_5;

import java.util.Scanner;
public class Palindromic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindromic palindromic = new Palindromic();

        while (true) {
            System.out.println("String:");
            String st = sc.next();
            if (st.equals("q")){
                break;
            }
            System.out.println(palindromic.palindromicControl(st));
        }

    }
    public String palindromicControl(String st) {

        if (st.length() >= 5 && st.length() <= 7) {
            for (int i = 0; i <= st.length() / 2 - 1; i++) {
                int j = st.length() - 1 - i;
                if (st.charAt(i) != st.charAt(j)) {
                    return "the word is not palindromic";
                }
            }
            return "the word is palindromic";
        } else {
            return "string length should be at least 5 and at most 7";
        }
    }
}