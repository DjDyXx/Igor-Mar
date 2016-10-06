/**
 * Created by Игорь on 06.10.2016.
 * Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно, что за 1 день ее стоимость 40 грн.
 * Причем, если съемщик прожил в ней больше 5 дней, он получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн.
 */

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во дней на которое будете арендовать квартиру :");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int sum = 40;
        int result;
        if (days > 7) {
            result = (sum * days) - 50;
        }else if (days > 5) {
            result = (sum * days) - 20;
        } else
            result = sum * days;
        System.out.print("Цена аренды за заданное число дней = " + result);
    }
}
