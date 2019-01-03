package week1;

/**
 * 8. Вычислить стоимость покупки с учетом скидки. Скидка в 10% предоставляется, если сумма покупки превышает 1000 гривен.
 */
public class Task8 {
    public static void main(String[] args) {
        int purchase = Integer.parseInt(args[0]);

//   Работает нормально у визуализаторе, здесь пишет ошибку

        if (purchase >= 1000) {
            double a = purchase * 0.1;
            System.out.println("Вам предоставлена скидка в размере 10 % - " + a);
        } else {
            System.out.println("Еще немного и Вы получите скидку, еще осталось " + (1000- purchase));
        }
    }
}
