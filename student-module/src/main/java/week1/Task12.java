package week1;

/**
 * 12. Определить, является ли шестизначное число "счастливым" (сумма первых трех цифр равна сумме последних трех цифр).
 * Ответ вывести в виде сообщения true/false.
 */
public class Task12 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int a = number / 1000;
        int b = number % 1000;

        if (a == b) {
            System.out.println(" True ");
        } else {
            System.out.println(" False ");
        }
    }
}


