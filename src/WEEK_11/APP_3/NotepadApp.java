package WEEK_11.APP_3;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class NotepadApp {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Notepad Uygulaması");
            System.out.println("1. Yeni metin dosyası oluştur");
            System.out.println("2. Metin dosyasını oku");
            System.out.println("3. Metin dosyalarını listele");
            System.out.println("4. Metin dosyasını güncelle");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminizi yapınız: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    createNewFile();
                    break;
                case 2:
                    readFile();
                    break;
                case 3:
                    listFiles();
                    break;
                case 4:
                    updateTextFile();
                    break;
            }

        }
    }

    private static void createNewFile() throws FileNotFoundException {

        try {
            System.out.println("Oluşturulacak metin dosyasının adını girin: ");
            String filename = new Scanner(System.in).nextLine();
            System.out.println(filename);
            PrintWriter printWriter = new PrintWriter(filename + ".txt");
            printWriter.close();
            System.out.println("File created!");
        }
        catch (FileNotFoundException exception){
            System.err.println("Hata: Dosya oluşturulurken bir sorun oluştu. Geçersiz dosya adı veya yol." + exception.getMessage());
        }
    }

    private static void readFile(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Okumak istediginiz dosya ismi :");
            String filename = new Scanner(System.in).nextLine();
            String fullPath = System.getProperty("user.dir") + File.separator + filename + ".txt";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fullPath));

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (IOException exception) {
            System.err.println("Hata: Dosya okunurken bir sorun oluştu. Geçersiz dosya adı veya yol." + exception.getMessage());
        }
    }

    private static void listFiles(){
        String directoryPath = System.getProperty("user.dir") + File.separator;
        //System.out.println(directoryPath);
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        assert files != null;
        File[] txtFiles = Arrays.stream(files)
                .filter(file -> file.isFile() && file.getName().toLowerCase().endsWith(".txt"))
                .toArray(File[]::new);
        for (File txtFile : txtFiles) {
            System.out.println(txtFile.getName());
        }
    }

    private static void updateTextFile() {
        System.out.print("Güncellenecek metin dosyasının adını girin: ");
        String fileName = new Scanner(System.in).nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName + ".txt"));
            String line;

            System.out.println("Metin dosyasının mevcut içeriği:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

            PrintWriter writer = new PrintWriter(new FileWriter(fileName + ".txt", true));
            System.out.println("Yeni içeriği girin (Çıkış için 'q' tuşuna basın):");

            while (true) {
                String input = new Scanner(System.in).nextLine();
                if (input.equals("q")) {
                    break;
                }
                writer.println(input);
            }

            writer.close();
            System.out.println(fileName + ".txt güncellendi.");
        } catch (IOException e) {
            System.err.println("Hata" + e.getMessage());
        }
    }



}
