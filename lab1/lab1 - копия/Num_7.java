package lab1;

import java.util.Scanner;

public class Num_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите код города: ");
        int num = in.nextInt();
        switch(num){
            case 905:
                System.out.print("Москва. Стоимость разговора: 41.5");
                break;
            case 194:
                System.out.print("Ростов. Стоимость разговора: 19.8");
                break;
            case 491:
                System.out.print("Краснодар. Стоимость разговора: 26.9");
                break;
            case 800:
                System.out.print("Киров. Стоимость разговора: 50");
                break;
        }
    }
}
