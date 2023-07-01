import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        
    }

    public static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите дробное число: ");
    
        do {
            try {
                float x = scanner.nextFloat();
                System.out.println("Вы ввели число: " + x);

                scanner.close();
                return x;

            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введено некорректное значение!");
                scanner.next();
            }
        } while (true);
    }

    public static void secondCase() {
        try {
            int d = 0;
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            double catchedRes1 = intArray[8] / d;

            System.out.println("catchedRes1 = " + catchedRes1);

        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
    
    public static void thirdCase() throws Exception {
        try {
        int a = 90;
        int b = 3;

        System.out.println(a / b);

        printSum(23, 234);

        int[] abc = { 1, 2 };
        abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
        }
        
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

    public static void stringIsNotNull() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        String str = scanner.nextLine();

        if (str == "") {
            scanner.close();
            throw new NullPointerException("Нельзя вводить пустую строку");
        }

        System.out.println("Вы ввели строку: " + str);
        scanner.close();
    }
}