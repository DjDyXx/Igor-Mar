import java.util.Scanner;

/**
 * Created by Игорь on 06.10.2016.
 * Найти ближайшее к 10 из 2х заданных чисел "a" и "b". Например, среди чисел 8 и 11 ближайшее к десяти 11.
 */
public class Ex6 {
    public static void main(String[] args) {
        System.out.print("Введите число а = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Введите число b = ");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        int c = 10 - a;
        int d = 10 - b;
        if (-c < -d){
            System.out.println("Число "+ b+ " ближе к 10 чем "+a);
        }else{
            System.out.println("Число "+ a+ " ближе к 10 чем "+b);
        }
    }
}
