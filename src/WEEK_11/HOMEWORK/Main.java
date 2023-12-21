package WEEK_11.HOMEWORK;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();


        while (true) {
            System.out.println("Yapmak istediğiniz işlemi seçin:");
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitap Bilgilerini Oku");
            System.out.println("3. Çıkış");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    main.caseOneSelected(library);
                    break;
                case 2:
                    main.caseTwoSelected(library);
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Tekrar deneyin.");
            }
        }
    }

    public void caseOneSelected(Library library) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Kitap Adı: ");
            String name = scanner.nextLine();

            System.out.println("Yazar Adı: ");
            String author = scanner.nextLine();

            System.out.println("Yayın Yılı: ");
            int yearOfPublication = scanner.nextInt();
            scanner.nextLine();

            System.out.println("ISBN: ");
            String ISBN = scanner.next();

            scanner.nextLine();

            Book newBook = new Book(name, author, yearOfPublication, ISBN);
            library.addBook(newBook);
            newBook.printBook();
        } catch (CustomException e) {
            System.err.println("Kitap ekleme hatası : " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.err.println("Hatalı giriş! Yayın yılı için bir sayı girmelisiniz.");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.err.println("Kitap ekleme hatası: " + e.getMessage());
        }
        catch (Exception e) {
            System.err.println("Beklenmeyen bir hata oluştu: " + e.getMessage());
        }
    }

    public void caseTwoSelected(Library library) {
        library.listBooks();

        System.out.println("Hangi kitabın bilgilerini okumak istiyorsunuz? (Kitap Adı): ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        for (Book book : library.getBooks()) {
            if (book.getName().equals(bookName)) {
                book.readBook();
                return;
            }
        }
    }
}
