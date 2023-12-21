package WEEK_11.APP_2;

public class Student {
    protected String name;
    protected String studentNumber;
    protected double averageNotes;

    protected boolean errorState;

    public Student(String name, String studentNumber, double averageNotes){
        try {
            if (averageNotes < 0) {
                throw new IllegalArgumentException("Hata: Not ortalaması negatif bir değer olamaz.");
            }

            if (name.matches(".*\\d.*")) {
                throw new IllegalArgumentException("Hata: İsim değişkeni sayı içermemeli.");
            }
            this.name = name;
            this.studentNumber = studentNumber;
            this.averageNotes = averageNotes;
        }
        catch (IllegalArgumentException exception){
            System.err.println("Hata: " + exception.getMessage());
            this.errorState = true;
        }
        catch (Exception exception){
            System.err.println("UNKNOWN ERROR" + exception.getMessage());
            this.errorState = true;
        }
    }

    protected void displayInfo(){
        if(errorState){
            System.out.println("Constructor inputları kotnrol et!");
        }else{
            System.out.println("Name: " + this.name);
            System.out.println("Student Number: " + this.studentNumber);
            System.out.println("Average: " + this.averageNotes);
        }

    }

}
