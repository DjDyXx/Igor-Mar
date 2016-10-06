/**
 * Created by Игорь on 06.10.2016.
 * Даны 3 числа "a", "b" и "c". Найти максимальное из них.
 */

import java.util.Scanner;

public class Quastion {
    public static void main(String[] args) {

        System.out.print("Введите число а = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Введите число b = ");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        System.out.print("Введите число c = ");
        Scanner sc2 = new Scanner(System.in);
        int c = sc2.nextInt();
        int result;
        if (a > b) {
            if (a > c) {
                result = a;;
            }
        } else if (b > c) {
            result = b;
        } else {
            result = c;
        }
        System.out.println(result);// Почему здесь пишет что эта переменная не определенна?Пришлось в каждой писать вывод....
    }
}
