/**
 * Created by Игорь on 05.10.2016.
 * Написать функцию делится ли число "a" на число "b" без остатка.
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Введите число а : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите число b : ");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        int c = a / b;
        if (a % b == 0) {
            System.out.println("Число полусилось без остатка : " + c);
        } else {
            System.out.println("Число не делится без остатка!");
        }
    }
}
