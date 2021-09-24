package lab1;
import java.util.Scanner;

public class Num_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        System.out.printf("Последняя цифра введеного числа: %d \n", num % 10);
    }
}
