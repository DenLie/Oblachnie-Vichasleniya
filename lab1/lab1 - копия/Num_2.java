package lab1;

import java.util.Scanner;

public class Num_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int num = in.nextInt();//123
        int number1 = num / 100;//1
        int number2 = (num / 10) % 10;//2
        int number3 = num % 10;//3
        int sum = number1 + number2 + number3;
        System.out.printf("Сумма цмфр трехзначного числа равна: %d \n", sum);
    }
}
