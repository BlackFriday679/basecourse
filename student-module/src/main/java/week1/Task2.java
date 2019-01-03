package week1;

/**
 * 2. Есть три числа, нужно вывести на консоль наибольшее
 */
public class Task2 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a > b && a > c) {
            System.out.println(a + " is the biggest number.");
        } else if (b > a && b > c) {
            System.out.println(b + " is the biggest number.");
        } else {
            System.out.println(c + " is the biggest number.");
        }

        if (a < b && a < c) {
            System.out.println(a + " is the smallest number.");
        } else if (b < a && b < c) {
            System.out.println(b + " is the smallest number.");
        } else {
            System.out.println(c + " is the smallest number.");
        }
    }
}
