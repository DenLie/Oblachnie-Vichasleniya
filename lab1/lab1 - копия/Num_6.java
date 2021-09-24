package lab1;

import java.util.Scanner;

public class Num_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if (num == 0)
            System.out.print("Нулевое число");
        else if (num > 0) {
            if (num % 2 == 0)
                System.out.print("Положительное четное число");
            else
                System.out.print("Положительное нечетное число");

        } else {
            if (num % 2 == 0)
                System.out.print("Отрицательное четное число");
            else
                System.out.print("Отрицательное нечетное число");
        }
    }
}
