package WEEK_8;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        final byte STUDENT_NUMBER = 5;
        byte[] studentNotes = new byte[STUDENT_NUMBER];
        byte[] sortedLowestToLargest;
        byte[] sortedLargestToLowest;

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < studentNotes.length; i++){
            byte input = scanner.nextByte();
            studentNotes[i] = input;
            sum += input;
        }

        //printing notes
        for (int i = 0; i < studentNotes.length; i++) {
            System.out.printf("Note %d: %d\n",(i+1),studentNotes[i]);
        }

        //notes average
        System.out.println("Average: "+(double)sum/STUDENT_NUMBER);


        sortedLowestToLargest = Arrays.copyOf(studentNotes, studentNotes.length);
        //insertion sort smallest to largest
        for (int j = 1; j < studentNotes.length; j++) {
            int key = sortedLowestToLargest[j];
            int i = j-1;
            while ( (i > -1) && ( sortedLowestToLargest [i] > key ) ) {
                sortedLowestToLargest [i+1] = sortedLowestToLargest [i];
                i--;
            }
            sortedLowestToLargest[i+1] = (byte) key;
        }


        sortedLargestToLowest = Arrays.copyOf(studentNotes, studentNotes.length);
        //insertion sort largest to smallest
        for (int j = 1; j < studentNotes.length; j++) {
            int key = sortedLargestToLowest[j];
            int i = j - 1;
            while ((i > -1) && (sortedLargestToLowest[i] < key)) {
                sortedLargestToLowest[i + 1] = sortedLargestToLowest[i];
                i--;
            }
            sortedLargestToLowest[i + 1] = (byte) key;
        }

        System.out.println("ORIGINAL ARRAY");
        for (byte note: studentNotes){
            System.out.printf(note + ",");
        }
        System.out.println();

        System.out.println("LOWEST TO LARGEST ARRAY");
        for (byte note : sortedLowestToLargest){
            System.out.printf(note + ",");
        }
        System.out.println();

        System.out.println("LARGEST TO LOWEST ARRAY");
        for (byte note : sortedLargestToLowest){
            System.out.printf(note + ",");
        }
        System.out.println();

        byte temp = studentNotes[0];
        for (byte studentNote : studentNotes) {
            if (studentNote > temp) {
                temp = studentNote;
            }
        }
        System.out.println("Largest : " + temp);

        temp = studentNotes[0];
        for(byte studentNote: studentNotes) {
            if (studentNote < temp) {
                temp = studentNote;
            }
        }
        System.out.println("Lowest : " + temp);

    }
}