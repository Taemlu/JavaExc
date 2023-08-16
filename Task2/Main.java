package Task2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String sourceFilePath = "Task2/file.txt";
        String destinationFilePath = "Task2/file.txt";
        try {
            //чтение файла
            String fileContent = FileManager.readFile(sourceFilePath);
            System.out.println("Содержимое файла: " + fileContent);

            //запись файла
            String newContent = "Новое содержимое файла";
            FileManager.writeFile(sourceFilePath, newContent);
            System.out.println ("Файл успешно записан");

            //копирование файла
            FileManager.copyFile(sourceFilePath, destinationFilePath);
            System.out.println ("Файл успешно скопирован");



        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
            
        }
    }
}
