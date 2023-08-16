import java.io.*;
import java.util.*;

public class PasswordVerifier {
    public static void main(String[] args) {
        String password = "12345689";
        try {
            verifyPassword(password);
            System.out.println("Пароль прошел проверку");
        } catch (Exception e) {
            System.out.println("Неправильный пароль: " + e.getMessage());
        }
    }
    public static void verifyPassword(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception ("Пароль должен быть не менее 8 символов");
        }
        boolean hasDigit = false;
        boolean hasUppercase = false;
        for (char c : password.toCharArray()){
            if (Character.isDigit(c)){
                if (Character.isDigit(c)) {
                    hasDigit = true;

                } 
                else if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                }
            }
        }
        if (!hasDigit) {
            throw new Exception("Пароль должен содержать хотя бы одну цифру");
        }
        if (!hasUppercase) {
            throw new Exception("Пароль должен содержать хотя бы одну заглавную букву");
        }
        }

    
}