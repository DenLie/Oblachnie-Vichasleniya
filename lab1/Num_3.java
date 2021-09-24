package lab1;

import java.util.Scanner;

public class Num_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if (num > 0)
            num +=1;

        System.out.printf("Полученное число: %d \n", num);
    }
}
