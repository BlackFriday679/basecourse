package week1;

/**
 * 10. Дано трехзначное число. Определить:
 * а) верно ли, что все его цифры одинаковые;
 * б) есть ли среди его цифр одинаковые.
 *
 * Взависимости от результата сделать вывод "Все цифры одинаковые" / "Некоторые цифры одинаковые" / "Нету одинаковых цифр"
 */
public class Task10 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int a = number % 10;
        int b = (number / 10) % 10;
        int c = (number / 10) / 10;

        if (a == b && a == c) {
            System.out.println("Все цифры одинаковые" );
        } else if (a == b || a == c || b == c){
            System.out.println("Некоторые цифры одинаковые") ;
        } else {
            System.out.println("Нету одинаковых цифр");
        }
    }
}

