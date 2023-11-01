package WEEK_4;

public class TimesTable {
    public static void main(String[] args) {
        final int column = 10;
        final int row = 5;
        int temp = 0;

        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= column; j++ ){
                temp = i * j;
                System.out.print(temp + "\t");
            }
            System.out.println();
        }
    }
}