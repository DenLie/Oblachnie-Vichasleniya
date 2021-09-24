package lab1;

import java.util.ArrayList;
import java.util.List;

public class Num_10 {
    public static void main(String[] args) {
        int[] a = new int[] {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52};
        List<Integer> listA = new ArrayList<Integer>();
        int count = 0;


        for(int i = 0; i < a.length; i++) {
            if(a[i]==0)
                count++;
            else
                listA.add(a[i]);
        }

        while (count>0){
            listA.add(0);
            count--;
        }
        for(int i = 0; i < a.length; i++) {
            a[i]=Integer.valueOf(listA.get(i));
            System.out.print(a[i]+ " ");
        }


    }
}
