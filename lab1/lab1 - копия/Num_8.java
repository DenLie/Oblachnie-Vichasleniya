package lab1;

public class Num_8 {
    public static void main(String[] args) {
        int T[] = new int[]{1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
        int max = -100000;
        int sum_Pol = 0;
        int sum_ChO = 0;
        int Chetchik_pol = 0;
        double Sr_Znach = 0;
        double Count_otr = 0;

        for (int i = 0; i < T.length; i++) {
            if (T[i] > max)
                max = T[i];

        }
        System.out.printf("Максимальное число: %d \n", max);

        for (int i = 0; i < T.length; i++) {
            if (T[i] > 0) {
                sum_Pol += T[i];
                Chetchik_pol += 1;
            }
        }
        System.out.printf("Сумма положительных элементов: %d \n", sum_Pol);
        System.out.printf("Количество положительных элементов: %d \n", Chetchik_pol);

        for (int i = 0; i < T.length; i++) {
            if (T[i] < 0) {
                Count_otr +=1;
                Sr_Znach += T[i];

                if (T[i] % 2 == 0)
                    sum_ChO += T[i];
            }

        }
        System.out.printf("Сумма четных отрицательных элементов: %d \n", sum_ChO);
        Sr_Znach /= Count_otr;
        System.out.print("Среднее арифмитическое значение отрицательных элементов: ");
        System.out.print(Sr_Znach);
    }
}
