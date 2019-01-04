package week1;

/**
 * 15. Посчитать сколько раз встречается символ 5 в заданном числе (число трехкратное)
 *      435  -   1
 *      505  -   2
 *      555  -   3
 *      305  -   1
 */
public class Task15 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int one = number % 10;
        int two = (number/10) % 10;
        int three = number / 100;

        int k = 0;

        if(one == 5){
            k++;
        }
        if(two == 5){
            k++;
        }
        if(three == 5){
            k++;
        }

        System.out.println(k);

    }
}
