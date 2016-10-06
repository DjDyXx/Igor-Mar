/**
 * Created by Игорь on 06.10.2016.
 * Даны 3 числа "a", "b" и "c". Найти максимальное из них.
 */

import java.util.Scanner;

public class Ex5 {
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
        if (a > b) {
            if (a > c) {
                System.out.println("Максимальное число : " + a);
            }
        } else if (b > c) {
            System.out.println("Максимальное число : " + b);
        } else {
            System.out.println("Максимальное число : " + c);
        }
    }
}
