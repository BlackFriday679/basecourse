package week1;

import java.util.Scanner;

/**
 * 9. Написать программу вычисления идеального веса пользователя.
 * Выдать рекомендации о необходимости поправиться либо похудеть.
 */
public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your weight");
        double weight = scanner.nextDouble();

        System.out.println("Please enter your growth");
        double growth = scanner.nextDouble();

        double a = growth - 100;
        if(a > weight) {
            System.out.println("You need to gain weight " + (a - weight));
        } else if(a < weight) {
            System.out.println("You need to lose weight " + (weight - a));
        } else {
            System.out.println("Your weight is perfect " );
        }
    }
}

