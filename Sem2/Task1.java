import java.util.*;
public class Task1 {
public static void main(String[] args) throws InvalidNumberException {
    Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        checkNumber(number);
    }catch (InvalidNumberException e){
        System.out.println("Ошибка: " + e.getMessage());
    }
}

public static void checkNumber(int number) throws InvalidNumberException{
    if (number <= 0)
        throw new InvalidNumberException("Некорректное число");
    System.out.println("Число корректно");
}

static class InvalidNumberException extends Exception {
    public InvalidNumberException(String message){
        super(message);
    }
}

}