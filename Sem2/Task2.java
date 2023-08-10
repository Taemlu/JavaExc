
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            double number1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            double number2 = scanner.nextInt();
            checkZero(number1, number2);
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void checkZero(double number1, double number2) throws DivisionByZeroException {
            if (number2 == 0)
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            System.out.println(number1 + " / " + number2 + " = " + number1 / number2);

    }

        static class DivisionByZeroException extends Exception {
            public DivisionByZeroException(String message) {
                super(message);
            }
        }
    
}
