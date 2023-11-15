package WEEK_8;

class Student {
    String name;
    String surname;
    byte[] notes;

    public Student(String name, String surname, byte[] notes){
        this.name = name;
        this.surname = surname;
        this.notes = notes;
    }

    public void printStudentInfo(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Notes: ");
        for (byte note : notes){
            System.out.print(note + " - ");
        }
        System.out.println();
        System.out.println("----------------------------------");
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Student student_1 = new Student("Atilla","Ertas",new byte[]{50,60,70});
        Student student_2 = new Student("Ahmet", "Yılmaz",new byte[]{60,90,100});

        Student[] students = {student_1, student_2};

        for (Student student : students){
            student.printStudentInfo();
        }
    }
}