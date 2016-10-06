/**
 * Created by Игорь on 06.10.2016.
 * Найти результат операции:
 |-  x * x; если x < 9
 result = |   x + 9; если x = 9
 |-  x - 8; если x > 9

 */
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Введите число х : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result;
        if (x < 9 ){
            result = - x * x;
        }else if( x == 9) {
            result = x + 9;
        }else{
            result = - x - 8;
        }
        System.out.println("Результат = "+result);
    }
}
