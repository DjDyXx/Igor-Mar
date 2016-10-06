/**
 * Created by Игорь on 05.10.2016.
 * Поезд движется со скоростью "V" км/ч, найти какое он проехал расстояние за время "t".
 */
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Введите с какой скоростью движется поезд: ");
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        System.out.print("Введите время которое движется поезд: ");
        Scanner sc1 = new Scanner(System.in);
        int t = sc1.nextInt();
        System.out.println("Поезд проехал расстояние : "+ V*t + " км");
    }
}
