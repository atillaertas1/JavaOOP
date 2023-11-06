package WEEK_7;

public class Student {
    String name;
    String surname;
    int[] notes;

    public Student(String name, String surname, int[] notes){
        this.name = name;
        this.surname = surname;
        this.notes = notes;
    }

    double avaregeCalculator(int[] notes){
        int sum = 0;
        int length = notes.length;
        for (int note : notes){
            sum += note;
        }
        return (double) sum / length;
    }
    public static void main(String[] args) {
        int[] studentNotes = {10,20,30,40};
        Student student1 = new Student("Atilla","Ertas", studentNotes);
        System.out.println(student1.name+ "'s average :" + student1.avaregeCalculator(studentNotes));
        studentNotes = new int[]{50, 100, 50, 60};
        Student student2 = new Student("Ahmet","Türkoğlu",studentNotes);
        System.out.println(student2.name+ "'s average :" + student2.avaregeCalculator(studentNotes));
        studentNotes = new int[]{80,90,10,50};
        Student student3 = new Student("Alperen", "Sengun",studentNotes);
        System.out.println(student3.name+ "'s average :" + student3.avaregeCalculator(studentNotes));
    }
}