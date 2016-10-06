import java.util.Scanner;

/**
 * Created by Игорь on 05.10.2016.
 * Пользователь вводит длины катетов прямоугольного треугольника. Написать функцию, которая вычислит и выведет в консоль площадь треугольника.
 */
public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Введите катет a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Введите катет b: ");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        System.out.println("Площадь прямоугольного треугольника = "+ (a*b)/2);
    }
}
