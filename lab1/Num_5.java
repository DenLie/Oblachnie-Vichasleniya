package lab1;

import java.util.Scanner;

public class Num_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (num1 < num2) {
            if (num1 < num3)
                System.out.printf("Минимальное число: %d \n", num1);
            else
                System.out.printf("Минимальное число: %d \n", num3);
        } else
        if (num2 < num3)
            System.out.printf("Минимальное число: %d \n", num2);
        else
            System.out.printf("Минимальное число: %d \n", num3);
    }
}
