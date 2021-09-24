package lab1;

public class Num_9 {
    public static void main(String[] args) {
        int T[] = new int[]{15,10,51,6,5,3,10,-34,0,32,56,12,24,52};
        int n = T.length;
        int b;
        for (int i = 0; i < n/2; i++) {
            b = T[i];
            T[i] = T[n - i - 1];
            T[n - i - 1] = b;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(T[i] + " ");
        }
    }
}
