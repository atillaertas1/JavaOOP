package WEEK_11.HOMEWORK;

import java.io.*;

public class Book {
    private String name;
    private String author;
    private int yearOfPublication;
    private String ISBN;

    public Book(String name, String author, int yearOfPublication, String ISBN) throws CustomException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Kitap adı boş olamaz.");
        }

        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Yazar adı boş olamaz.");
        }

        if (ISBN == null || ISBN.trim().isEmpty()) {
            throw new IllegalArgumentException("ISBN boş olamaz.");
        }

        if (yearOfPublication > 2023) {
            throw new CustomException("Yayın tarihi 2023'ten büyük olamaz.");
        }

        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.ISBN = ISBN;
    }

    public void printfInfo(){
        System.out.println("-------------------------");
        System.out.println("Name: " + this.getName());
        System.out.println("-------------------------");
    }

    public void printBook(){
        String fileName = this.name + ".txt";

        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write("------------------------- \n");
            bufferedWriter.write("Name: " + this.name + "\n");
            bufferedWriter.newLine();
            bufferedWriter.write("Author: " + this.author + "\n" );
            bufferedWriter.newLine();
            bufferedWriter.write("Year Of Publication: " + this.yearOfPublication + "\n");
            bufferedWriter.newLine();
            bufferedWriter.write("ISBN: " + this.ISBN + "\n");
            bufferedWriter.write("------------------------- \n");

            System.out.println("Kitap bilgileri dosyaya başarıyla yazıldı: " + fileName);

        } catch (IOException e) {
            System.err.println("Dosya yazma hatası: " + e.getMessage());
        }
    }

    public void readBook() {
        String fileName = this.name + ".txt";

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("Kitap bilgileri dosyadan başarıyla okundu: " + fileName);

        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }

    //getters
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getISBN() {
        return ISBN;
    }

}
